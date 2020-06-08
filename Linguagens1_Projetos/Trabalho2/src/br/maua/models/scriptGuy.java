package br.maua.models;

import br.maua.enums.cargos;
import br.maua.enums.horarios;

public class scriptGuy extends Membro {

    public scriptGuy(String nome, String email) {
        super(nome, email, cargos.SCRIPT_GUYS);
    }


    /**
    * Imprime a mensagem correta dado o HORÁRIO atual 
    */

    @Override
    public void postarMensagem(horarios horario) {
        switch(horario){
            case REGULAR:
                System.out.println("Prazer em ajudar novos amigos de código!");
                break;
            case EXTRA:
                System.out.println("QU3Ro_S3us_r3curs0s.py");
                break;
        }

    }
}
