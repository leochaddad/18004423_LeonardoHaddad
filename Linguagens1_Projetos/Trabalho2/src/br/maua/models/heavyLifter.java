package br.maua.models;

import br.maua.enums.cargos;
import br.maua.enums.horarios;

public class heavyLifter extends Membro {

    public heavyLifter(String nome, String email) {
        super(nome, email, cargos.HEAVY_LIFTERS);
    }


    /**
    * Imprime a mensagem correta dado o HORÁRIO atual 
    */

    @Override
    public void postarMensagem(horarios horario) {
        switch(horario){
            case REGULAR:
                System.out.println("Podem contar conosco!");
                break;
            case EXTRA:
                System.out.println("N00b_qu3_n_Se_r3pita.bat");
                break;
        }

    }
}
