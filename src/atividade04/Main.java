package atividade04;

public class Main {
    public static void main(String[] args) {
        Trecho trecho1 = new Trecho(500);
        Trecho trecho2 = new Trecho(300);
        Trecho trecho3 = new Trecho(350);

        Conexao conexao1 = new Conexao(30);
        conexao1.adicionarCaminhos(trecho2, trecho3);
        Conexao conexao2 = new Conexao(50);
        conexao2.adicionarCaminhos(trecho1, conexao1);

        //System.out.println(conexao1.valor()); // R$ 680,00
        //System.out.println(conexao2.valor()); // R$ 1230,00

        System.out.println(new Viagem(conexao2).valorTotal()); // R$ 1230,00
    }
}
