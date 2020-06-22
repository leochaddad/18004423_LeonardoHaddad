package br.maua.models;

import br.maua.interfaces.Autenticavel;
import br.maua.interfaces.Pessoa;

public class Usuario implements Autenticavel, Pessoa {

    private final String nome;
    private final String email;
    private final String senha;


    /**
     * @param nome Nome do usuário
     * @param email Email do usuário
     * @param senha Senha do usuário
     */
    public Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    /**
     * Getter para nome
     * @return Nome do usuário
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param senha Senha para conferência
     * @return true se conferir, false caso contrário
     */
    @Override
    public boolean autenticar(String senha) {
        return (this.senha.equals(senha));
    }

}
