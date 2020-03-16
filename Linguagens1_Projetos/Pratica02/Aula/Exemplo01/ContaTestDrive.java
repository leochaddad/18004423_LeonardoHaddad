
public class ContaTestDrive{
    public static void main(final String[] args) {
        //Declara c1 sem nada dentro
        Conta c1, c2;
        //Instancia conta - coloca referencia de um objeto
        c1 = new Conta();
        c2 = new Conta();
        //Acessa o titular da conta
        c1.titular = "Odair";
        System.out.println(c1.titular);
        c2.saldo = 15;
        c1.saldo = 200;
        c1.sacar(40);
        c1.vizualizarSaldo();
        c1.transferirPara(c2,100);
        c1.vizualizarSaldo();
        c2.vizualizarSaldo();
    }
}