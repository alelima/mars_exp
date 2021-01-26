package sonda;

public enum Direcao {
    N("E", "W"),
    S("W", "E"),
    E("S", "N"),
    W("N", "S");

    private Direcao(String aDireita, String aEsquerda) {
        this.aDireita = aDireita;
        this.aEsquerda = aEsquerda;
    }

    private String aDireita;
    private String aEsquerda;

    public Direcao aDireita() {
        return Direcao.valueOf(this.aDireita);
    }

    public Direcao aEsquerda() {
        return Direcao.valueOf(this.aEsquerda);
    }
}
