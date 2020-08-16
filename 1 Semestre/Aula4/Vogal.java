package Aula4;
import javax.swing.JOptionPane;
public class Vogal {
    public static void main(String[] args) {
        String palavra = JOptionPane.showInputDialog("Digite uma palavra para ver as vogais com * : ");
//        palavra = palavra.replace('a', '*');
//        palavra = palavra.replace('e', '*');
//        palavra = palavra.replace('i', '*');
//        palavra = palavra.replace('o', '*');
//        palavra = palavra.replace('u', '*');

        palavra = palavra.replaceAll("[AaEeIiOoUu]", "*");
        JOptionPane.showMessageDialog(null, palavra);
    }
}
