package br.com.fiap.lista09.exercicio01;

import java.io.Serializable;

public class ContaPoupanca implements Serializable {
    private double taxaJuros;

    public void atualizarSaldo(){
        ContaBancaria conta = new ContaBancaria();

        conta.setSaldo(conta.getSaldo() + (conta.getSaldo() * (taxaJuros/100)));
    }

    public double getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }
}
