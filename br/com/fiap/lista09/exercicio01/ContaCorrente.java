package br.com.fiap.lista09.exercicio01;

import java.io.Serializable;

public class ContaCorrente extends ContaBancaria implements Serializable {
    private double limiteCredito;

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }
}
