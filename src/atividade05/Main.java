package atividade05;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new ProdutoBuilder("Caneta", 10.00f).constroi();
        Produto produto2 = new ProdutoBuilder("Caderno", 20.00f).constroi();

        Pedido pedido = new PedidoBuilder()
                .listaDeItens()
                    .adicionar().oProduto(produto1).comQuantidade(4).naLista()
                    .adicionar().oProduto(produto2).naLista()
                .constroiListaDeItens()
                .constroiPedido();

        System.out.println(pedido.toString());
    }
}
