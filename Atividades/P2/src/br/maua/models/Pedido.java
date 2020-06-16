package br.maua.models;

import br.maua.enums.estadosPedido;
import br.maua.enums.formasDePagamento;


import java.util.Random;

public class Pedido {
    String id;
    String descricao;
    float valor;
    formasDePagamento pagamento;
    estadosPedido estado;
    Usuario usuario;


    public Pedido(Usuario usuario, String descricao, float valor, formasDePagamento pagamento) {
        this.descricao = descricao;
        this.valor = valor;
        this.pagamento = pagamento;
        this.estado = estadosPedido.REALIZADO;
        this.id = this.gerarId();
        this.usuario = usuario;
    }


    private String gerarId(){
        Random random = new Random();
        String idGerado = "";
        for(int i = 0; i<3; i++){
            idGerado+= random.nextInt(10);
        }
        return idGerado;
    }

    public void alterarEstado(estadosPedido novoEstado){
        this.estado = novoEstado;
    }

    @Override
    public String toString() {
        return "Pedido: " + id + '\'' +
                "Descricao: " + descricao + '\'' +
                "Total: " + valor +
                "Forma de Pagamento: " + pagamento +
                "Criado por: " + usuario.getNome() + '\'';
    }
}
