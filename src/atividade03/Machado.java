package atividade03;

public class Machado implements Arma {
    private int dano;

    public Machado() {
        this.dano = 20;
    }

    @Override
    public int qualDano() {
        return this.dano;
    }
}
