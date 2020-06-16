package br.maua;

import br.maua.interfaces.autenticavel;
import br.maua.models.Pedido;

import java.util.ArrayList;

public class Sistema {

    autenticavel usuario;
    ArrayList<Pedido> listaPedidos = new ArrayList<>();

    public Sistema(autenticavel usuario) {
        this.usuario = usuario;
    }

    void listarPedidos(){
        for(Pedido pedido:listaPedidos){
            System.out.println(listaPedidos.indexOf(pedido));
        }
    }


}
