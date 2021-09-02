package atividade08;

import java.util.ArrayList;
import java.util.List;

public class Controle {
    private List<Botao> botoes;

    public Controle() {
        this.botoes = new ArrayList<>();
    }

    public void adicionar(Botao botao) {
        botoes.add(botao);
    }
}
