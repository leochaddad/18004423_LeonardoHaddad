import java.util.Scanner;

public class Ex1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String RA, Nome, Email, Idade, Telefone;
        System.out.println("Digite seu RA: ");
        RA=scanner.nextLine();
        System.out.println("Digite o seu nome completo: ");
        Nome=scanner.nextLine();
        System.out.println("Digite seu email: ");
        Email=scanner.nextLine();
        System.out.println("Digite seu telefone: ");
        Telefone=scanner.nextLine();
        System.out.println("Digite sua idade: ");
        Idade=scanner.nextLine();
        scanner.close();
        System.out.println("Nome:"+Nome+"\nIdade:"+Idade+"\nRA:"+RA+"\nTelefone:"+Telefone+"\nEmail:"+Email);
    }
}