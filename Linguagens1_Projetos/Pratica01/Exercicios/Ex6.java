import java.util.Scanner;

public class Ex6{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer n1,n2;
        Integer soma,mult;
        soma=0;
        mult=1;
        System.out.println("Primeiro numero da sequencia: ");
        n1=scanner.nextInt();
        System.out.println("Ultimo numero da sequencia: ");
        n2=scanner.nextInt();
        scanner.close();
        for (int i = n1; i<=n2; i++){
            soma+=i;
            mult*=i;
        }
        System.out.println("A Soma dos numeros e "+soma+" e o produto "+mult);
    }
}