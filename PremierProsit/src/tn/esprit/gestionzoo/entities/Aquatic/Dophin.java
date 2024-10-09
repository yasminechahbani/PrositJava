package tn.esprit.gestionzoo.entities.Aquatic;

public class Dophin extends aquatic{

    private float SwimSpeed;

    public Dophin() {
        super();  // Appel du constructeur par défaut de la classe Aquatic
        this.SwimSpeed = 0.0f;  // Valeur par défaut pour swimSpeed
    }

    public Dophin(String family, String name, int age, boolean ismammal,String h, float swimSpeed) {
        super(family, name, age, ismammal,h);
        this.SwimSpeed = swimSpeed;
    }
    public String toString(){
        return super.toString() + ", SwimSpeed=" + SwimSpeed;
    }
    public void swim(){
        System.out.println("Dophin Swimming...");
    }
}
