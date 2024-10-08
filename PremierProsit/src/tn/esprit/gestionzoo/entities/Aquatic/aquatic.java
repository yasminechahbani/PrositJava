package tn.esprit.gestionzoo.entities.Aquatic;

import tn.esprit.gestionzoo.entities.Animal;

class aquatic extends Animal {

private String Habitat;
public aquatic(String family, String name, int age, boolean ismammal,String h)
{
    super(family, name, age, ismammal);
    Habitat=h;
}

}
