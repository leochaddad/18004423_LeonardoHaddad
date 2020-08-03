package br.maua.implementacoes.arquivo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class TesteLeitura {
    public static void main(String[] args) {
        File file = new File("nome.txt");
        try{
            //Cria o fluxo de leitura
            FileReader fileReader = new FileReader(file);

            //Buffer de leitura
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            bufferedReader.lines().forEach(System.out::println);

        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}
