package sonda;

import mensagem.Mensagem;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

//Classe teste usada para TDD
class SondaTest {

    @Test
    public void testarRecebimentoMensagemExecucaoMissaoSonda1() {
        String dadosTransmitidos =  "5 5\n" +
                "1 2 N\n" +
                "LMLMLMLMM";

        Mensagem mensagem = new Mensagem(dadosTransmitidos);
        Sonda sonda = new Sonda();
        sonda.recebe(mensagem);

        Assertions.assertEquals("1 3 N", sonda.transmiteNovaPosicao());
    }

    @Test
    public void testarRecebimentoMensagemExecucaoMissaoSonda2() {
        String dadosTransmitidos =  "5 5\n" +
                "3 3 E\n" +
                "MMRMMRMRRM";

        Mensagem mensagem = new Mensagem(dadosTransmitidos);
        Sonda sonda = new Sonda();
        sonda.recebe(mensagem);

        Assertions.assertEquals("5 1 E", sonda.transmiteNovaPosicao());
    }

}