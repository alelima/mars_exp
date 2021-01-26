package sonda;

public class CoodenadaCompleta {
    private Ponto coordenada;
    private Direcao direcao;

    public CoodenadaCompleta(Ponto coordenada, Direcao direcao) {
        this.coordenada = coordenada;
        this.direcao = direcao;
    }

    public Ponto getCoordenada() {
        return coordenada;
    }

    public void setCoordenada(Ponto coordenada) {
        this.coordenada = coordenada;
    }

    public Direcao getDirecao() {
        return direcao;
    }

    public void setDirecao(Direcao direcao) {
        this.direcao = direcao;
    }
}
