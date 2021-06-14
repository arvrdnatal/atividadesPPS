package atividade03;

public class SemArma implements Arma {
    private int dano;

    public SemArma() {
        this.dano = 1;
    }

    @Override
    public int qualDano() {
        return this.dano;
    }
}
