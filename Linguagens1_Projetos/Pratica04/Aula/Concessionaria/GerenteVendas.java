

public class GerenteVendas {
    private final double salarioBase;
    private final double comissao;

    public GerenteVendas(final double salarioBase) {
        this.salarioBase = salarioBase;
        this.comissao = 0.10;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public double getComissao() {
        return comissao;
    }

    public double getSalarioFinal(final double totalVendasMes) {
        return 0.5 * salarioBase + comissao * totalVendasMes;
    }

    public boolean darAumento(final Vendedor vendedor, final double aumento) {
        final double novoSalarioBase = vendedor.getSalarioBase() * (1.0 + aumento);
    return vendedor.setSalarioBase(novoSalarioBase, this);
}
   
}