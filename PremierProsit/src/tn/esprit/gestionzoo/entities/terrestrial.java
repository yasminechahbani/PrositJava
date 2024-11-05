package tn.esprit.gestionzoo.entities;
public class terrestrial extends Animal implements Omnivore<food>{
    int nblegs;


    public terrestrial(String family, String name, int age, boolean ismammal,int n) {
        super(family, name, age, ismammal);
        nblegs =n;
    }
    public void eatPlant(food plant) {
        if (plant == food.PLANT || plant == food.BOTH) {
            System.out.println("Eating plant.");
        } else {
            System.out.println("Cannot eat plant.");
        }
    }


    public void eatMeat(food meat) {
        if (meat == food.MEAT || meat == food.BOTH) {
            System.out.println("Eating meat.");
        } else {
            System.out.println("Cannot eat meat.");
        }
    }
    public void eatPlantsAndMeat(food food) {
        switch (food) {
            case PLANT:
                eatPlant(food);
                break;
            case MEAT:
                eatMeat(food);
                break;
            case BOTH:
                eatPlant(food);
                eatMeat(food);
                break;
            default:
                System.out.println("Unknown food type.");
                break;
        }
    }

}
