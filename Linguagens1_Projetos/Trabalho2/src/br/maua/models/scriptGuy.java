package br.maua.models;

import br.maua.enums.cargos;

public class scriptGuy extends membro {

    public scriptGuy(String nome, String email) {
        super(nome, email, cargos.SCRIPT_GUYS);
    }

    @Override
    public void postarMensagem() {

    }
}
