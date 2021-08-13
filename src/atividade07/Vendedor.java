package atividade07;

public class Vendedor implements Cargo {
    private Cargo cargo;

    @Override
    public void solicitacao(double credito) {
        String solicitacao = "Solicitando crédito para vendedor... ";
        if(credito <= 100) {
            solicitacao += "Crédito aprovado com êxito!";
            System.out.println(solicitacao);
        } else {
            solicitacao += "Crédito solicitado para o gerente!";
            System.out.println(solicitacao);
            cargo.solicitacao(credito);
        }
    }

    @Override
    public void proximoCargo(Cargo cargo) {
        this.cargo = cargo;
    }
}
