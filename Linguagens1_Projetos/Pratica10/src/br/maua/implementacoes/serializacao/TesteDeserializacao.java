package br.maua.implementacoes.serializacao;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;

public class TesteDeserializacao {
    public static void main(String[] args) {
        Pessoa p1,p2;

        try {
            //Acessa o arquivo
            FileInputStream fileInputStream= new FileInputStream("nomedoarquivo.maua");

            //Acessa os dados no arquivo
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            p1 = (Pessoa)objectInputStream.readObject();
            p2 = (Pessoa)objectInputStream.readObject();

            System.out.println("Pessoas: "+p1+p2);

            objectInputStream.close();
            fileInputStream.close();

        }
        catch (Exception e){
            e.printStackTrace();
        }



    }
}
