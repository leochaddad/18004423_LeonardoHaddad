package br.maua.models;

import br.maua.enums.cargos;

public class heavyLifter extends membro {

    public heavyLifter(String nome, String email) {
        super(nome, email, cargos.HEAVY_LIFTERS);
    }

    @Override
    public void postarMensagem() {

    }
}
