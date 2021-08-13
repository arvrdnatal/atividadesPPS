package atividade07;

public class Gerente implements Cargo {
    private Cargo cargo;

    @Override
    public void solicitacao(double credito) {
        String solicitacao = "Solicitando crédito para gerente... ";
        if(credito <= 500) {
            solicitacao += "Crédito aprovado com êxito!";
            System.out.println(solicitacao);
        } else {
            solicitacao += "Crédito solicitado para o diretor!";
            System.out.println(solicitacao);
            cargo.solicitacao(credito);
        }
    }

    @Override
    public void proximoCargo(Cargo cargo) {
        this.cargo = cargo;
    }
}
