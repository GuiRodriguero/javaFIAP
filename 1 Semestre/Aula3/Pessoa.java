package Aula3;
//trabalhando com classes

import java.time.LocalDate;

public class Pessoa {
    //atributos
    private String nome;
    private int idade;
    private float altura;

    //métodos
    public void exibirDados(){
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Altura: " + getAltura());
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void trabalhar(){
        System.out.println(nome + " está trabalhando.");
    }
}
