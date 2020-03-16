import java.util.Scanner;

public class Jogada{
    String jogada;
    boolean Valida(){
        return(this.jogada.equals("pedra")||this.jogada.equals("papel")||this.jogada.equals("tesoura"));
    };  

    void definir(){
        final Scanner scanner  = new Scanner(System.in);
        this.jogada = scanner.nextLine().toLowerCase();    
        

    };
}