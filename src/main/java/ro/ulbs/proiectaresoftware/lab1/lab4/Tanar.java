package ro.ulbs.proiectaresoftware.lab1.lab4;

import java.util.HashMap;

public class Tanar {


    private String name;
    private int age;
    private String address;

    public Tanar(String nume, int varsta, String adresa) {
        this.name = nume;
        this.age = varsta;
        this.address = adresa;
    }


    @Override
    public String toString() {
        return "Tanar{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +

                '}';


    }
}








