package tn.esprit.gestionzoo.entities;

public class terrestrial extends Animal{
    int nblegs;


    public terrestrial(String family, String name, int age, boolean ismammal,int n) {
        super(family, name, age, ismammal);
        nblegs =n;
    }}
