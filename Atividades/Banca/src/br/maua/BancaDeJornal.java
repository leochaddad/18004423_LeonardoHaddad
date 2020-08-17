package br.maua;


import br.maua.estoque.Estoque;
import br.maua.produtos.Produto;

public class BancaDeJornal {

    String nome;
    Estoque estoque;
    double caixa;

    public String getNome() {
        return nome;
    }

    public Estoque getEstoque() {
        return estoque;
    }

    public double getCaixa() {
        return caixa;
    }

    boolean novaVenda(Produto produto, Integer qtd){
        if (estoque.removerDoEstoque(produto,qtd)){
            caixa+= produto.getPrecoDeVenda()*qtd;
            System.out.println("Sucesso na venda");
            return true;
        }
        else{
            System.out.println("Estoque insuficiente");
            return false;
        }
    }
}
