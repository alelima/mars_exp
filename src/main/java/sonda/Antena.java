package sonda;

import mensagem.Mensagem;

import java.util.ArrayList;

public final class Antena {

    private Mensagem mensagem;

    public void recebe(Mensagem mensagem) {
        this.mensagem = mensagem;
    }

    public Ponto decodificaPontoLimite() {
        String[] pontos = mensagem.getInformacaoLimiteSuperiorDireito().split(" ");
        return new Ponto(Integer.parseInt(pontos[0]), Integer.parseInt(pontos[1]));
    }

    public CoodenadaCompleta decodificaPosicaoInicialSonda() {
        String[] informacao = mensagem.getInformacaoPosicaoInicial().split(" ");
        Ponto pontoInicial = new Ponto(Integer.parseInt(informacao[0]), Integer.parseInt(informacao[1]));
        return new CoodenadaCompleta(pontoInicial, Direcao.valueOf(informacao[2]));
    }

    public ArrayList<Instrucao> decodificaInstrucoes() {
        String[] comandos = mensagem.getInstrucoes().split("");
        ArrayList<Instrucao> instrucoes = new ArrayList<Instrucao>();
        for (int i = 0; i < comandos.length;  i++) {
            instrucoes.add(Instrucao.valueOf(comandos[i]));
        }
        return instrucoes;
    }
}
