package tn.esprit.gestionzoo.entities.Aquatic;

import tn.esprit.gestionzoo.entities.Animal;

public class aquatic extends Animal {

private String Habitat;
    public aquatic() {
        super();  // Appel du constructeur par défaut de la classe Animal
        this.Habitat = "Unknown";
    }
public aquatic(String family, String name, int age, boolean ismammal,String h)
{
    super(family, name, age, ismammal);
    Habitat=h;
}
    public static void penguinFunc(){
        System.out.println("this is a function only explicit lel classe derivee");
    }
public String toString()
{
    return "Aquatic animal: " + super.toString() + ", Habitat: " + Habitat;
}
    public void swim(){
        System.out.println("aquatic Swimming...");
    }
    public boolean equals(Object obj) {
        if (obj instanceof aquatic) {
            aquatic other = (aquatic) obj;
            return this.name.equals(other.name) &&
                    this.age == other.age &&
                    this.family.equals(other.family);
        }
        return false;
    }

}
