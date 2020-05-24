package Aula4;
import java.util.Scanner;

public class ConjugacaoVerbo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma palavra que termina em \"AR\" ");
        String palavra = "";

        do {
            palavra = scanner.next();
            if (palavra.endsWith("ar")) {
                String palavraConjugada = palavra.substring(0, palavra.length() - 2).concat("ou");
                System.out.println(palavraConjugada);
            } else {
                System.out.println("Palavra inválida, digite uma que termine com \"ar\"");
            }
        }while(!(palavra.endsWith("ar")));


    }
}
