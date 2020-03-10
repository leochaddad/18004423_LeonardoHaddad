package exemplo01;
public class Conta {
    
    public int numero;
    public String titular, cpf;
    public double saldo;

    void depositar(final double valor) {
        this.saldo += valor;
    }

    boolean sacar(final double valor) {
        if (this.saldo < valor) {
            return false;
        } else {
            this.saldo -= valor;
            return true;
        }
    }

    boolean transferirPara(final Conta destino, final double valor) {
        if (sacar(valor)){
            //destino.saldo+=valor; Prática ruim, alto acoplamento
            destino.depositar(valor);
            return true;
        }
        else{
            return false;
        }
    }

    void vizualizarSaldo(){
        System.out.println("Saldo: R$" + this.saldo);
    }    
}