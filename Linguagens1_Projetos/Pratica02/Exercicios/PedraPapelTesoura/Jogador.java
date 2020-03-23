public class Jogador {
    public String nome;
    private Jogada jogada;
    public Jogador(String nome, String escolha){
        this.jogada = new Jogada(escolha);
        this.nome = nome;
    }
    public Jogada getJogada(){
        return jogada;
    }
    public String competicao(Jogador player2){
        return jogada.avaliar(player2.getJogada());
    }
}