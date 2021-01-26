package sonda;

import java.util.ArrayList;

public class SistemaControlador {

    private ArrayList<Instrucao> instrucoes;

    public ArrayList<Instrucao> getInstrucoes() {
        return instrucoes;
    }

    public void setInstrucoes(ArrayList<Instrucao> instrucoes) {
        this.instrucoes = instrucoes;
    }

    public void executaInstrucoes(Navegador navegador) {
        for (Instrucao instrucao: instrucoes ) {
            switch (instrucao) {
                case L:
                    navegador.girarParaEsquerda();
                    break;
                case R:
                    navegador.girarParaDireita();
                    break;
                case M:
                    navegador.irParaFrente();
                default:
                    break;
            }
        }
    }
}
