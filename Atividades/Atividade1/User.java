//Leonardo Cury Haddad 18.00442-3

public class User {
private String name, password, email;
public User(String name, String password, String email){
    this.name = name;
    this.password = password;
    this.email = email;
}
public String getName(){
    return(this.name);
}
}