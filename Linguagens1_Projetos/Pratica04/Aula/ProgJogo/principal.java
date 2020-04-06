
import java.util.Scanner;
public class principal {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        String nome, genero, descricao;
        System.out.println("Informe nome, genero, descricao:");
        nome = scanner.nextLine();
        genero = scanner.nextLine();
        descricao = scanner.nextLine();

        final Jogo j1 = new Jogo(nome, genero, descricao);
        System.out.println("J1:" + j1.getInfo());

        System.out.println("Informe nick:");
        String nick;
        nick = scanner.nextLine();
        final Usuario usuario = new Usuario(nick, "123", "");
        final Conta conta = new Conta(usuario);
        System.out.println("Dados da conta:" + conta.getInfo());
        conta.addCreditos(50.00);
        for(int i = 0; i < 5; i++)
            conta.addJogo(j1);
        System.out.println("Dados da conta:" + conta.getInfo());
        scanner.close();
    }
}
