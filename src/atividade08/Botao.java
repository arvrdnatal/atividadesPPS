package atividade08;

public class Botao {
    private Acao acao;

    public Botao(Acao acao) {
        this.acao = acao;
    }

    public void pressionar() {
        acao.executar();
    }
}
