package atividade01;

public class Dinheiro implements Pagamento {
    @Override
    public void formaPagamento(Compra compra) {
        System.out.println("Compra de R$ " + compra.getValorTotal() + " paga com DINHEIRO!");
    }
}
