
public class Jogador{
    String nome;
    Jogada jogada = new Jogada();
    int pontuação;

    void vence(){
        this.pontuação++;
        System.out.println(this.nome+" ganhou!");
    }


    void escolherJogada(){
        System.out.println("Jogador " +this.nome+ ", escolha a jogada: ");
        do{
            this.jogada.definir();
            if(!this.jogada.Valida()){
                System.out.println("Jogada inválida, digite novamente: ");
            };
        } while(!this.jogada.Valida());
    };


}