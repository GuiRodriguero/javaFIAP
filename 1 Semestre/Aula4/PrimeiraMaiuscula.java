package Aula4;
import javax.swing.JOptionPane;
public class PrimeiraMaiuscula {
    public static void main(String[] args) {
        String palavra = JOptionPane.showInputDialog("Digite uma palavra para vê-la a primeira letra em maiúsculo: ").toLowerCase();
        palavra = palavra.substring(0,1).toUpperCase().concat(palavra.substring(1));
        JOptionPane.showMessageDialog(null, palavra);
    }
}
