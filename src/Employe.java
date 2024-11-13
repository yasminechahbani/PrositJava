import java.util.Comparator;

public class Employe implements Comparable<Employe>{

private final int id;
private final String nom;
private final String prenom;
private int grade;
private String Departement;



    public Employe() {
        this.id = 0;
        this.nom = "";
        this.prenom = "";
        this.grade = 0;
        this.Departement = "";
    }

    public Employe(int id, String nom, String prenom, int grade,String Departement) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.grade = grade;
        this.Departement = Departement;
    }

    // Getters et Setters
    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getGrade() {
        return grade;
    }
    public String getDepartement() {
        return Departement;
    }

    /*public void setGrade(int grade) {
        this.grade = grade;
    }*/

    @Override
    public String toString() {
        return "Employe{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", grade=" + grade +
                '}';
    }



    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Employe)) return false;
        Employe employe = (Employe) obj;
        return (id == employe.id) && (nom== employe.nom);
    }

    public int compareTo(Employe other) {
        return Integer.compare(this.id, other.id);
    }


    //its best practice bech thot el comparator fi class wahadha
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

}
