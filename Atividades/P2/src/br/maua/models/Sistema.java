package br.maua.models;

import br.maua.enums.estadosPedido;
import br.maua.enums.formasDePagamento;
import br.maua.interfaces.autenticavel;


import java.util.ArrayList;
import java.util.Scanner;

public class Sistema {
    Scanner scanner = new Scanner(System.in);
    Usuario usuario;
    ArrayList<Pedido> listaPedidos = new ArrayList<>();

    public Sistema(Usuario usuario) {
        this.usuario = usuario;
    }

    public void novoPedido(){
        System.out.println("Descrição do pedido: ");
        String descricao = scanner.nextLine();
        System.out.println("Valor: ");
        float valor = Float.parseFloat(scanner.nextLine());
        System.out.println("Forma de pagamento: ");
        listarFormasDePagamento();
        formasDePagamento formaDePagamento  = formasDePagamento.values()[Integer.parseInt(scanner.nextLine())];
        Pedido novoPedido = new Pedido(usuario, descricao, valor, formaDePagamento);
        listaPedidos.add(novoPedido);
    }

    public void listarPedidos(){
        for(Pedido pedido:listaPedidos){
            System.out.println(pedido);
        }
    }
    public void listarFormasDePagamento(){
        int indice = 0;
        for(formasDePagamento formaDePagamento : formasDePagamento.values()){
            System.out.println(indice +" - "+ formaDePagamento);
            indice++;
        }
    }

    public void listarEstados(){
        int indice = 0;
        for(estadosPedido estado : estadosPedido.values()){
            System.out.println(indice +" - "+ estado);
            indice++;
        }
    }

}
