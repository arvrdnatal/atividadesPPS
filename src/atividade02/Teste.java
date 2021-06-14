package atividade02;

public class Teste {
    public static void main(String[] args) {
        Produto cerveja = new Produto("Cerveja", 10);
        Produto carne = new Produto("Carne", 30);

        Cliente ze = new Cliente("ze");

        Pedido pedido = new Pedido(ze);

        Item item1 = new Item(2, cerveja); // 20,00
        Item item2 = new Item(carne); // 30,00

        pedido.adicionar(item1);
        pedido.fechar();
        pedido.adicionar(item2);
        pedido.remover(item1);
        System.out.println(pedido.total());

        pedido.reabrir();
        pedido.adicionar(item2);
        System.out.println("\n" + pedido.total());
    }
}
