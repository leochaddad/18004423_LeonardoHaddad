package br.maua;

import pacote.QualquerCoisa;

public class Main {

    public static void main(String[] args) {
        QualquerCoisa meuqqcoisa = new QualquerCoisa();
        Dog dog1 = new Dog();
        pacote.Dog dog2 = new pacote.Dog();
        dog1.latir();
        dog2.latir();
        meuqqcoisa.ola();
    }
}
