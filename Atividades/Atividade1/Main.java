//Leonardo Cury Haddad 18.00442-3

public class Main {
    public static void main(String[] args) {
        User u1 = new User("Leo", "abc123", "lh@gmail.com");
        User u2 = new User("Murilo", "a1b2c3", "murilo@maua.br");
        User u3 = new User("Scalco", "00000", "scalco@maua.br");
        Account c1 = new Account(u1,1000);
        Account c2 = new Account(u2,250);
        Account c3 = new Account(u3, 3000);

        System.out.println("Saldo "+c1.getUser().getName() + " :" + c1.getBalance());
        System.out.println("Saldo "+c2.getUser().getName() + " :" + c2.getBalance());
        System.out.println("Saldo "+c3.getUser().getName() + " :" + c3.getBalance());

        Transaction transaction = new Transaction();

        String qr = transaction.recieve(c1, 250);
        transaction.send(c2, c1, qr);
        transaction.send(c3, c1, qr);
        transaction.send(c2, c1, qr);
        String qr2 = transaction.recieve(c2, 1000);
        transaction.send(c3, c2, qr2);

        System.out.println("Saldo final "+c1.getUser().getName() + " :"+ c1.getBalance());
        System.out.println("Saldo final "+c2.getUser().getName() + " :"+ c2.getBalance());
        System.out.println("Saldo final "+c3.getUser().getName() + " :" + c3.getBalance());
    }

}