package br.maua.model;

import java.util.ArrayList;
import java.util.List;

public class Jogos {
    private List<Jogo> jogos = new ArrayList<>();

    public void addJogo(Jogo jogo){
        this.jogos.add(jogo);
    }

    @Override
    public String toString() {
        return "Jogos{ " + jogos + " }";
    }
}
