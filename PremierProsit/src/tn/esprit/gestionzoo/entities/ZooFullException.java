package tn.esprit.gestionzoo.entities;

public class ZooFullException extends RuntimeException {
    public ZooFullException() {
       System.out.println("Zoo is full");
    }
}
