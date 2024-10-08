package tn.esprit.gestionzoo.entities.Aquatic;

public class Dophin extends aquatic{

    private float SwimSpeed;
    public Dophin(String family, String name, int age, boolean ismammal,String h, float swimSpeed) {
        super(family, name, age, ismammal,h);
        this.SwimSpeed = swimSpeed;
    }
}
