import java.util.Scanner;  
public class ZooManagement {

    int nbcages=20;
    String zooName="myzoo";



//instruction 1
    public static void main(String[] args) {
         ZooManagement zm = new ZooManagement();
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
        System.out.println(zm1.nbcages);

    }


}
