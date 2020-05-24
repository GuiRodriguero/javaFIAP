package br.com.fiap.lista09.exercicio01;

import java.io.Serializable;

public class ContaBancaria implements Serializable {
    private double saldo;
    private Titular titular;
    private int agencia;
    private String numeroConta;


    public void sacar (double valor){
        if(saldo > valor){
            saldo -= valor;
        }else{
            System.out.println("Você não possui saldo suficiente para efetuar esta operação.");
        }

    }

    public void depositar (double valor){
        saldo += valor;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }
}
