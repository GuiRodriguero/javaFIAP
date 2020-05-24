package Aula4;
import javax.swing.JOptionPane;
public class MetodosST {
    public static void main(String[] args) {
        String nome1 = JOptionPane.showInputDialog("Digite um nome: ");
        String nome2 = JOptionPane.showInputDialog("Digite outro nome: ");

        JOptionPane.showMessageDialog(null, "EQUALS");
        if(nome1.equals(nome2)){
            JOptionPane.showMessageDialog(null, "Os nomes são iguais");
        }else{
            JOptionPane.showMessageDialog(null, "Os nomes não são iguais");
        }

        JOptionPane.showMessageDialog(null, "EQUALS IGNORE CASE");

        if(nome1.equalsIgnoreCase(nome2)){
            JOptionPane.showMessageDialog(null, "O conteúdo dos nomes são iguais");
        }else{
            JOptionPane.showMessageDialog(null, "O conteúdo dos nomes não são iguais");
        }

        JOptionPane.showMessageDialog(null, "STARTS WITH");

        String palavra = JOptionPane.showInputDialog("Digite uma palavra");
        if(palavra.startsWith("a")){
            JOptionPane.showMessageDialog(null, "A palavra inicia com a vogal \"a\"");
        }
        JOptionPane.showMessageDialog(null, "ENDS WITH");

        if(palavra.endsWith("a")){
            JOptionPane.showMessageDialog(null, "A palavra termina com a vogal \"a\"");
        }

        JOptionPane.showMessageDialog(null, "LENGTH");

        String frase = JOptionPane.showInputDialog("Digite uma frase e descubra seu tamanho: ");
        int tamanho = frase.length();
        JOptionPane.showMessageDialog(null, "Tamanho da String: " + tamanho);
        char ch1 = frase.charAt(0);
        JOptionPane.showMessageDialog(null, "CHAR AT");
        JOptionPane.showMessageDialog(null, "Primeira letra: " + ch1);

        JOptionPane.showMessageDialog(null, "INDEX OF");
        JOptionPane.showMessageDialog(null, "Primeira ocorrência da letra \"a\"" + frase.indexOf("a"));

        JOptionPane.showMessageDialog(null, "LAST INDEX OF");
        JOptionPane.showMessageDialog(null, "Última ocorrência da letra \"a\"" + frase.lastIndexOf("a"));

        JOptionPane.showMessageDialog(null, "SUBSTRING");
        tamanho = tamanho / 2;
        JOptionPane.showMessageDialog(null, "Recortando a frase ao meio" + frase.substring(0,tamanho));

        JOptionPane.showMessageDialog(null, "TO LOWER CASE");
        JOptionPane.showMessageDialog(null, "Mensagem minúscula: " + frase.toLowerCase());

        JOptionPane.showMessageDialog(null, "TO UPER CASE");
        JOptionPane.showMessageDialog(null, "Mensagem maiúscula: " + frase.toUpperCase());

        JOptionPane.showMessageDialog(null, "REPLACE");
        frase.replace("a", "*");
        JOptionPane.showMessageDialog(null, "Substituindo o \"a\" por *: " + frase);
    }
}
