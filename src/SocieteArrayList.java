import java.time.temporal.Temporal;
import java.util.*;
public class  SocieteArrayList implements Gestion<Employe> {
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
            if (emp.getId()==(e.getId())) {
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
    public void sort(Comparator<Employe> c) {
        // Simple Bubble Sort using the comparator
        for (int i = 0; i < employeeList.size() - 1; i++) {
            for (int j = i + 1; j < employeeList.size(); j++) {
                if (c.compare(employeeList.get(i), employeeList.get(j)) > 0) {
                    // Swap the elements if they are in the wrong order
                    Employe temp = employeeList.get(i);
                    employeeList.set(i, employeeList.get(j));
                    employeeList.set(j, temp);
                }
            }
        }
    }

    public void trierEmployeParNomDépartementEtGrade() {
     EmployeComparator EC = new EmployeComparator();
     sort(EC);
    }

}

