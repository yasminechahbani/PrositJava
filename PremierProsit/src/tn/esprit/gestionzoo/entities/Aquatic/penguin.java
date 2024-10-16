package tn.esprit.gestionzoo.entities.Aquatic;

public class penguin extends aquatic{
    private final float SwimDepth;
    public penguin() {
        super();  // Appel du constructeur par défaut de la classe Aquatic
        this.SwimDepth= 0.0f;  // Valeur par défaut pour swimSpeed
    }
    public penguin(String family, String name, int age, boolean ismammal,String h, float  s) {
        super(family, name, age, ismammal,h);
        this.SwimDepth = s;
    }
    public float maxPengSwimDepth(){
        return 200.0f;
    }


public String toString(){
        return super.toString() + " SwimDepth: " + SwimDepth;

}


}
