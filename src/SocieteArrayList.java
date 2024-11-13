import java.time.temporal.Temporal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class SocieteArrayList implements Gestion<Employe> {
    ArrayList<Employe>employeeList = new ArrayList<Employe>();
    public void ajouterEmploye(Employe e) {
Iterator<Employe> it=employeeList.iterator();
if (!rechercherEmploye(e))
{
    employeeList.add(e);
}

    }

    public boolean rechercherEmploye(String nom) {

Iterator<Employe> it = employeeList.iterator();
while (it.hasNext())
{
    Employe emp = it.next();
    if (emp.getNom().equals(nom)) {
        return true;
    }
}
return false;
    }

    public boolean rechercherEmploye(Employe e) {
        Iterator<Employe> it = employeeList.iterator();
        while (it.hasNext()) {  //tant que tableau mezel ma kmelch
            Employe emp = it.next();
            if (emp.getNom().equals(e.getNom())) {
                return true;
            }
        }
        return false; // If no match is found after checking all employees, return false
    }



    public void supprimerEmploye(Employe e) {
        Iterator<Employe> it = employeeList.iterator();
        if(rechercherEmploye(e))
        employeeList.remove(e);

    }

    public void displayEmploye() {
        Iterator<Employe> it = employeeList.iterator();
        while (it.hasNext()) {
            Employe emp = it.next();
            System.out.println(emp.toString());
        }

    }

    public void trierEmployeParId() {
        Collections.sort(employeeList);

    }

    public void trierEmployeParNomDépartementEtGrade() {

    }
}

