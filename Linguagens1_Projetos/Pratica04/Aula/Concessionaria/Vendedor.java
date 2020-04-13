
public class Vendedor extends Funcionario{

    private final GerenteVendas gerente;

    public Vendedor(final double salarioBase, final GerenteVendas gerente) {
        super(salarioBase);
        this.gerente = gerente;
    }

    public GerenteVendas getGerente() {
        return gerente;
    }

    public boolean setSalarioBase(final double novoSalario, final GerenteVendas gerente) {
    if(gerente.equals(this.gerente)){
        this.salarioBase = novoSalario;
        return true;
    } else return false;
    
   }
}