package br.maua.models;

import br.maua.enums.cargos;

public class bigBrother extends membro{

    public bigBrother(String nome, String email) {
        super(nome, email, cargos.BIG_BROTHERS);
    }

    @Override
    public void postarMensagem() {

    }
}
