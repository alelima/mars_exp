package sonda;

public class Navegador {

    private Ponto limiteSuperior;
    private Ponto coordenada;
    private Direcao direcao;

    public Ponto getLimiteSuperior() {
        return limiteSuperior;
    }

    public void setLimiteSuperior(Ponto limiteSuperior) {
        this.limiteSuperior = limiteSuperior;
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

    public void setCoordenadaCompleta(CoodenadaCompleta coordenadaCompleta) {
        this.coordenada = coordenadaCompleta.getCoordenada();
        this.direcao = coordenadaCompleta.getDirecao();
    }

    public void girarParaEsquerda() {
        direcao = direcao.aEsquerda();
    }

    public void girarParaDireita() {
        direcao = direcao.aDireita();
    }

    public void irParaFrente() {
        switch (direcao) {
            case N:
                this.incrementarCoordenadaY(1);
                break;
            case S:
                this.incrementarCoordenadaY(-1);
                break;
            case E:
                this.incrementarCoordenadaX(1);
                break;
            case W:
                this.incrementarCoordenadaX(-1);
                break;
            default:
                break;
        }
    }

    private void incrementarCoordenadaY(int incremento) {
        if(coordenada.y + incremento < 0 || coordenada.y + incremento > limiteSuperior.y) {
            return;
        }
        coordenada.y = coordenada.y + incremento;
    }

    private void incrementarCoordenadaX(int incremento) {
        if(coordenada.x + incremento < 0 || coordenada.x + incremento > limiteSuperior.x) {
            return;
        }
        coordenada.x = coordenada.x + incremento;
    }

    @Override
    public String toString() {
        return coordenada.x + " " + coordenada.y + " " + direcao;
    }
}
