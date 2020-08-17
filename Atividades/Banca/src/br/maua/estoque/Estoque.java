package br.maua.estoque;


import br.maua.produtos.Produto;

import java.util.HashMap;

public class Estoque {

    private HashMap<Produto,Integer> estoque = new HashMap<>();

    public void adicionarAoEstoque(Produto produto, Integer qtd){
        if(estoque.containsKey(produto)) estoque.put(produto,estoque.get(produto)+qtd);
        estoque.putIfAbsent(produto,qtd);
    }

    @Override
    public String toString() {
        StringBuilder returnString = new StringBuilder();
        estoque.forEach((k,v)-> returnString.append(k.toString()).append(" - ").append(v.toString()));
        return returnString.toString();
    }

    public boolean removerDoEstoque(Produto produto, Integer qtd){
        if (estoque.containsKey(produto)){
            if (estoque.get(produto)>=qtd){
                estoque.put(produto,estoque.get(produto)-qtd);
                return true;
            }
            else return false;
        }
        return false;
    }

}
