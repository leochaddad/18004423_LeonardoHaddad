package br.maua.models;

import br.maua.enums.estadosPedido;
import br.maua.enums.formasDePagamento;


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

    public void alterarPedido(){
        listarPedidos();
        System.out.println("Alterar pedido #: ");
        String id  = scanner.nextLine();
        if(buscarPedidoPorId(id)!=null){
            Pedido pedidoParaAlterar = buscarPedidoPorId(id);
            listarEstados();
            System.out.println("Estado: ");
            pedidoParaAlterar.alterarEstado(estadosPedido.values()[Integer.parseInt(scanner.nextLine())]);
            System.out.println("Alterado.");
        }
        else{
            System.out.println("Pedido não encontrado.");
        }
    }

    public void listarPedidos(){
        for(Pedido pedido:listaPedidos){
            System.out.println(pedido);
        }
    }

    public void listarFormasDePagamento(){
        int indice = 0;
        System.out.print("| ");
        for(formasDePagamento formaDePagamento : formasDePagamento.values()){
            System.out.print(indice +" - "+ formaDePagamento +" | " );
            indice++;
        }
        System.out.println("");
    }

    public void listarEstados(){
        int indice = 0;
        System.out.print("| ");
        for(estadosPedido estado : estadosPedido.values()){
            System.out.print(indice +" - "+ estado + " | ");
            indice++;
        }
        System.out.println("");
    }

    private Pedido buscarPedidoPorId(String id){
        for(Pedido pedido:listaPedidos){
            if(pedido.getId().equals(id)){
                return pedido;
            };
        }
        return null;
    }

}
