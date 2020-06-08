package br.maua.implementacoes;

import java.util.LinkedList;

public class LinkedListVersion {
    public static void run(){
        LinkedList<String> cidades = new LinkedList<>();
        cidades.add("Sao Paulo");
        cidades.add("Serra Negra");
        cidades.add("Rio de Janeiro");
        cidades.add("Curitiba");
        cidades.add(0,"Sao Caetano");

        for(String cidade:cidades){
            System.out.println(cidade);
        }

    }
}
