package atividade05;

public class ProdutoBuilder extends Produto {
    public ProdutoBuilder(String nome, float preco) {
        super(nome, preco);
    }

    public ProdutoBuilder setObservacoes(String observacoes) {
        this.observacoes = observacoes;
        return this;
    }

    public Produto constroi() {
        return new Produto(this);
    }
}
