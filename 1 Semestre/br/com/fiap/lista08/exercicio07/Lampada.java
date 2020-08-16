package br.com.fiap.lista08.exercicio07;

public class Lampada {
    private String cor;
    private boolean ligada;

    public Lampada(){

    }

    public Lampada(String cor, boolean ligada) {
        this.cor = cor;
        this.ligada = ligada;
    }

    public Lampada(String cor) {
        this.cor = cor;
        ligada = true;
    }

}
