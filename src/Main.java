import java.util.*;

public class Main {
    public static void main(String[] args) {


        List<Employe> newList = new ArrayList<Employe>();
        Employe e1 = new Employe(11, "yasmine", "chahbani", 20, "IT");
        Employe e4 = new Employe(2, "yasmine", "chahbani", 20, "IT");

        Employe e2 = new Employe(10, "ahmed", "benMohammed", 20, "IT");

        newList.add(e1);
        newList.add(e2);
        newList.add(e4);
        System.out.println(newList);
        Collections.sort(newList);
        System.out.println(newList);
        Collections.sort(newList, new EmployeComparator());
        System.out.println(newList);

    }}

