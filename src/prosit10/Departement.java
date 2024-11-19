package prosit10;

public class Departement implements Comparable<Departement>  {
    private int id;
    private String nomDep;
    private int nbEmployes;
    public Departement() {
        this.id = 0;
        this.nomDep = "";
        this.nbEmployes = 0;
    }
    public Departement(int id, String nomDep, int nbEmployes) {
        this.id = id;
        this.nomDep = nomDep;
        this.nbEmployes = 0;
    }
    public int getId() {
        return id;
    }
    public String getNomDep() {
        return nomDep;
    }
    public void setNomDep(String nomDep) {
        this.nomDep = nomDep;
    }
    public int getNbEmployes() {
        return nbEmployes;
    }
    public void setNbEmployes(int nbEmployes) {
        this.nbEmployes = nbEmployes;
    }
    @Override
    public String toString() {
        return "Departement{" +
                "id=" + id +
                ", nomDep='" + nomDep + '\'' +
                ", nbEmployes=" + nbEmployes +
                '}';
    }
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Departement that= (Departement)o;
        return id==that.id && nomDep== that.nomDep;
    }
    @Override
    public int compareTo(Departement other) {
        return Integer.compare(this.id, other.id);
    }


}
