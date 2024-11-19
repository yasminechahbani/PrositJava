package prosit10;
import java.util.*;
public class DepartementHashSet implements LDepartement<Departement> {

Set<Departement> deps = new HashSet<Departement>();

    @Override
    public void ajouterDepartement(Departement departement) {
        if(!rechercherDepartement(departement))
    deps.add(departement);
    }

    @Override
    public boolean rechercherDepartement(String nom) {
        Iterator<Departement> it = deps.iterator();
        while(it.hasNext())
        {
            if(it.next().getNomDep().equals(nom));
            return true;
        }
        return false;
    }

    @Override
    public boolean rechercherDepartement(Departement departement) {
        Iterator<Departement> it = deps.iterator();
        while(it.hasNext())
        {
            if(it.next().getId()==departement.getId());
            return true;
        }
        return false;
    }

    @Override
    public void supprimerDepartement(Departement departement) {
    if(rechercherDepartement(departement))
    {
        deps.remove(departement);
    }
    }

    @Override
    public void displayDepartement() {

        Iterator<Departement> it = deps.iterator();
        while(it.hasNext())
        {
            Departement depa=it.next();
            System.out.println(depa.toString());
        }


    }

    @Override
    public TreeSet<Departement> trierDepartementById() {

        TreeSet<Departement> sortedDeps = new TreeSet<Departement>(deps);
        return sortedDeps;

    }
}
