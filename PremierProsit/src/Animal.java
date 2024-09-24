import java.util.Scanner;

public class Animal
{
    String  family;
    String name;
    int age;
    boolean ismammal;

    public Animal(String family, String name, int age, boolean ismammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.ismammal = ismammal;
    }
    public void afficher()
    {
        System.out.println(family + " " + name + " " + age + " " + ismammal);

    }
    /*public void AddAnimal(String family, String name, int age, boolean ismammal)
    {
        System.out.println("family ?");
        Scanner scanner = new Scanner(System.in);
        this.family = scanner.nextLine();

        System.out.println("name ?");
        Scanner scanner1 = new Scanner(System.in);
        this.name = scanner1.nextLine();

        System.out.println("age ?");
        Scanner scanner2 = new Scanner(System.in);
        this.age = scanner2.nextInt();

        System.out.println("isMammal ? (true/false)");
        Scanner scanner3 = new Scanner(System.in);
        this.ismammal = scanner3.nextBoolean();



    }*/
}
