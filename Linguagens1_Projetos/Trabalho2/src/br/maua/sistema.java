package br.maua;

import br.maua.enums.horarios;
import br.maua.models.*;

import java.util.ArrayList;
import java.util.Scanner;

public class sistema {
    Scanner scanner = new Scanner(System.in);

    /**
     * SISTEMA para rodar o programa principal
     * @param horario Enum que dita o horário atual
    */

    public sistema(final horarios horario) {
        this.horario = horario;
    }


    private horarios horario;
    private final ArrayList<Membro> membros = new ArrayList<Membro>();


    /**
     * Retorna o HORÁRIO atual 
    */

    public horarios getHorario() {
        return horario;
    }


    
    /**
     * Muda o HORÁRIO atual entre EXTRA e REGULAR 
    */

    
    public void setHorario(final horarios horario) {
        this.horario = horario;
    }


    /**
    * Menu de Apresentação
    */

    public void apresentarMenu(){
        System.out.println("Bem vindo, Horário: "+ this.getHorario());
        System.out.println("1-Cadastrar Membro");
        System.out.println("2-Demitir Membro");
        System.out.println("3-Exibir Mensagens");
        System.out.println("4-Trocar Horário");
        System.out.println("5-Sair");
        System.out.println("Opção: ");
    }

    /**
    * Cadastra Usuário e suas informações
    * @param nome Nome do Usuário
    * @param email Email do Usuário
    * @param cargo atribuido ao Objeto   
    */

    public void cadastrarUsuario(final String nome, final String email, final int cargo){
        switch(cargo) {
            case (1):
                final mobileMember novo_membro1 = new mobileMember(nome, email);
                membros.add(novo_membro1);
                break;
            case (2):
                final heavyLifter novo_membro2 = new heavyLifter(nome, email);
                membros.add(novo_membro2);
                break;
            case (3):
                final bigBrother novo_membro3 = new bigBrother(nome, email);
                membros.add(novo_membro3);
                break;
            case (4):
                final scriptGuy novo_membro4 = new scriptGuy(nome, email);
                membros.add(novo_membro4);
                break;
        }


    }


    /**
    *  Troca entre HORÁRIO EXTRE e HORÁRIO REGULAR 
    */

    public void trocarHorario(){
        if(this.getHorario()==horarios.REGULAR){
            setHorario(horarios.EXTRA);
        }
        else{
            setHorario(horarios.REGULAR);
        }
    }


    /**
    * Remove Usuário cadastrado da lista
    */


    public Membro demitir(final int indice){
        return membros.remove(indice);
    }

    /**
    * Executa as funções do MENU
    */

    public void run(){
        boolean sair = false;
        while(!sair){
            apresentarMenu();
            final int opcao = Integer.parseInt(scanner.nextLine());
            switch(opcao){
                case(1):
                    System.out.println("1-MobileMember\n2-HeavyLifter\n3-BigBrother\n4-ScriptGuy\nCargo: ");
                    final int cargo = Integer.parseInt(scanner.nextLine());
                    System.out.println("Nome: ");
                    final String nome = scanner.nextLine();
                    System.out.println("E-mail: ");
                    final String email = scanner.nextLine();
                    cadastrarUsuario(nome,email,cargo);
                    break;
                case(2):
                    for(final Membro membro: membros){
                        System.out.println(membros.indexOf(membro)+"-"+membro.toString());
                    }
                    System.out.println("Demitir membro de índice: ");
                    final int indice = Integer.parseInt(scanner.nextLine());
                    demitir(indice);
                    break;
                case(3):
                    for(final Membro membro: membros){
                        membro.postarMensagem(this.getHorario());
                    }
                    break;
                case(4):
                    trocarHorario();
                    break;
                case(5):
                    sair = true;
            }

        }
    }









}
