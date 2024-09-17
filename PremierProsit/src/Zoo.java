

public class Zoo
{
Animal [] animals ;
String name;
String city;
 int nbcages = 25;

    public Zoo(String name, int nbcages, String city) {
        animals=new Animal[nbcages];
        this.name = name;
        this.city = city;
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
}
