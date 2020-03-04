import java.util.Scanner;

public class Ex5{
    public static void main(String[] args) {
        System.out.println("Digite o termo: ");
        Scanner scanner = new Scanner(System.in);
        Integer n = scanner.nextInt();
        System.out.println(fibonacci(n));
        scanner.close();
    }
    //Algoritmo ineficiente
    public static int fibonacci(int n){
        if(n<=2){ //Primeiro numero tem indice 1
            return 1;
        }
        else{
            return fibonacci(n-1)+fibonacci(n-2);
        }
    }
}
