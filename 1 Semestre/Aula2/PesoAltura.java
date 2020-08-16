package Aula2;
import java.util.Scanner;

public class PesoAltura {
    public static void main(String[] args) {
        String nome1, nome2;
        float altura1, peso1;
        float altura2, peso2;
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o nome da primeria pessoa: ");
        nome1 = input.nextLine();
        System.out.printf("Digite a alutra do(a) %s: ", nome1);
        altura1 = input.nextFloat();

        System.out.printf("Digite o peso do(a) %s: ", nome1);
        peso1 = input.nextFloat();

        System.out.print("Digite o nome da segunda pessoa: ");
        nome2 = input.nextLine();

        System.out.printf("Digite a alutra do(a) %s: ", nome2);
        altura2 = input.nextFloat();

        System.out.printf("Digite o peso do(a) %s: ", nome2);
        peso2 = input.nextFloat();

        if(altura1 > 0 && altura2 > 0 && peso1 > 0 && peso2 > 0){
            if(altura1 == altura2){
                System.out.println("Os dois tem a mesma altura.");
            }
            if(altura1 > altura2){
                System.out.printf("\n %s é o(a) mais alto(a)", nome1);
            }else{
                System.out.printf("\n %s é o(a) mais alto(a)", nome2);
            }

            if(peso1 == peso2){
                System.out.println("Os dois tem o mesmo peso.");
            }
            if(peso1 > peso2){
                System.out.printf("\n %s é o(a) mais pesado(a)", nome1);
            }else{
                System.out.printf("\n %s é o(a) mais pesado(a)", nome2);
            }
        }else{
            System.out.println("Valores inválidos!");
        }

    }
}
