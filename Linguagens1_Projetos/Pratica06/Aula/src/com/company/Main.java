package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	    Cachorro cachorro = new Cachorro();
	    Lobo lobo = new Lobo();
	    Peixe peixe = new Peixe();

	    ArrayList<Animal> animals = new ArrayList<>();

	    animals.add(cachorro);
	    animals.add(peixe);
	    animals.add(lobo);

		System.out.println("Traditional For:");
	    for(int i = 0; i<animals.size();i++){
	    	animals.get(i).comer();
		}

		System.out.println("Enhanced For:");
		for (Animal animal : animals) {
			animal.comer();
		}

    }
    
    public void ComportamentoCanino(Canino canino){
    	canino.cheirar();
	}
}
