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
public String toString()
{
    return "Aquatic animal: " + super.toString() + ", Habitat: " + Habitat;
}
    public void swim(){
        System.out.println("aquatic Swimming...");
    }
}
