package br.maua.models;

import br.maua.enums.estadosPedido;
import br.maua.enums.formasDePagamento;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Sistema {
    Scanner scanner = new Scanner(System.in);
    Usuario usuario;
    ArrayList<Pedido> listaPedidos = new ArrayList<>();

    public Sistema(Usuario usuario) {
        this.usuario = usuario;
    }

    public void run(){
        boolean continuar = true;
        while(continuar){
            mostrarMenu();
            System.out.println("Opcao: ");
            String opcao = scanner.nextLine();
            switch (opcao){
                case("0"):
                    continuar = false;
                    break;
                case("1"):
                    if(autenticar()){
                        novoPedido();
                    }
                    segurarELimpar();
                    break;
                case("2"):
                    listarPedidos();
                    segurarELimpar();
                    break;
                case("3"):
                    if(autenticar()){
                        alterarPedido();
                    }
                    segurarELimpar();
                    break;
            }
        }
    }

    private void novoPedido(){
        System.out.println("************{ NOVO PEDIDO }***********");
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

    private void alterarPedido(){
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
            System.out.println("Pedido nao encontrado.");
        }
    }

    private void listarPedidos(){
        for(Pedido pedido:listaPedidos){
            System.out.println(pedido);
        }
    }

    private void listarFormasDePagamento(){
        int indice = 0;
        System.out.print("| ");
        for(formasDePagamento formaDePagamento : formasDePagamento.values()){
            System.out.print(indice +" - "+ formaDePagamento +" | " );
            indice++;
        }
        System.out.println("");
    }

    private void listarEstados(){
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

    private void mostrarMenu(){
        System.out.println("**************************************");
        System.out.println("        Pizzaria o Rato que Ri:");
        System.out.println("       +++++++++++++++++++++++++     ");
        System.out.println("1 - Nova venda");
        System.out.println("2 - Verificar pedidos");
        System.out.println("3 - Alterar pedido");
        System.out.println("0 - Sair");
        System.out.println("**************************************");
    }

    private void segurarELimpar(){
        System.out.println("PRESSIONE ENTER PARA VOLTAR AO MENU");
        scanner.nextLine();
        limpar();
    }

    private boolean autenticar(){
        System.out.println("Senha: ");
        if(usuario.autenticar(scanner.nextLine())){
            return true;
        }
        else{
            System.out.println("Operacao negada!");
            return false;
        }
    }

    private void limpar(){
        //Clears Screen in java
        //nao e meu codigo: https://stackoverflow.com/questions/2979383/java-clear-the-console
        try {
            if (System.getProperty("os.name").contains("Windows"))
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            else
                Runtime.getRuntime().exec("clear");
        } catch (IOException | InterruptedException ex) {}
    }


}
