package Conta;
public class Main{
public static void main(String[] args) {
    Conta c3 = new Conta(3000.9);
    c3.depositar(10000.00);
    c3.sacar(1);
    System.out.println(c3.getSaldo());
}
}