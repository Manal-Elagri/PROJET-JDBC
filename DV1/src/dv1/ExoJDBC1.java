package dv1;
public class ExoJDBC1 {
    
    private String Developpeurs;
    private String Jour;
    private int NbScripts;
    public ExoJDBC1(String Developpeurs, String Jour, int NbScripts) {
        this.Developpeurs = Developpeurs;
        this.Jour = Jour;
        this.NbScripts = NbScripts;
    }
    public String getDeveloppeurs() {
        return Developpeurs;
    }

    public String getJour() {
        return Jour;
    }
    public int getNbScripts() {
        return NbScripts;
    }
    public void setDeveloppeurs(String Developpeurs) {
        this.Developpeurs = Developpeurs;
    }

    public void setJour(String Jour) {
        this.Jour = Jour;
    }

    public void setNbScripts(int NbScripts) {
        this.NbScripts = NbScripts;
    }

    @Override
    public String toString() {
        return "ExoJDBC1{" + "Developpeurs=" + Developpeurs 
                + ", Jour="  + Jour + ", NbScripts=" + NbScripts + '}';
    } 
}
