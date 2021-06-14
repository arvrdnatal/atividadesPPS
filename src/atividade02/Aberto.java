package atividade02;

import java.util.List;

public class Aberto implements Estado {
    @Override
    public void adicionar(Item item, List<Item> itens) {
        itens.add(item);
    }

    @Override
    public void remover(Item item, List<Item> itens) {
        itens.remove(item);
    }

    @Override
    public void fechar(Pedido pedido) {
        pedido.setEstado(new Fechado());
    }

    @Override
    public void abrir(Pedido pedido) {
        System.out.println("O pedido ainda está aberto!");
    }
}
