package sonda;

import mensagem.Mensagem;

public class Sonda {

    private Antena antena;
    private SistemaControlador sistemaControlador;
    private Navegador navegador;

    public Sonda() {
        this.antena = new Antena();
        this.sistemaControlador = new SistemaControlador();
        this.navegador = new Navegador();
    }

    public void recebe(Mensagem mensagem) {
        antena.recebe(mensagem);
        navegador.setLimiteSuperior(antena.decodificaPontoLimite());
        navegador.setCoordenada(antena.decodificaPosicaoInicialSonda());
        navegador.setDirecao(antena.decodificaDirecaoInicialSonda());
        sistemaControlador.setInstrucoes(antena.decodificaInstrucoes());
        sistemaControlador.executaInstrucoes(navegador);
    }

    public String transmiteNovaPosicao() {
        return navegador.toString();
    }
}
