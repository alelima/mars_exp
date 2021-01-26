package mensagem;

public class Mensagem {

    private String informacaoLimiteSuperiorDireito;
    private String informacaoPosicaoInicial;
    private String instrucoes;

    public Mensagem(String dadosTransmitidos) {
        String[] linhas = dadosTransmitidos.split("\\n");
        informacaoLimiteSuperiorDireito = linhas[0];
        informacaoPosicaoInicial = linhas[1];
        instrucoes = linhas[2];
    }

    public String getInformacaoLimiteSuperiorDireito() {
        return informacaoLimiteSuperiorDireito;
    }

    public void setInformacaoLimiteSuperiorDireito(String informacaoLimiteSuperiorDireito) {
        this.informacaoLimiteSuperiorDireito = informacaoLimiteSuperiorDireito;
    }

    public String getInformacaoPosicaoInicial() {
        return informacaoPosicaoInicial;
    }

    public void setInformacaoPosicaoInicial(String informacaoPosicaoInicial) {
        this.informacaoPosicaoInicial = informacaoPosicaoInicial;
    }

    public String getInstrucoes() {
        return instrucoes;
    }

    public void setInstrucoes(String instrucoes) {
        this.instrucoes = instrucoes;
    }
}
