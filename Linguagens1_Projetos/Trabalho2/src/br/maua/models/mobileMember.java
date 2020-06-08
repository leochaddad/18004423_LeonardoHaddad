package br.maua.models;

import br.maua.enums.cargos;
import br.maua.enums.horarios;

public class mobileMember extends membro {
    public mobileMember(String nome, String email) {
        super(nome, email, cargos.MOBILE_MEMBERS);
    }

    @Override
    public void postarMensagem(horarios horario) {
        switch(horario){
            case REGULAR:
                System.out.println("Happy Coding!");
                break;
            case EXTRA:
                System.out.println("MAsK_S0c13ty");
                break;
        }

    }
}
