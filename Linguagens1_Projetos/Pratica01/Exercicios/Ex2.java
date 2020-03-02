import java.util.Scanner;
import java.lang.Math;

public class Ex2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome1,nome2;
        Integer idade1,idade2, dif;
        System.out.println("Digite o primeiro nome: ");
        nome1=scanner.nextLine();
        System.out.println("Digite o segundo nome: ");
        nome2=scanner.nextLine();
        System.out.println("Digite a idade de "+nome1+":");
        idade1=scanner.nextInt();
        System.out.println("Digite a idade de "+nome2+":");
        idade2=scanner.nextInt();
        dif=Math.abs(idade1-idade2);
        scanner.close();
        System.out.println(nome1+" e "+nome2+" tem "+dif+" ano(s) de diferença");
    }
}