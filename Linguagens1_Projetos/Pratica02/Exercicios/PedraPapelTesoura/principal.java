public class principal{
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador();
        Jogador jogador2 = new Jogador();
        jogador1.nome="Leo";
        jogador2.nome="Bruna";
        Jogo novojogo = new Jogo();
        //novojogo.Jogar(jogador1,jogador2);
        novojogo.Jogar(jogador1,jogador2);
        System.out.println(jogador1.jogada.jogada);
        System.out.println(jogador2.jogada.jogada);
    }
}