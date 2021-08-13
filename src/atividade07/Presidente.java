package atividade07;

public class Presidente implements Cargo {
    @Override
    public void solicitacao(double credito) {
        String solicitacao = "Solicitando crédito para presidente... ";
        if(credito > 1000) {
            solicitacao += "Crédito aprovado com êxito!";
            System.out.println(solicitacao);
        }
    }

    @Override
    public void proximoCargo(Cargo cargo) {
        // fim da cadeia
    }
}
