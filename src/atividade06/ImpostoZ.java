package atividade06;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class ImpostoZ extends Imposto {
    private static Imposto IMPOSTOZ = null;

    @Override
    protected void calcular(Orcamento orcamento) {
        if(valor > 100) {
            this.valor = orcamento.getValorOrcamento() * 0.10;
        } else {
            LocalDate orca = orcamento.getDataOrcamento().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            Calendar calendario = Calendar.getInstance();
            calendario.setTime(new Date());
            //exemplo de três dias passados da data do orçamento
            calendario.add(Calendar.DAY_OF_MONTH, 3);
            LocalDate dataAtual = calendario.getTime().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            int dias = Math.toIntExact(orca.until(dataAtual, ChronoUnit.DAYS)), cont = 0;
            double valor = orcamento.getValorOrcamento(), v = 0;

            while(cont < dias) {
                v += valor * 0.01;
                cont ++;
            }

            this.valor = v;
        }
    }

    @Override
    protected double cobrar(double valor) {
        return valor + this.valor;
    }

    public static Imposto getInstance() {
        if(IMPOSTOZ == null) {
            IMPOSTOZ = new ImpostoZ();
        }
        return IMPOSTOZ;
    }
}
