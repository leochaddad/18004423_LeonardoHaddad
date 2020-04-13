
public class Vendedor {
    private double salarioBase;
    private final double comissao;
    private final GerenteVendas gerente;

    public Vendedor(final double salarioBase, final GerenteVendas gerente) {
        this.salarioBase = salarioBase;
        this.comissao = 0.05;
        this.gerente = gerente;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public double getComissao() {
        return comissao;
    }

    public GerenteVendas getGerente() {
        return gerente;
    }

    public double getSalarioFinal(final double totalVendasMes) {
        return salarioBase + comissao * totalVendasMes;
    }

    public boolean setSalarioBase(final double novoSalario, final GerenteVendas gerente) {
    if(gerente.equals(this.gerente)){
        this.salarioBase = novoSalario;
        return true;
    } else return false;
    
   }
}