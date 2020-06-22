package br.maua.models;

import br.maua.enums.estadosPedido;
import br.maua.enums.formasDePagamento;
import br.maua.interfaces.Pessoa;


import java.util.Random;

/**
 * Possui dados do pedido e métodos.
 */
public class Pedido {
    String id;
    String descricao;
    float valor;
    formasDePagamento pagamento;
    estadosPedido estado;
    Pessoa criador;


    /**
     * @param criador Pessoa que criou o pedido
     * @param descricao Descrição do pedido
     * @param valor Valor total do pedido
     * @param pagamento Forma de pagamento
     */
    public Pedido(Pessoa criador, String descricao, float valor, formasDePagamento pagamento) {
        this.descricao = descricao;
        this.valor = valor;
        this.pagamento = pagamento;
        this.estado = estadosPedido.REALIZADO;
        this.id = this.gerarId();
        this.criador = criador;
    }


    /**
     * @return ID de 3 dígitos aleatórios
     */
    private String gerarId(){
        Random random = new Random();
        String idGerado = "";
        for(int i = 0; i<3; i++){
            idGerado+= random.nextInt(10);
        }
        return idGerado;
    }

    /**
     * @return ID do pedido
     */
    public String getId() {
        return id;
    }

    public void alterarEstado(estadosPedido novoEstado){
        this.estado = novoEstado;
    }

    /**
     * @return Texto formatado com informações do pedido
     */
    @Override
    public String toString() {
        return  "--------------------------------------\n"+
                "Pedido: " + id + '\n' +
                "Criado por: " + criador.getNome()+'\n'+
                "Descricao: " + descricao + '\n' +
                "Total: " + valor + '\n' +
                "Forma de Pagamento: " + pagamento + '\n'+
                "Estado: " + estado+'\n'+
                "--------------------------------------";
    }
}
