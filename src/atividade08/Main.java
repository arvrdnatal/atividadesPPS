package atividade08;

public class Main {
    public static void main(String[] args) {
        Controle controleRemoto = new Controle();
        Botao ligar = new Botao(new AcaoLigar());
        Botao desligar = new Botao(new AcaoDesligar());
        Botao aumentaTemperatura = new Botao(new AcaoAumentoTemp());
        Botao diminuiTemperatura = new Botao(new AcaoDiminuiTemp());

        controleRemoto.adicionar(ligar);
        controleRemoto.adicionar(desligar);
        controleRemoto.adicionar(aumentaTemperatura);
        controleRemoto.adicionar(diminuiTemperatura);

        ligar.pressionar();
        aumentaTemperatura.pressionar();
        diminuiTemperatura.pressionar();
        desligar.pressionar();
        System.out.println();

        Macro macro = new Macro();
        macro.adicionarAcao(new AcaoLigar());
        macro.adicionarAcao(new AcaoDesligar());
        macro.adicionarAcao(new AcaoAumentoTemp());
        macro.adicionarAcao(new AcaoDiminuiTemp());
        macro.executar();
        System.out.println();

        Voz controleVoz = new Voz();
        Frase ligarAr = new Frase(new AcaoLigar());
        Frase desligarAr = new Frase(new AcaoDesligar());
        Frase fazerCombo = new Frase(macro);

        controleVoz.adicionar(ligarAr);
        controleVoz.adicionar(desligarAr);
        controleVoz.adicionar(fazerCombo);

        ligarAr.dizer();
        desligarAr.dizer();
        fazerCombo.dizer();
    }
}
