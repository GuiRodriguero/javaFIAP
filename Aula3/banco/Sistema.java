package Aula3.banco;
import javax.swing.JOptionPane;

public class Sistema {
    public static void main(String[] args) {
        CaixaEletronico caixa = new CaixaEletronico();
        Integer escolhaAux = 0;

        do{
            Integer escolha = Integer.parseInt(JOptionPane.showInputDialog("1 - Sacar\n2 - Depositar\n3 - Imprimir Dados\n 0 - Sair"));
            if(escolha == 1){
                Float valor = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do Saque: "));
                caixa.sacar(valor);
            }
            if(escolha == 2){
                Float valor = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do Depósito: "));
                caixa.depositar(valor);
            }
            if(escolha == 3){
                caixa.imprimirDadosConta();
            }
            escolhaAux = escolha;
        }while(escolhaAux != 0);

    }
}
