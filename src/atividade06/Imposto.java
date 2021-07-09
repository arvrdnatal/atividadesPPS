package atividade06;

public abstract class Imposto {
    protected double valor;

    protected final double calculo(Orcamento orcamento) {
        calcular(orcamento);
        return cobrar(orcamento.getValorOrcamento());
    }

    protected abstract void calcular(Orcamento orcamento);
    protected abstract double cobrar(double valor);

    protected double getValor() {
        return valor;
    }
}
