package Aula3;

public class PessoaTest {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Guilherme");
        pessoa1.setIdade(18);
        pessoa1.setAltura(1.78f);
        pessoa1.exibirDados();

        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome("Fábio");
        pessoa2.setIdade(36);
        pessoa2.setAltura(1.80f);
        pessoa2.exibirDados();

        Pessoa pessoa3 = new Pessoa();
        pessoa3.setNome("João");
        pessoa3.setIdade(15);
        pessoa3.setAltura(1.83f);
        pessoa3.exibirDados();
    }
}
