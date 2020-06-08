package br.maua.models;

import br.maua.enums.horarios;
import br.maua.interfaces.postarMensagem;


public abstract class membro implements postarMensagem {
    private String nome;
    private String email;
    private horarios horario;

    public membro(String nome, String email){
        this.nome = nome;
        this.email= email;
    }

    public horarios perguntarHorario(){
        return horario;
    }


}
