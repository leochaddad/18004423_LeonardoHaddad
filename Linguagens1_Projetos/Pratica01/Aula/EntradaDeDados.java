import java.util.Scanner;
public class EntradaDeDados{
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        String nome;
        System.out.println("Informe seu nome:");
        nome=scanner.nextLine();
        System.out.println("Olá "+nome);
        double n1, n2;
        System.out.println("Informe 2 numeros: ");
        n1=scanner.nextDouble();
        n2=scanner.nextDouble();
        scanner.close();
        System.out.println("A soma é "+ (n1+n2 ) );
        System.out.println("Lalalalal");
        System.out.println("teste 2");
        if(n1>n2){
            System.out.println("N1 Maior");
        }
        else{
            System.out.println("N2 é maior!");

        }
   }
}