package Conta;

public class Conta {
    private double saldo;
    public void sacar(final double valor) {
        if (valor <= saldo) {
            this.saldo -= valor;
        }
    }

    public void depositar(final double valor) {
        this.saldo += valor;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public Conta(final double saldoinicial) {
        this.saldo = saldoinicial;
    }
}