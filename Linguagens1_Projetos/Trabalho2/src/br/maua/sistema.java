package br.maua;

import br.maua.enums.cargos;
import br.maua.enums.horarios;
import br.maua.models.*;

import java.util.ArrayList;
import java.util.Scanner;

public class sistema {
    Scanner scanner = new Scanner(System.in);
    private horarios horario;
    private ArrayList<membro> membros = new ArrayList<membro>();

    public horarios getHorario() {
        return horario;
    }

    public void apresentarMenu(){

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

    }

    public void demitir(){

    }

    public void run(){
        while(true){
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
                    for(membro a: membros){
                        System.out.println(a.getEmail());
                    }
            }
        }
    }









}
