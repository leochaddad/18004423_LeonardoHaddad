public class GerenteVendas extends Funcionario{

    public GerenteVendas(final double salarioBase) {
        super(salarioBase, 0.1);
    }

    public boolean darAumento(final Vendedor vendedor, final double aumento) {
        final double novoSalarioBase = vendedor.getSalarioBase() * (1.0 + aumento);
    return vendedor.setSalarioBase(novoSalarioBase, this);
}   
    @Override
    public double getSalarioFinal(double totalVendasMes){
        return salarioBase+comissao*totalVendasMes +0.5*salarioBase;
    }
   
}