import java.util.Scanner;

public class Ex3{
    public static void main(String[] args) {
        String usuario,senha,t_usuario, t_senha;
        Scanner scanner = new Scanner(System.in);
        Boolean tentativa;
        System.out.println("Digite um nome de usuario: ");
        usuario = scanner.nextLine();
        System.out.println("Digite uma senha: ");
        senha = scanner.nextLine();
        do{
            System.out.println("Digite seu usuario: ");
            t_usuario = scanner.nextLine();
            System.out.println("Digite sua senha: ");
            t_senha = scanner.nextLine();
            tentativa = (usuario.equals(t_usuario))&&(senha.equals(t_senha));
            if(!tentativa){
                System.out.println("Usuário ou senha incorretos, tente novamente");
            }
        }while(!tentativa);
        scanner.close();
        System.out.println("Sucesso!");
    }
}