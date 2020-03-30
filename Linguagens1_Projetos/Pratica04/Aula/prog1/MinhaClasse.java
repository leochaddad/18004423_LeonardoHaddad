package prog1;
public class MinhaClasse {
    private static int contaObjetos = 0;
    public MinhaClasse(){
        contaObjetos +=1;
    }
    public int getContaObjetos(){
        return contaObjetos;
    }
}