package br.maua.parsers;

import br.maua.model.Jogo;
import org.json.JSONObject;

public class JogoParser {
    public static JSONObject toJson(Jogo jogo){
        JSONObject json = new JSONObject();
        json.put("plataforma", jogo.getPlataforma());
        json.put("nome", jogo.getNome());
        json.put("status", jogo.getStatus());
        return json;
    }

}
