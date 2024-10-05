import java.util.Scanner;  
public class ZooManagement {

    int nbcages=20;
    String zooName="myzoo";



//instruction 1
    public static void main(String[] args) {

/*ZooManagement zm = new ZooManagement();  // we cant remove  el new zoomanagement , unlike c++
        System.out.println(zm.zooName+" comporte "+zm.nbcages+"cages");

        //instruction 2  allow the user to type in the value
        System.out.println("type in the values you want to change ");
        Scanner scanfvariable = new Scanner(System.in);
        ZooManagement zm1 = new ZooManagement();
        do {
            zm1.nbcages = scanfvariable.nextInt();   //to read whatever integer i will be typing in
            zm1.zooName = scanfvariable.next();   //to read whatever string i will be typing in
        } while ((zm1.nbcages==0)||(zm1.zooName==null));
        System.out.println("changed values : ");
        System.out.println(zm1.zooName);
        System.out.println(zm1.nbcages);*/
 /* Zoo.age=4;
  Zoo newZoo=new Zoo("zooName",4,"Paris");
Zoo.showAge();
newZoo.showAge(); */// see how the object that we created follows the behaviour of the class Zoo , as we changed the static variable age for the class Zoo , so did the object because they point on the same place instead of making a copy .



// instruct 10


        Zoo newZoo=new Zoo("belveder",25,"Tunis");
        Animal newAnimal=new Animal ("feline","",-8,true);
        newZoo.addAnimal(newAnimal);
        newZoo.showArray();





    }



}
