package demo;

import beans.*;
import static beans.Test.load;
import static beans.Test.save;

public class Demo {

    public static void main(String[] args) {
        
        //insertion des données
    /*   save(new Site("SAFI"));
       save(new Site("MARRAKECH"));
       save(new Site ("EL JADIDA"));*/
        
        //récupération des données
        load();
        
    }

}
