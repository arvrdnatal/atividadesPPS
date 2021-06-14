package atividade03;

public class Espada implements Arma {
    private int dano;

    public Espada() {
        this.dano = 15;
    }

    @Override
    public int qualDano() {
        return dano;
    }
}
