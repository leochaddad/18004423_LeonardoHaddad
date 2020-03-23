public class Jogada {

    private String escolha, ganhoDe, percoDe;

    public static final String PEDRA = "pedra";
    public static final String TESOURA = "tesoura";
    public static final String PAPEL = "papel";

    public Jogada (String opcao) {
        
        if(opcao.equals(Jogada.PEDRA)) {
            ganhoDe = Jogada.TESOURA;
            percoDe = Jogada.PAPEL;
        } else if(opcao.equals("papel")){
            ganhoDe = "pedra";
            percoDe = "tesoura";
        } else {
            ganhoDe = "papel";
            percoDe = "pedra";
        }
        escolha = opcao;
    }

    public String avaliar(Jogada jogada){
        if(jogada.getEscolha().equals(this.ganhoDe)){
            return "Ganhei";
        } else if(jogada.getEscolha().equals(this.percoDe)){
            return "Perdi";
        }
        else{
            return "Empate";
        }
    }
    public String getEscolha() {
        return this.escolha;
    }
}