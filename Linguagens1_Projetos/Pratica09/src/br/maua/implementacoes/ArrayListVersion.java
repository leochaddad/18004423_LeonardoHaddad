package br.maua.implementacoes;

import br.maua.models.Dog;

import java.util.ArrayList;

public class ArrayListVersion {
    public static void run(){
        ArrayList<Dog> dogs = new ArrayList<>();
        Dog dog = new Dog("thor", "golden",30);
        dogs.add(dog);
        dog = new Dog("snoopy", "beagle",20);
        dogs.add(dog);
        //FOR ruim:
        for (Dog i : dogs) {
            System.out.println(i);
        }

    }
}
