package tn.esprit.gestionzoo.entities;

public class Zoo
{

    private Animal [] animals ;
    private String name;
    private String city;
    private final int nbcages = 25;  //remember final is for when its unchanged
    private int nbAnimals = 0;
 //final int finalnumber;


    public Zoo(String name, int nbcages, String city/*,int finalnumber*/) {
        animals=new Animal[nbcages];
        this.name = name;
        this.city = city;
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

    public boolean addAnimal(Animal animal) {
        if (!this.isZooFull()) {
            animals[nbAnimals] = animal;
            nbAnimals++;
            return true;
        }
        return false;
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

}

