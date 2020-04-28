package Aula3.banco;
import java.security.SecureRandom;

public class Conta {
    SecureRandom numero = new SecureRandom();

    private Aluno titular;
    private int numeroConta; //receberá um valor aleatório


    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta() {
        numeroConta = numero.nextInt(100);
    }

}
