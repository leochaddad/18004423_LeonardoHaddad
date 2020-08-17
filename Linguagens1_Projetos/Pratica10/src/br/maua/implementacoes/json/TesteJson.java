package br.maua.implementacoes.json;

import br.maua.enums.Plataforma;
import br.maua.model.Jogo;
import br.maua.parsers.JogoParser;
import org.json.JSONObject;

public class TesteJson {
    public static void main(String[] args) {
        Jogo jogo1 = new Jogo(Plataforma.PS4,"GTA");
        JSONObject json = JogoParser.toJson(jogo1);
        System.out.println("Formato toString(): "+jogo1);
        System.out.println("Formato Json: "+json);
    }
}
