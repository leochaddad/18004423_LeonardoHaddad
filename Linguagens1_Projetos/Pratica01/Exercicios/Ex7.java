import java.util.Scanner;

public class Ex7{
    public static void main(String[] args) {
        Integer n, soma;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        n=scanner.nextInt();
        scanner.close();
        soma=0;
        while(n!=0){
            soma+=n%10;
            n=n/10;
        };
        System.out.println("Soma dos algarismos: "+soma);
    }
}