package atividade05;

import java.util.ArrayList;
import java.util.List;

public class PedidoBuilder extends Pedido {
    private List<ItemDoPedido> itens;
    ItemDoPedido item;

    public PedidoBuilder() {
    }

    public PedidoBuilder setObservacoes(String observacoes) {
        this.observacoes = observacoes;
        return this;
    }

    public PedidoBuilder listaDeItens() {
        itens = new ArrayList<>();
        return this;
    }

    public PedidoBuilder adicionar() {
        item = new ItemDoPedido();
        item.setQuantidade(1);
        return this;
    }

    public PedidoBuilder oProduto(Produto produto) {
        item.setProduto(produto);
        return this;
    }

    public PedidoBuilder comQuantidade(int quantidade) {
        item.setQuantidade(quantidade);
        return this;
    }

    public PedidoBuilder naLista() {
        itens.add(item);
        return this;
    }

    public PedidoBuilder constroiListaDeItens() {
        this.itensPedido.addAll(itens);
        return this;
    }

    public Pedido constroiPedido() {
        return new Pedido(this);
    }
}
