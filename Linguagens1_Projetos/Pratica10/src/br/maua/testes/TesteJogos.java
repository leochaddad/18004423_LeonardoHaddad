package br.maua.testes;

import br.maua.enums.Plataforma;
import br.maua.model.Jogo;
import br.maua.model.Jogos;

public class TesteJogos {
    public static void main(String[] args) {
        Jogo lol = new Jogo(Plataforma.PC,"LoL");
        Jogo gta = new Jogo(Plataforma.PS4,"GTA");

        Jogos jogos = new Jogos();

        jogos.addJogo(gta);
        jogos.addJogo(lol);

        System.out.println(jogos);

    }
}
