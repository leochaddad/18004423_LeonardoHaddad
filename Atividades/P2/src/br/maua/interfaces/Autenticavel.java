package br.maua.interfaces;

/**
 * Autenticavel possui método autenticar.
 */
public interface Autenticavel {
    /**
     * @param senha Senha para conferência.
     * @return senha == senha do objeto.
     */
    boolean autenticar(String senha);
}
