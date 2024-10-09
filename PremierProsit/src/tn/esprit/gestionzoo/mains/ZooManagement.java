package tn.esprit.gestionzoo.mains;
import tn.esprit.gestionzoo.entities.Aquatic.penguin;
import tn.esprit.gestionzoo.entities.Aquatic.aquatic;
import tn.esprit.gestionzoo.entities.Aquatic.Dophin;
import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Zoo;

public class ZooManagement {

    int nbcages=20;
    String zooName="myzoo";



//instruction 1
    public static void main(String[] args) {

/*tn.esprit.gestionzoo.mains.ZooManagement zm = new tn.esprit.gestionzoo.mains.ZooManagement();  // we cant remove  el new zoomanagement , unlike c++
        System.out.println(zm.zooName+" comporte "+zm.nbcages+"cages");

        //instruction 2  allow the user to type in the value
        System.out.println("type in the values you want to change ");
        Scanner scanfvariable = new Scanner(System.in);
        tn.esprit.gestionzoo.mains.ZooManagement zm1 = new tn.esprit.gestionzoo.mains.ZooManagement();
        do {
            zm1.nbcages = scanfvariable.nextInt();   //to read whatever integer i will be typing in
            zm1.zooName = scanfvariable.next();   //to read whatever string i will be typing in
        } while ((zm1.nbcages==0)||(zm1.zooName==null));
        System.out.println("changed values : ");
        System.out.println(zm1.zooName);
        System.out.println(zm1.nbcages);*/
 /* tn.esprit.gestionzoo.entities.Zoo.age=4;
  tn.esprit.gestionzoo.entities.Zoo newZoo=new tn.esprit.gestionzoo.entities.Zoo("zooName",4,"Paris");
tn.esprit.gestionzoo.entities.Zoo.showAge();
newZoo.showAge(); */// see how the object that we created follows the behaviour of the class tn.esprit.gestionzoo.entities.Zoo , as we changed the static variable age for the class tn.esprit.gestionzoo.entities.Zoo , so did the object because they point on the same place instead of making a copy .



// instruct 10


   /*     Zoo newZoo=new Zoo("belveder",25,"Tunis");
        Animal newAnimal=new Animal ("feline","",-8,true);
        newZoo.addAnimal(newAnimal);
        newZoo.showArray();*/
//prosit 5
        aquatic defaultAquatic = new aquatic();
        Dophin defaultDphin = new Dophin();
        penguin defaultPenguin = new penguin();
        defaultAquatic.afficher();

         aquatic Fish=new aquatic("goldfish","gold",3,false,"Ocean");
        Dophin  dolphin = new Dophin("dauphin","dauph",11,false,"sea",16);
        penguin penguin = new penguin("penguin","white",-3,false,"Antarctica",59);
        Fish.afficher();
        Fish.swim();
        dolphin.swim();
        penguin.swim();  //polymorphism

    }



}
