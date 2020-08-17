package br.maua.produtos;
import br.maua.atores.Fornecedor;

public class Produto {

    private String nome;
    private String codigoDeBarras;
    private double precoDeVenda;
    private double precoDeCompra;
    private Categoria categoria;
    private Fornecedor fornecedor;

    public Produto(String nome, String codigoDeBarras, double precoDeVenda, double precoDeCompra, Categoria categoria, Fornecedor fornecedor) {
        this.nome = nome;
        this.codigoDeBarras = codigoDeBarras;
        this.precoDeVenda = precoDeVenda;
        this.precoDeCompra = precoDeCompra;
        this.categoria = categoria;
        this.fornecedor = fornecedor;
    }

    public String getNome() {
        return nome;
    }

    public String getCodigoDeBarras() {
        return codigoDeBarras;
    }

    public double getPrecoDeVenda() {
        return precoDeVenda;
    }

    public double getPrecoDeCompra() {
        return precoDeCompra;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", codigoDeBarras='" + codigoDeBarras + '\'' +
                ", precoDeVenda=" + precoDeVenda +
                ", precoDeCompra=" + precoDeCompra +
                ", categoria=" + categoria +
                ", fornecedor=" + fornecedor +
                '}';
    }
}
