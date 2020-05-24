package Aula4;
import javax.swing.JOptionPane;
public class Maiusculo {
    public static void main(String[] args) {
        String palavra = JOptionPane.showInputDialog("Digite uma palavra para vê-la em maiúsculo: ").toUpperCase();
        JOptionPane.showMessageDialog(null, palavra);
    }

}
