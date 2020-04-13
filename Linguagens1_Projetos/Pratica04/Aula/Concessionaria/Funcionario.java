public class Funcionario {
    protected double salarioBase;
    protected double comissao;

    public Funcionario(double salarioBase){ //Quando é passado 1 param
        this.salarioBase = salarioBase;
        this.comissao = 0.05;
    }
    public Funcionario(double salarioBase, double comissao){//Quando são passados 2 params
        this.salarioBase = salarioBase;
        this.comissao = comissao;
    }

   public double getSalarioBase() {
       return salarioBase;
   }
   public double getComissao() {
       return comissao;
   }
   public double getSalarioFinal(double totalVendasMes){
       return salarioBase+comissao*totalVendasMes;
   }
}