import java.util.Comparator;

public class EmployeComparator implements Comparator<Employe> {
    @Override
    public int compare(Employe e1, Employe e2) {
        int nameComparison = e1.getNom().compareTo(e2.getNom());
        if (nameComparison != 0)
            return nameComparison;

        int departmentComparison = e1.getDepartement().compareTo(e2.getDepartement());
        if (departmentComparison != 0)
            return departmentComparison;

        return Integer.compare(e1.getGrade(), e2.getGrade());
    }
}