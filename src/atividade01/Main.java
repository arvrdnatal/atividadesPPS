package atividade01;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
        Compra compra = new Compra(new BigDecimal(247).setScale(2, RoundingMode.HALF_EVEN));
        compra.pagar(new Dinheiro());
        compra.pagar(new CartaoDeCredito());
        compra.pagar(new Cheque());
    }
}
