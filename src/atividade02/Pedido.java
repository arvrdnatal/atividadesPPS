package atividade02;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private LocalDate data;
    private Cliente cliente;
    private List<Item> itens;
    private Estado estado;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.data = LocalDate.now();
        this.itens = new ArrayList<>();
        this.estado = new Aberto();
    }

    public void adicionar(Item item) {
        this.estado.adicionar(item, this.itens);
    }

    public void remover(Item item) {
        this.estado.remover(item, this.itens);
    }

    public void fechar() {
        this.estado.fechar(this);
    }

    public void reabrir() {
        this.estado.abrir(this);
    }

    public float total() {
        float total = 0;
        for(Item item: this.itens) {
            total = total + item.subTotal();
        }
        return total;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}
