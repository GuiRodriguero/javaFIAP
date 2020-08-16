package br.com.fiap.lista09.exercicio01;

public class TesteBanco {

    public static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaBancaria();
        contaBancaria.depositar(500);
        contaBancaria.sacar(100);
    }
}
