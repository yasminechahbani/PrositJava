package tn.esprit.gestionzoo.entities;

public interface Omnivore<T> extends Herbvore,Carnivore{
    void eatPlantsAndMeat(T food);
}
