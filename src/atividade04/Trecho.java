package atividade04;

public class Trecho implements Caminho {
    private double valor;

    public Trecho(double valor) {
        this.valor = valor;
    }

    @Override
    public double valor() {
        return this.valor;
    }
}
