package br.maua.implementacoes.serializacao;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class TesteSerializacao {
    public static void main(String[] args) {
        System.out.println("Teste de Serializacao");
        Pessoa p1 = new Pessoa("Leonardo", 20);
        Pessoa p2 = new Pessoa("Bruna", 20);


        try {
            //Cria uma forma de escrever arquivos no SO
            FileOutputStream fileOutputStream = new FileOutputStream("nomedoarquivo.maua");

            //Cria objeto que faz a conversão em bytes do objeto
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(p1);
            objectOutputStream.writeObject(p2);

            objectOutputStream.close();
            fileOutputStream.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("Salvo");

    }
}
