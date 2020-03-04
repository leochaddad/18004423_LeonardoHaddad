import java.util.Scanner;

public class Ex4{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma frase: ");
        String frase = scanner.nextLine().toLowerCase().replaceAll("\\s", ""); //ReplaceAll do StackOverflow
        String inverso=inverterString(frase);

        if(frase.equals(inverso)){
            System.out.println("É um palíndromo!");
        }
        else{
            System.out.println("Não é um palíndromo");
        }

        scanner.close();
    }

    public static String inverterString(String palavra){
        char[] chr_palavra = palavra.toCharArray();
        char[] chr_inverso;
        chr_inverso= new char[palavra.length()];
        for(int i=0;i<chr_palavra.length;i++){
            char character = chr_palavra[chr_palavra.length-i-1];
            chr_inverso[i]=character;
        };
        String inverso = new String(chr_inverso); //Linha de codigo do StackOveflow
        return inverso;
    }
}