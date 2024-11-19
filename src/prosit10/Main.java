package prosit10;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        DepartementHashSet DepHash= new DepartementHashSet();
        Departement d1 = new Departement(1,"IT",99);
        Departement d2 = new Departement(2,"finance",9);
        DepHash.ajouterDepartement(d1);
        DepHash.ajouterDepartement(d2);
        DepHash.displayDepartement();
        DepHash.trierDepartementById();
        DepHash.supprimerDepartement(d1);

    }
}
