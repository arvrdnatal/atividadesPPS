package atividade05;

import java.util.Objects;

public class Produto {
    // obrigatórios
    private String nome;
    private float preco;
    //opcionais
    protected String observacoes;

    public Produto(String nome, float preco) {
        this.nome = nome;
        this.preco = preco;
    }

    protected Produto(ProdutoBuilder builder) {
        this(builder.nome(), builder.preco());
        this.observacoes = Objects.requireNonNullElse(builder.observacoes, "vazio");
    }

    public String nome() {
        return nome;
    }

    public float preco() {
        return preco;
    }

    public String obs() {
        return observacoes;
    }
}
