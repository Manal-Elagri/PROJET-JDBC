package beans;
public class Site {
    
    private int id;
    private String nom;
    public Site(String nom) {
        this.nom = nom;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public int getId() {
        return id;
    }
    public String getNom() {
        return nom;
    }
        
}
