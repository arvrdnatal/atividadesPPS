package atividade04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Viagem {
    private List<Caminho> caminhos;

    public Viagem(Caminho ... caminho) {
        this.caminhos = new ArrayList<>();
        this.caminhos.addAll(Arrays.stream(caminho).toList());
    }

    public double valorTotal() {
        double valor = 0;
        for(Caminho caminho : this.caminhos) {
            valor += caminho.valor();
        }
        return valor;
    }
}
