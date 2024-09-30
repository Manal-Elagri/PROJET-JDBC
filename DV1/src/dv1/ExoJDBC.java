package dv1;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.Scanner;
import java.sql.ResultSetMetaData;
import dv1.ExoJDBC1;
public class ExoJDBC {
    
        Statement stmt;
	MySQLConnection con;

	    public ExoJDBC(MySQLConnection con) {
	        this.con = con;
	        stmt = con.getStmt();
	    }           
  public void afficherMAXnbscripts() {
	try {
	ResultSet result = stmt.executeQuery("SELECT MAX(NbScripts) AS MaxScripts, Jour, Developpeurs " 
                +"FROM devdata\n" +"GROUP BY Jour");
   System.out.println("************** Le nombre Max des NBScripts par rapport à les jours *************");
	             
        while (result.next()) {
	System.out.println("------------------------------------------------------------\n");
        int maxScripts;
        //String Jour;
        //String Developpeurs;
        System.out.println("-Le nom du Developpeurs :"+ result.getString("Developpeurs"));
	System.out.println("-Le jour du NBScripts :"+ result.getString("Jour"));
	System.out.println("-Le nombre du NBScripts :"+ result.getInt("MaxScripts"));
	}
	} catch (SQLException e) {
	    e.printStackTrace();
	}
	    }   
   
   /***************************************************************///////////////
   
    public void afficherSUBnbscripts() {
	try {
	ResultSet result = stmt.executeQuery("SELECT Developpeurs, Jour, sum(NBScripts) as c " +                        
                "FROM devdata "  +
                        "GROUP BY Developpeurs "  +
                          "ORDER BY c DESC" );
        System.out.println("***La Liste des personnes triée dans "
                + "l’ordre décroissant selon leur nombre de scripts***");
	             
        while (result.next()) {
	System.out.println("-------------------------------------------------------\n");
        int c;
       System.out.println("-Le nom du Developpeurs :"+ result.getString("Developpeurs"));
       System.out.println("-Le jour du NBScripts :"+ result.getString("Jour"));
       System.out.println("-Le nombre du NBScripts :"+ result.getInt("C"));
	}
	} catch (SQLException e) {
	    e.printStackTrace();
	}
	    } 
    
            /******************************PARTIE 2 ********************************/
            
            
        public void afficherTotalScriptsParSemaine() {
        try {
            ResultSet result = stmt.executeQuery("SELECT SUM(NbScripts) AS TotalScripts,"
                    + " WEEK(Jour) AS NumSemaine FROM devdata GROUP BY WEEK(Jour);");
            System.out.println("********Le nombre Total des Scripts par Semaine *************");
            while (result.next()) {
                int totalScripts = result.getInt("TotalScripts");
               int numsemaine = result.getInt("NumSemaine");
               System.out.println("Semaine: " + numsemaine);
                System.out.println("Nombre Total de Scripts: " + totalScripts);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void afficherTotalScriptsParDev(String nomdev) {
        try {
            ResultSet result = stmt.executeQuery("SELECT SUM(NbScripts) AS TotalScripts "
                    + "FROM devdata WHERE Developpeurs = '" + nomdev + "';");
            System.out.println("***Le nombre Total des Scripts par Developpeur***");
            if (result.next()) {
                System.out.println("-------------------------------------------------------\n");
                int totalScripts = result.getInt("TotalScripts");
                System.out.println("Développeur: " + nomdev);
                System.out.println("Nombre Total de Scripts: " + totalScripts);
            } else {
                System.out.println("Aucun script trouvé pour le développeur: " + nomdev);
            }   
        } catch (SQLException e) {
            e.printStackTrace();
        }}
    
    
         /********************Partie 3**********************/
            
         public void requeteLibre() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Entrez votre requête SQL : ");
            String sql = scanner.nextLine();
            if (sql.trim().toUpperCase().startsWith("SELECT")) {
                ResultSet result = stmt.executeQuery(sql);
                ResultSetMetaData metaData = result.getMetaData();
                // L' Affichage du nombre de colonnes dans la table de base de donnée
                int nombre_colonne = metaData.getColumnCount();
                System.out.println("Le nombre de colonnes est : " + nombre_colonne);
                // L'Affichage des noms et des types de données des colonnes dans la table de base de donnée
                for (int i = 1; i <= nombre_colonne; i++) {
                    String nom_colonne = metaData.getColumnName(i);
                    String type_colonne = metaData.getColumnTypeName(i);
                    System.out.println("Colonne " + i + ": " + nom_colonne + " (Type: " + type_colonne + ")");
                }
                // L'Affichage du contenu de la table de base de donnée
                while (result.next()) {
                    for (int i = 1; i <= nombre_colonne; i++) {
                        System.out.print(result.getString(i) + " ");
                    }
                    System.out.println();
                }
            } else {
                int nbr_ligne = stmt.executeUpdate(sql);
                System.out.println("Le nombre de lignes modifiés est: " + nbr_ligne);
            }
         
    }catch (SQLException e) {
            e.printStackTrace();
        }
                      
}
}
      