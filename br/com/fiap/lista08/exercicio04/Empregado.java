package br.com.fiap.lista08.exercicio04;

public class Empregado {
    private String nome;
    private String funcao;
    private float salario;

    public Empregado(String nome, String funcao, float salario) {
        this.nome = nome;
        this.funcao = funcao;
        this.salario = salario;
    }

    public void aumentarSalario(float valorAumento){
        salario += valorAumento;
    }
}
