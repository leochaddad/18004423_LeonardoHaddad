//Leonardo Cury Haddad 18.00442-3

import java.util.Random;

public class Transaction {
public String recieve(Account account,  double amount){
    Random r = new Random();
    int trID = r.nextInt((9999-1000)+1)+1000;
    String QR = (account.getID()+ ";" + account.getUser().getName()+ ";" + amount + ";"+ trID);
    System.out.println("TRANSACTION QR: " + QR);
    return(QR);
}
public boolean send(Account sending, Account recieving, String QR ){
    double value = Double.parseDouble((QR.split(";")[2]));
    if(sending.withdrawal(value)){
        recieving.deposit(value);
        System.out.println("Transaction Succeeded");
        return(true);
    }else{
        System.out.println("Transaction Failed: Insufficient balance");
        return(false); 
    }
}
}