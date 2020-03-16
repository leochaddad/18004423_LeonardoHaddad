public class Jogo{

    void Jogar(Jogador p1, Jogador p2){
        p1.escolherJogada();
        p2.escolherJogada();
        boolean aux1 = (p1.jogada.jogada.equals("pedra")&&p2.jogada.jogada.equals("tesoura"));
        aux1 =  aux1 || (p1.jogada.jogada.equals("papel")&&p2.jogada.jogada.equals("pedra"));
        aux1 = aux1 || (p1.jogada.jogada.equals("pedra")&&p2.jogada.jogada.equals("tesoura"));
        if (p1.jogada.jogada.equals(p2.jogada.jogada)) System.out.println("Empate!");
        else if (aux1) p1.vence();
        else p2.vence();
    }
    
}