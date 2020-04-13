public class RH {
    public static void rodarRH(){
        Funcionario f1;
        f1 = new Funcionario(1000);
        System.out.println("Salario vendedor: " + f1.getSalarioFinal(10000));
        GerenteVendas g1 = new GerenteVendas(5000);
        Vendedor v1 = new Vendedor(1000, g1);
        g1.darAumento(v1, 0.3);
        System.out.println("Salario V1: "+v1.getSalarioBase());
    }
}