package br.maua.implementacoes;
import br.maua.models.Dog;

public class ArrayVersion {
    public static void run(){
//        int[] meusInteiros = new int[10];
//        meusInteiros[3]=42;
//        System.out.println("Valor 3: "+meusInteiros[3]);
        Dog [] dogs = new Dog[3];
        Dog dog = new Dog("thor", "golden",30);
        dogs[0] = dog;
        dogs[1] = new Dog("snoopy", "beagle",20);


    }
}
