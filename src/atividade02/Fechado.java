package atividade02;

import java.util.List;

public class Fechado implements Estado {
    @Override
    public void adicionar(Item item, List<Item> itens) {
        System.out.println("Não é possível adicionar um item, o pedido já está fechado!");
    }

    @Override
    public void remover(Item item, List<Item> itens) {
        System.out.println("Não é possível remover um item, o pedido já está fechado!");
    }

    @Override
    public void fechar(Pedido pedido) {
        System.out.println("O pedido já está fechado!");
    }

    @Override
    public void abrir(Pedido pedido) {
        pedido.setEstado(new Aberto());
    }
}
