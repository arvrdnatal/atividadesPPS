package atividade08;

import java.util.ArrayList;
import java.util.List;

public class Voz {
    private List<Frase> frases;

    public Voz() {
        this.frases = new ArrayList<>();
    }

    public void adicionar(Frase frase) {
        frases.add(frase);
    }
}
