package atividade02;

import java.util.List;

public interface Estado {
    void adicionar(Item item, List<Item> itens);
    void remover(Item item, List<Item> itens);

    void fechar(Pedido pedido);
    void abrir(Pedido pedido);
}
