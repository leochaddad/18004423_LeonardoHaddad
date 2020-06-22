package br.maua.models;

import br.maua.enums.estadosPedido;
import br.maua.enums.formasDePagamento;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Faz o gerenciamento da lista de pedidos e i/o.
 */
public class Sistema {
    Scanner scanner = new Scanner(System.in);
    Usuario usuario;
    ArrayList<Pedido> listaPedidos = new ArrayList<>();

    public Sistema(Usuario usuario) {
        this.usuario = usuario;
    }

    /**
     * Roda o sistema principal, exibindo o menu, aguardando a opção do usuário e tomando ações.
     */
    public void run(){
        limpar();
        boolean continuar = true;
        while(continuar){
            mostrarMenu();
            System.out.println("Opcao: ");
            String opcao = scanner.nextLine();
            limpar();
            switch (opcao){
                case("0"):
                    continuar = false;
                    break;
                case("1"):
                    if(autenticar()){
                        novoPedido();
                    }
                    segurar();
                    limpar();
                    break;
                case("2"):
                    listarPedidos();
                    segurar();
                    limpar();
                    break;
                case("3"):
                    if(autenticar()){
                        limpar();
                        alterarPedido();
                    }
                    segurar();
                    limpar();
                    break;
            }
        }
    }

    /**
     * Rotina que exibe informações, solicita inputs do usuário para criar novo pedido e adiciona a listaPedidos
     */
    private void novoPedido(){
        limpar();
        System.out.println("************{ NOVO PEDIDO }***********");
        System.out.println("Descrição do pedido: ");
        System.out.println("......................................");
        String descricao = scanner.nextLine();
        System.out.println("......................................");
        System.out.println("Valor: ");
        float valor = Float.parseFloat(scanner.nextLine());
        System.out.println("......................................");
        System.out.println("Forma de pagamento: ");
        listarFormasDePagamento();
        formasDePagamento formaDePagamento  = formasDePagamento.values()[Integer.parseInt(scanner.nextLine())];
        System.out.println("......................................");
        Pedido novoPedido = new Pedido(usuario, descricao, valor, formaDePagamento);
        listaPedidos.add(novoPedido);
        limpar();
        System.out.println(novoPedido);
        System.out.println("\nPedido criado.");
    }

    /**
     * Rotina que exibe pedidos, solicita id e altera o estado do pedido com base no input do usuário.
     */
    private void alterarPedido(){
        listarPedidos();
        System.out.println("Alterar pedido #: ");
        String id  = scanner.nextLine();
        if(buscarPedidoPorId(id)!=null){
            Pedido pedidoParaAlterar = buscarPedidoPorId(id);
            limpar();
            System.out.println(pedidoParaAlterar);
            listarEstados();
            System.out.println("Estado: ");
            pedidoParaAlterar.alterarEstado(estadosPedido.values()[Integer.parseInt(scanner.nextLine())]);
            limpar();
            System.out.println(pedidoParaAlterar);
            System.out.println("Alterado.");
        }
        else{
            limpar();
            System.out.println("Pedido nao encontrado.");
        }
    }

    /**
     * Rotina que exibe todos os pedidos na lista
     */
    private void listarPedidos(){
        limpar();
        for(Pedido pedido:listaPedidos){
            System.out.println(pedido);
        }
    }
    /**
     * Rotina que exibe enum formasDePagamento com indice.
     */
    private void listarFormasDePagamento(){
        int indice = 0;

        for(formasDePagamento formaDePagamento : formasDePagamento.values()){
            System.out.println("( "+ indice +" )" +" - "+ formaDePagamento);
            indice++;
        }
        System.out.println();
    }
    /**
     * Rotina que exibe enum estadosPedido com indice.
     */
    private void listarEstados(){
        int indice = 0;
        for(estadosPedido estado : estadosPedido.values()){
            System.out.println("( "+ indice +" )" +" - "+ estado);
            indice++;
        }
        System.out.println();
    }

    /**
     * @param id Id do pedido a ser encontrado
     * @return Pedido se houver, null caso contário.
     */
    private Pedido buscarPedidoPorId(String id){
        for(Pedido pedido:listaPedidos){
            if(pedido.getId().equals(id)){
                return pedido;
            }
        }
        return null;
    }

    /**
     * Rotina exibe menu de opções para o usuário
     */
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

    /**
     * Rotina aguarda enter do usuário antes de tomar próxima ação
     */
    private void segurar(){
        System.out.println("\nPRESSIONE ENTER PARA VOLTAR AO MENU");
        scanner.nextLine();

    }

    /**
     * Rotina limpa a tela
     */
    private void limpar(){
        System.out.print("\033[H\033[2J");
    }

    /**
     * Rotina solicita senha ao usuário e confere se é igual a do usuário do sistema.
     * @return true se senha confere, false caso contário
     */
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

}
