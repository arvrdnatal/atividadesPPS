package atividade07;

public class Diretor implements Cargo {
    private Cargo cargo;

    @Override
    public void solicitacao(double credito) {
        String solicitacao = "Solicitando crédito para diretor... ";
        if(credito <= 1000) {
            solicitacao += "Crédito aprovado com êxito!";
            System.out.println(solicitacao);
        } else {
            solicitacao += "Crédito solicitado para o presidente!";
            System.out.println(solicitacao);
            cargo.solicitacao(credito);
        }
    }

    @Override
    public void proximoCargo(Cargo cargo) {
        this.cargo = cargo;
    }
}
