package Aula4;
import javax.swing.JOptionPane;
public class Minusculo {
    public static void main(String[] args) {
        String palavra = JOptionPane.showInputDialog("Digite uma palavra para vê-la em minúsculo: ").toLowerCase();
        JOptionPane.showMessageDialog(null, palavra);
    }

}
