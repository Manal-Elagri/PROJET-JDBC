package presentation;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import dv1.*;
public class MaClassePrincipale {
    public static void main(String[] args) {
         try (MySQLConnection mysqlconnexion = new MySQLConnection("jdbc:mysql://localhost:3306/devoire", "root", "")) {
	        
        ExoJDBC exo = new ExoJDBC(mysqlconnexion);
        //ExoJDBC1 exojdbc = new ExoJDBC1("alami", "Lundi", 5);
        
        exo.afficherMAXnbscripts();
        exo.afficherSUBnbscripts();
        exo.afficherTotalScriptsParSemaine();
        exo.afficherTotalScriptsParDev("WAFI");
       exo.requeteLibre();
        } catch (Exception e) {
	            e.printStackTrace();
	        }
    }  
}



