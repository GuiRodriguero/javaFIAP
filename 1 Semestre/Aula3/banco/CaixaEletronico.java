package Aula3.banco;
import javax.swing.JOptionPane;

public class CaixaEletronico {

    private float saldo;

    public void sacar(float valor){
        if(saldo >= valor){
            saldo -= valor;
            JOptionPane.showMessageDialog(null, "Valor do Saqe: " + valor + "\nSaldo Atual: "+ getSaldo());
        }else{
            JOptionPane.showMessageDialog(null, "Você não tem saldo suficiente para executar esta operação");
        }
    }

    public void depositar(float valor){
        saldo += valor;
        JOptionPane.showMessageDialog(null, "Valor do Depósito: " + valor +  "\nSaldo atual: " + getSaldo());
    }


    public void imprimirDadosConta(String nome, String cpf, String nConta){
        JOptionPane.showMessageDialog(null, "Nome: " + nome + "\nNúmero da Conta: " + nConta +"\nCPF: " + cpf + "\n\nSaldo = " + getSaldo());
    }

    public float getSaldo() {
        return saldo;
    }
}
