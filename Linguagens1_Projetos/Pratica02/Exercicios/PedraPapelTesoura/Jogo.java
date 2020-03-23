import java.util.Scanner;

public class Jogo {
    private Jogador j1 , j2;
    public void jogar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Jogador 1, digite seu nome");
        String nome = scanner.nextLine();
        System.out.println("Jogador 1, digite sua escolha \n1-Pedra\n2-Papel\n3-Tesoura");
        int escolha = Integer.parseInt(scanner.nextLine());

        switch (escolha){
            case 1:
                j1 = new Jogador(nome, Jogada.PEDRA); break;
            case 2:
                j1 = new Jogador(nome, Jogada.TESOURA); break;
            default:
                j1 = new Jogador(nome, Jogada.PAPEL); break;
        }

        System.out.println("Jogador 2, digite seu nome");
        nome = scanner.nextLine();
        System.out.println("Jogador 2, digite sua escolha \n1-Pedra\n2-Papel\n3-Tesoura");
        escolha = Integer.parseInt(scanner.nextLine());
        switch(escolha){
            case 1:
                j2 = new Jogador(nome, Jogada.PEDRA); break;
            case 2:
                j2 = new Jogador(nome, Jogada.PAPEL); break;
            
            case 3:
                j2 = new Jogador(nome, Jogada.PAPEL); break;
        }

        j1.competicao(j2);
        scanner.close();
    }
}