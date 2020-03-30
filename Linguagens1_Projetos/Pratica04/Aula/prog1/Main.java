package prog1;
public class Main {
    public static void main(String[] args) {
        MinhaClasse m1 = new MinhaClasse();
        System.out.println("Total de objetos: " + m1.getContaObjetos());
        Personagem p1 = new Personagem("allmight");
        System.out.println("URL = " + p1.getUrl());
    }
}