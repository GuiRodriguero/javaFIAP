package Aula3.banco;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Aluno {
    private String nome;
    private LocalDate dataNascimento;
    private String cpf;
    private String senha;

    //DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    //int anoNascimneto = dataNascimento.getYear();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
