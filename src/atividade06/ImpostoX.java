package atividade06;

public class ImpostoX extends Imposto {
    private static Imposto IMPOSTOX = null;

    @Override
    protected void calcular(Orcamento orcamento) {
        if(valor > 100) {
            this.valor = orcamento.getValorOrcamento() * 0.10;
        } else {
            this.valor = orcamento.getValorOrcamento() * 0.20;
        }
    }

    @Override
    protected double cobrar(double valor) {
        return valor + this.valor;
    }

    public static Imposto getInstance() {
        if(IMPOSTOX == null) {
            IMPOSTOX = new ImpostoX();
        }
        return IMPOSTOX;
    }
}
