package atividade07;

import java.util.ArrayList;
import java.util.List;

public class SolicitarCredito {
    public void solicitar(double credito) {
        int index = 0;
        List<Cargo> cargos = new ArrayList<>();
        cargos.add(new Vendedor());
        cargos.add(new Gerente());
        cargos.add(new Diretor());
        cargos.add(new Presidente());

        for(Cargo cargo : cargos) {
            if(index < cargos.size() - 1) {
                cargo.proximoCargo(cargos.get(index + 1));
            }
            index++;
        }

        cargos.get(0).solicitacao(credito);
    }
}
