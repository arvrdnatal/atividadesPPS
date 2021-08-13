package atividade07;

public class Cliente {
    private String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public void solicitarCredito(double credito) {
        new SolicitarCredito().solicitar(credito);
    }
}
