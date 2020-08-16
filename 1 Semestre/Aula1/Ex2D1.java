package Aula1;
import java.util.Scanner;

public class Ex2D1 {
    public static void main(String[] args) {
        int n1;
        int n2;
        String op;
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        n1 = input.nextInt();
        System.out.print("\nDigite a operação: (+ - * /) ");
        op = input.next();
        System.out.print("\nDigite o segundo número: ");
        n2 = input.nextInt();

        if (op.equals("+")){
            n1 += n2;
            System.out.println("\nA soma é: " + n1);
        }
        
        if (op.equals("-")){
            n1 -= n2;
            System.out.println("\nA subtração é: " + n1);
        }

        if (op.equals("*")){
            n1 *= n2;
            System.out.println("\nA multiplicação é: " + n1);
        }

        if (op.equals("/")){
            if(n2 == 0){
                System.out.println("Operação não permitida.");
            }else {
                n1 /= n2;
            }
            System.out.println("A divisão é: " + n1);
        }
    }
}
