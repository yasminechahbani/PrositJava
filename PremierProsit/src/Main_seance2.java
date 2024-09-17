public class Main_seance2 {
    public static void main(String[] args) {

        Animal lion = new Animal("felines","lion",14,true);
        Zoo myZoo = new Zoo("Zoonmame",25,"tunis");
        //method 1 : standard method
        lion.afficher();
        myZoo.afficher();
        //method 2 : overriding toString
      // System.out.println( myZoo.toString());   //to directly print out everything,but it needs to be redefined necessarily to display what you need to display , otherwise its useless
    }
}
