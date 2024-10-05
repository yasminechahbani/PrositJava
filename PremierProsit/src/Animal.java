//mport testPackage.MotherTestClass;  // we cant do this if the class to be inherited is not public!! since both these files are not in the same package , we need the mother class to be public in order for all other classes inside and outside the package to inherit it


import java.util.Scanner;

public class Animal
{
    private final String  family;
    private String name;
    private int age;
    private final boolean ismammal;

    public String getName()
    {
        return name;
    }
    public void setAge(int age){
        Scanner scanner = new Scanner(System.in);
        while (age <= 0) {
            System.out.println("Age must be positive.");
            System.out.print("Please enter a valid age: ");
            age = scanner.nextInt();
        }

        this.age = age;
    }

    public void setName(String name) {
        Scanner scanner = new Scanner(System.in);
        while (name.isEmpty()) {
            System.out.println("Name cannot be empty.");
            System.out.print("Please enter a valid name: ");
            name = scanner.nextLine();
        }
        this.name = name;
    }

    public Animal(String family, String name, int age, boolean ismammal) {
        this.family = family;
        setName(name);
        setAge(age);
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
