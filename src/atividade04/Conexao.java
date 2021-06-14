package atividade04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Conexao implements CaminhoComposto {
    private double taxa;
    private List<Caminho> caminhos;

    public Conexao(double taxa) {
        this.taxa = taxa;
        this.caminhos = new ArrayList<>();
    }

    @Override
    public double valor() {
        double valor = this.taxa;
        for(Caminho caminho : this.caminhos) {
            valor += caminho.valor();
        }
        return valor;
    }

    @Override
    public void adicionarCaminhos(Caminho... caminho) {
        this.caminhos.addAll(Arrays.stream(caminho).toList());
    }
}
