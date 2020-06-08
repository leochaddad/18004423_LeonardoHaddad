package br.maua.models;

import br.maua.enums.horarios;
import br.maua.enums.cargos;
import br.maua.interfaces.postarMensagem;


public abstract class Membro implements postarMensagem {
    @Override
    public String toString() {
        return "membro{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", cargo=" + cargo +
                '}';
    }

    private String nome;
    private String email;
    private cargos cargo;

    public Membro(String nome, String email, cargos cargo){
        this.nome = nome;
        this.email= email;
        this.cargo = cargo;
    }


    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }


    public cargos getCargo() {
        return this.cargo;
    }



}
