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

    public Ponto decodificaPosicaoInicialSonda() {
        String[] informacao = mensagem.getInformacaoPosicaoInicial().split(" ");
        return new Ponto(Integer.parseInt(informacao[0]), Integer.parseInt(informacao[1]));
    }

    public Direcao decodificaDirecaoInicialSonda() {
        String[] informacao = mensagem.getInformacaoPosicaoInicial().split(" ");
        return Direcao.valueOf(informacao[2]);
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
