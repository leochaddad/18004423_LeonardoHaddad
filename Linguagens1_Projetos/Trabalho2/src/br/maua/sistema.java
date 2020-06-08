package br.maua;

import br.maua.enums.horarios;
import br.maua.models.*;

import java.util.ArrayList;
import java.util.Scanner;

public class sistema {
    Scanner scanner = new Scanner(System.in);

    public sistema(horarios horario) {
        this.horario = horario;
    }


    private horarios horario;
    private ArrayList<Membro> membros = new ArrayList<Membro>();


    public horarios getHorario() {
        return horario;
    }

    public void setHorario(horarios horario) {
        this.horario = horario;
    }

    public void apresentarMenu(){
        System.out.println("Bem vindo, Horário: "+ this.getHorario());
        System.out.println("1-Cadastrar Membro");
        System.out.println("2-Demitir Membro");
        System.out.println("3-Exibir Mensagens");
        System.out.println("4-Trocar Horário");
        System.out.println("5-Sair");
        System.out.println("Opção: ");
    }

    public void cadastrarUsuario(String nome, String email, int cargo){
        switch(cargo) {
            case (1):
                mobileMember novo_membro1 = new mobileMember(nome, email);
                membros.add(novo_membro1);
                break;
            case (2):
                heavyLifter novo_membro2 = new heavyLifter(nome, email);
                membros.add(novo_membro2);
                break;
            case (3):
                bigBrother novo_membro3 = new bigBrother(nome, email);
                membros.add(novo_membro3);
                break;
            case (4):
                scriptGuy novo_membro4 = new scriptGuy(nome, email);
                membros.add(novo_membro4);
                break;
        }


    }

    public void trocarHorario(){
        if(this.getHorario()==horarios.REGULAR){
            setHorario(horarios.EXTRA);
        }
        else{
            setHorario(horarios.REGULAR);
        }
    }

    public Membro demitir(int indice){
        return membros.remove(indice);
    }

    public void run(){
        boolean sair = false;
        while(!sair){
            apresentarMenu();
            int opcao = Integer.parseInt(scanner.nextLine());
            switch(opcao){
                case(1):
                    System.out.println("1-MobileMember\n2-HeavyLifter\n3-BigBrother\n4-ScriptGuy\nCargo: ");
                    int cargo = Integer.parseInt(scanner.nextLine());
                    System.out.println("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.println("E-mail: ");
                    String email = scanner.nextLine();
                    cadastrarUsuario(nome,email,cargo);
                    break;
                case(2):
                    for(Membro membro: membros){
                        System.out.println(membros.indexOf(membro)+"-"+membro.toString());
                    }
                    System.out.println("Demitir membro de índice: ");
                    int indice = Integer.parseInt(scanner.nextLine());
                    demitir(indice);
                    break;
                case(3):
                    for(Membro membro: membros){
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
