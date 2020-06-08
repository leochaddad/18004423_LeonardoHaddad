package br.maua.models;

import br.maua.enums.horarios;
import br.maua.enums.cargos;
import br.maua.interfaces.postarMensagem;


public abstract class membro implements postarMensagem {

    private String nome;
    private String email;
    private horarios horario;
    private cargos cargo;

    public membro(String nome, String email, cargos cargo){
        this.nome = nome;
        this.email= email;
        this.cargo = cargo;
    }

    public horarios perguntarHorario(){
        return horario;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public horarios getHorario() {
        return horario;
    }

    public cargos getCargo() {
        return this.cargo;
    }



}
