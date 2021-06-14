package atividade01;

import java.math.BigDecimal;

public class Compra {
    private BigDecimal valorTotal;

    public Compra(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public void pagar(Pagamento pagamento) {
        pagamento.formaPagamento(this);
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }
}
