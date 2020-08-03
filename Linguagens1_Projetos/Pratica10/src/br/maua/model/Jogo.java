package br.maua.model;

import br.maua.enums.Plataforma;
import br.maua.enums.Status;

public class Jogo {
    private Plataforma plataforma;
    private String nome;
    private Status status;

    public Jogo(Plataforma plataforma, String nome) {
        this.plataforma = plataforma;
        this.nome = nome;
        this.status = Status.NAO_INICIADO;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void setStatusJogando( ) {
        this.status = Status.JOGANDO;
    }

    @Override
    public String toString() {
        return "Jogo{" +
                "plataforma=" + plataforma +
                ", nome='" + nome + '\'' +
                ", status=" + status +
                '}';
    }
}
