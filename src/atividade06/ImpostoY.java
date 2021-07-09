package atividade06;

public class ImpostoY extends Imposto {
    private static Imposto IMPOSTOY = null;

    @Override
    protected void calcular(Orcamento orcamento) {
        if(valor > 50) {
            this.valor = orcamento.getValorOrcamento() * 0.20;
        } else {
            this.valor = orcamento.getValorOrcamento() * 0.30;
        }
    }

    @Override
    protected double cobrar(double valor) {
        return valor + this.valor;
    }

    public static Imposto getInstance() {
        if(IMPOSTOY == null) {
            IMPOSTOY = new ImpostoY();
        }
        return IMPOSTOY;
    }
}
