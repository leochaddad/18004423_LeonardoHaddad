package br.maua.models;

import br.maua.enums.horarios;
import br.maua.enums.cargos;
import br.maua.interfaces.postarMensagem;


/**
* Imprime as informações da instância atual da classe membro 
*/

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


    /**
    * Retorna o nome 
    */

    public String getNome() {
        return nome;
    }

    /**
    * Retorna e-mail 
    */

    public String getEmail() {
        return email;
    }


    /**
    * Retorna o cargo da Instância 
    */
    public cargos getCargo() {
        return this.cargo;
    }



}
