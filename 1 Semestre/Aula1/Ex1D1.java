package Aula1;
import java.security.SecureRandom;

public class Ex1D1 {
    public static void main(String[] args) {
        SecureRandom randomNumber = new SecureRandom();
        int n1 = 1 + randomNumber.nextInt(100);
        int n2 = 1 + randomNumber.nextInt(100);

        System.out.println("Soma de " + n1 + " e " + n2 + " = " + (n1+n2));
        if ((n1+n2)%2 == 0){
            System.out.println((n1+n2) + " é par");
        } else{
            System.out.println((n1+n2) + " é ímpar");
        }

        System.out.println("\nSubtração de " + n1 + " e " + n2 + " = " + (n1-n2));
        if ((n1-n2)%2 == 0){
            System.out.println((n1-n2) + " é par");
        } else{
            System.out.println((n1-n2) + " é ímpar");
        }

        System.out.println("\nMultiplicação de " + n1 + " e " + n2 + " = " + (n1*n2));
        if ((n1*n2)%2 == 0){
            System.out.println((n1*n2) + " é par");
        } else{
            System.out.println((n1*n2) + " é ímpar");
        }

        System.out.println("\nDivisão de " + n1 + " e " + n2 + " = " + (n1/n2));
        if ((n1/n2)%2 == 0){
            System.out.println((n1/n2) + " é par");
        } else{
            System.out.println((n1/n2) + " é ímpar");
        }
    }
}
