package ProgJogo;
public class Usuario {
    private String nickname, password;

    public Usuario(String nickname, String password, String email) {
        this.nickname = nickname;
        this.password = password;
    }
    public boolean validarSenha(String senha){
        return senha.equals(password);
    }

    public String getNickname(){
        return nickname;
    }
}