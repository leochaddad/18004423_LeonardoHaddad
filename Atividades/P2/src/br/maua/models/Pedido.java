package br.maua.models;

import br.maua.enums.estadosPedido;
import br.maua.enums.formasDePagamento;
import br.maua.interfaces.pessoa;


import java.util.Random;

public class Pedido {
    String id;
    String descricao;
    float valor;
    formasDePagamento pagamento;
    estadosPedido estado;
    pessoa criador;


    public Pedido(pessoa criador, String descricao, float valor, formasDePagamento pagamento) {
        this.descricao = descricao;
        this.valor = valor;
        this.pagamento = pagamento;
        this.estado = estadosPedido.REALIZADO;
        this.id = this.gerarId();
        this.criador = criador;
    }


    private String gerarId(){
        Random random = new Random();
        String idGerado = "";
        for(int i = 0; i<3; i++){
            idGerado+= random.nextInt(10);
        }
        return idGerado;
    }

    public String getId() {
        return id;
    }

    public void alterarEstado(estadosPedido novoEstado){
        this.estado = novoEstado;
    }

    @Override
    public String toString() {
        return  "--------------------------------------\n"+
                "Pedido: " + id + '\n' +
                "Criado por: " + criador.getNome()+'\n'+
                "Descricao: " + descricao + '\n' +
                "Total: " + valor + '\n' +
                "Forma de Pagamento: " + pagamento + '\n';
    }
}
