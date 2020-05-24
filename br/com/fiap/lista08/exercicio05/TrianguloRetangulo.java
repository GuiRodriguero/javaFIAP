package br.com.fiap.lista08.exercicio05;
import java.lang.Math;

public class TrianguloRetangulo {
    private double cateto1;
    private double cateto2;

    public TrianguloRetangulo(){

    }

    public TrianguloRetangulo(float cateto1, float cateto2) {
        this.cateto1 = cateto1;
        this.cateto2 = cateto2;
    }

    public double calcularHipotenusa(){
        double hipotenusa = 0;

        hipotenusa = ((Math.pow(cateto1, 2)) + (Math.pow(cateto2, 2)));
        Math.sqrt(hipotenusa);

        return hipotenusa;
    }
}
