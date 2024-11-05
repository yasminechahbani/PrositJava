package tn.esprit.gestionzoo.entities;

public interface Omnivore<T> extends Herbvore<T>,Carnivore<T>{
    void eatPlantsAndMeat(T food);
}
