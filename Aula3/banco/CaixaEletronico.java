package Aula3.banco;
import javax.swing.JOptionPane;

public class CaixaEletronico {
    private float saldo;
    private boolean logado;

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

    public float getSaldo(){
        return saldo;
    }

    public void imprimirDadosConta(){

    }

    public boolean isLogar(Conta conta, String senha){
        return logado;
    }
}
