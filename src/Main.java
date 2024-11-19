import java.util.*;

public class Main {
    public static void main(String[] args) {


        List<Employe> newList = new ArrayList<Employe>();
       SocieteArrayList S= new SocieteArrayList();
        S.ajouterEmploye(new Employe(1, "John", "Doe", 5, "IT"));
        S.ajouterEmploye(new Employe(395, "John", "Adams", 4, "Finance"));
        S.ajouterEmploye(new Employe(25, "Jane", "Smith", 3, "HR"));
        S.ajouterEmploye(new Employe(42, "Alice", "Johnson", 2, "IT"));
        System.out.println("non sorted list :\n");
        S.displayEmploye();
        System.out.println("sorted list with id:\n");
        S.trierEmployeParId();
        S.displayEmploye();
        //System.out.println(newList);
        System.out.println("sorted list with comparator  :\n");
        S.trierEmployeParNomDépartementEtGrade();
        //Collections.sort(newList, new EmployeComparator());
        S.displayEmploye();
       /* Set<Employe> newHashSet = new HashSet<>();
        Set<Employe> newTreeSet = new TreeSet<>();*/

    }}

