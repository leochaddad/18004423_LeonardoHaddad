package br.maua.implementacoes.arquivo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;

public class TesteEscrita {
    public static void main(String[] args) {
        //Cria um arquivo
        File file = new File("nome.txt");
        try {
            //Cria uma conexao para escrever no arquivo
            FileWriter fileWriter = new FileWriter(file);

            //Cria um buffer de escrita
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write("Olá Mundo Arquivos");
            bufferedWriter.write("\n");
            bufferedWriter.write("Lalala 2+2 = " + (2+2));

            bufferedWriter.close();
            bufferedWriter.close();

            //

        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}
