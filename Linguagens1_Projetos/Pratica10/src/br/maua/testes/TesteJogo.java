package br.maua.testes;

import br.maua.enums.Plataforma;
import br.maua.model.Jogo;

public class TesteJogo {
    public static void main(String[] args) {
        Jogo jogo = new Jogo(Plataforma.PC,"LoL");
        System.out.println(jogo);
        jogo.setStatusJogando();
        System.out.println(jogo);

    }
}
