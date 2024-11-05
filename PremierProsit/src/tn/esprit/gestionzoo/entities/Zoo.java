package tn.esprit.gestionzoo.entities;

import tn.esprit.gestionzoo.entities.Aquatic.Dophin;
import tn.esprit.gestionzoo.entities.Aquatic.aquatic;
import tn.esprit.gestionzoo.entities.Aquatic.penguin;

public class Zoo
{

    private Animal [] animals ;
    private String name;
    private String city;
    private final int nbcages = 3;  //remember final is for when its unchanged
    private int nbAnimals = 0;
    private aquatic[] aquaticAniamls;
    private int nbAquatic=0;
 //final int finalnumber;


    public Zoo(String name, String city) {
        animals=new Animal[nbcages];
        this.name = name;
        this.city = city;
        aquaticAniamls = new aquatic[20];
//this.finalnumber=finalnumber;

    }
    public void afficher()
    {
        System.out.println("Name: " + name);
        System.out.println("Nbcages: " + nbcages);
        System.out.println("City: " + city);

    }
    public String tostring (){   //we redefined it here so we can use it fel main
        return("name="+name+",nbcages="+nbcages+",city="+city);
    }

    /*
    public String tryToChangeLocation(String newLocation){
        return finalnumber++;    //generates an error because finalnumber is constant and cannot be changed : thats why we use final here
    }

     */
    //prosit 3
    ///instruct 10:

   /* public boolean addAnimal(Animal animal) {
        if (!this.isZooFull()) {
            animals[nbAnimals] = animal;
            nbAnimals++;
            return true;
        }
        return false;
    }*/
    public void addAnimal(Animal animal) throws ZooFullException {
        if (nbAnimals>=nbcages)
        {
            throw new ZooFullException();
        }
        if(animal.getAge()<0)
        {
            throw new InvalidAgeException("must have a Positive age "+animal.getName()+"was not added to zoo");
        }
        animals[nbAnimals] = animal;
        System.out.println( animal.getName()+" "+"added to zoo:");
        nbAnimals++;
        }
    public int searchAnimal(Animal animal)
    {
        for (int i = 0; i < nbAnimals; i++) {
            if (animals[i].getName()==animal.getName()) {
                return i;
            }
        }

        return -1;
    }
    public void showArray()
    {
        for (int i=0;i<nbAnimals;i++) {
            animals[i].afficher();
        }
    }
    public boolean isZooFull()
    {int j=0;
        for (int i=0;i<nbAnimals;i++)
        {

            if (animals[i]!=null) {
                j++;
            }
        }
            if (j<nbcages) {
                System.out.println("zoo aint full");
                return false;
            }

        System.out.println("zoo full");
        return true;
    }
    public void addAquaticAnimal(aquatic aquaObj) {
        if (nbAquatic < 10) {
            aquaticAniamls[nbAquatic] = aquaObj;
            nbAquatic++;
        } else {
            System.out.println("Aquatic animals full");
        }
    }

    public void displayNumberofAquaticsByType(){
        int aquaticCount = 0, dolphinCount = 0, penguinCount = 0;

        for (aquatic animal : aquaticAniamls) {
            if (animal instanceof Dophin) {
                dolphinCount++;
            } else if (animal instanceof penguin) {
                penguinCount++;
            } else if (animal instanceof aquatic) {
                aquaticCount++;
            }
        }

        System.out.println("In this zoo, there are:");
        System.out.println(dolphinCount + " dolphins");
        System.out.println(penguinCount + " penguins");
        System.out.println(aquaticCount + " other aquatic animals");
    }

}



