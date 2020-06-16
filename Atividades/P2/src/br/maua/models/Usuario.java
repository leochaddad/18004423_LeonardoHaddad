package br.maua.models;

import br.maua.interfaces.autenticavel;

public class Usuario implements autenticavel {

    private String nome;
    private String email;
    private String senha;


    public Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public boolean autenticar(String senha) {
        return (this.senha.equals(senha));
    }

}
