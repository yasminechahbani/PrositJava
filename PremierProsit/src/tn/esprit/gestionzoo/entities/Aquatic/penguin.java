package tn.esprit.gestionzoo.entities.Aquatic;

public class penguin extends aquatic{
    private final float SwimDepth;
    public penguin(String family, String name, int age, boolean ismammal,String h, float swimDepth) {
        super(family, name, age, ismammal,h);
        this.SwimDepth = swimDepth;
    }


}
