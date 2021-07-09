package atividade06;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Orcamento {
    private Imposto imposto;
    private Date dataOrcamento;
    private Date dataPagamento;
    private double valorOrcamento;

    private Orcamento(double valorOrcamento) {
        this.valorOrcamento = valorOrcamento;
        this.dataOrcamento = new Date();
        Calendar calendario = Calendar.getInstance();
        calendario.setTime(dataOrcamento);
        calendario.add(Calendar.DAY_OF_MONTH, 10);
        this.dataPagamento = calendario.getTime();
    }

    private Orcamento(Builder builder) {
        this(builder.valor);
        this.imposto = builder.imposto;
    }

    static class Builder {
        private double valor;
        private Imposto imposto;

        public Builder(double valor) {
            this.valor = valor;
        }

        public Builder setImposto(Imposto imposto) {
            this.imposto = imposto;
            return this;
        }

        public Orcamento montar() {
            return new Orcamento(this);
        }
    }

    public double getValorOrcamento() {
        return valorOrcamento;
    }

    public Date getDataOrcamento() {
        return dataOrcamento;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public void info() {
        Date data = new Date();
        if(data.before(dataPagamento)) {
            DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
            DecimalFormat form = new DecimalFormat("0.00");
            System.out.println("Orçamento (" + format.format(dataOrcamento) + ") - Pagamento: " + format.format(dataPagamento));
            System.out.println("Valor do orçamento: " + form.format(valorOrcamento));
            if(imposto != null) System.out.println("Valor com imposto: " + form.format(imposto.calculo(this)));
        } else {
            System.out.println("Seu orçamento venceu, procure um profissional e resolva seu problema!");
        }
    }
}
