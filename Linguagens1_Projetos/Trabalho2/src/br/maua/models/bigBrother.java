package br.maua.models;

import br.maua.enums.cargos;
import br.maua.enums.horarios;

public class bigBrother extends Membro {

    public bigBrother(String nome, String email) {
        super(nome, email, cargos.BIG_BROTHERS);
    }

    /**
    * Imprime a mensagem correta dado o HORÁRIO atual 
    */

    @Override
    public void postarMensagem(horarios horario) {
        switch(horario){
            case REGULAR:
                System.out.println("Sempre ajudando as pessoas membros ou não S2!");
                break;
            case EXTRA:
                System.out.println("...");
                break;
        }
    }
}
