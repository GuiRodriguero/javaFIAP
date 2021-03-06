package br.com.excecoes.beans;

//Toda classe Beans/JavaBenas/DTO -> Data Transfer Object -> deve conter:
// 1 - Atributos privados
// 2 - Um construtor com parāmetros e um sem 
// 3 - Todo atributo deve ter um getter e um setter

public class Aluno {
	
	private int rm;
	private String nome;
	
	public Aluno(int rm, String nome) {
	
		super();
		this.rm = rm;
		this.nome = nome;
		
	}
	
	public Aluno() {
		super();
	}

	public int getRm() {
		return rm;
	}

	public void setRm(int rm) {
		if(rm<0) {
			throw new RuntimeException("Atualize o Linkedin");
		}
		this.rm = rm;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
