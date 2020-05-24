package br.com.fiap.lista09.exercicio02;

public class Aviao extends Transporte{
    private String prefixo;
    private int quantidadeTurbinas;

    public String getPrefixo() {
        return prefixo;
    }

    public void setPrefixo(String prefixo) {
        this.prefixo = prefixo;
    }

    public int getQuantidadeTurbinas() {
        return quantidadeTurbinas;
    }

    public void setQuantidadeTurbinas(int quantidadeTurbinas) {
        this.quantidadeTurbinas = quantidadeTurbinas;
    }
}
