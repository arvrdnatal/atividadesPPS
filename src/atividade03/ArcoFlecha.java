package atividade03;

public class ArcoFlecha implements Arma {
    private int dano;

    public ArcoFlecha() {
        this.dano = 10;
    }

    @Override
    public int qualDano() {
        return this.dano;
    }
}
