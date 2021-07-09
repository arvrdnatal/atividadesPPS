package atividade06;

public class Main {
    public static void main(String[] args) {
        Orcamento o1 = new Orcamento.Builder(80).setImposto(ImpostoX.getInstance()).montar();
        //o1.info();

        Orcamento o2 = new Orcamento.Builder(30).setImposto(ImpostoY.getInstance()).montar();
        //o2.info();

        Orcamento o3 = new Orcamento.Builder(30).setImposto(ImpostoZ.getInstance()).montar();
        o3.info();
    }
}
