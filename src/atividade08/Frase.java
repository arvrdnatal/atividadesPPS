package atividade08;

public class Frase {
    private Acao acao;

    public Frase(Acao acao) {
        this.acao = acao;
    }

    public void dizer() {
        acao.executar();
    }
}
