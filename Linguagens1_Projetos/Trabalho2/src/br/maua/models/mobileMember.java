package br.maua.models;

import br.maua.enums.cargos;

public class mobileMember extends membro {
    public mobileMember(String nome, String email) {
        super(nome, email, cargos.MOBILE_MEMBERS);
    }

    @Override
    public void postarMensagem() {

    }
}
