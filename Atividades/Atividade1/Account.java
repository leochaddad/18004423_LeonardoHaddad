//Leonardo Cury Haddad 18.00442-3

public class Account {
private static int ID;
private int pID;
private double balance;
private User user;

public Account(User user, double initialBalance){
    ID+=1;
    this.pID = ID;
    this.user = user;
    this.balance = initialBalance;
}

public boolean withdrawal(double value){
    if(this.balance >= value){
        this.balance-=value;
        return(true);}
        else return(false);
}
public void deposit(double value){
    this.balance +=value;
}

public User getUser(){
    return(this.user);
}
public double getBalance(){
    return(this.balance);
}
public int getID(){
    return(this.pID);
}


}