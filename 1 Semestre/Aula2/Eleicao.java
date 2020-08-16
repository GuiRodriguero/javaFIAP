package Aula2;
import java.util.Scanner;

public class Eleicao {
    public static void main(String[] args) {
        String nome;
        int idade;
        String desejaVotar;
        int voto;

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o nome do cidadão: ");
        nome = input.next();
        System.out.print("Digite a idade do cidadão: ");
        idade = input.nextInt();

        if(idade < 16){
            System.out.printf("\n%s não é eleitor.", nome);
        }else if(idade >= 18 && idade <= 65){

            System.out.printf("\n%s é eleitor obrigatório.", nome);
            System.out.print("Digite o seu voto: ");
            voto = input.nextInt();
            System.out.printf("Voto computado para %d", voto);

        } else if(idade == 16 || idade == 17 || idade > 65){
            System.out.printf("%s é eleitor facultativo.", nome);
            System.out.print("\nDeseja votar? (Digite a letra [S] para SIM e a letra[N] para NÃO) ");
            desejaVotar = input.next();
            String desejaVotarUpper = desejaVotar.toUpperCase();

            if (desejaVotarUpper.equals("S")){
                System.out.print("Digite o seu voto: ");
                voto = input.nextInt();
                System.out.printf("Voto computado para %d", voto);
            } else if (desejaVotarUpper.equals("N")){
                System.out.println("O candidato optou por não votar.");
            } else{
                System.out.println("Valor inválido.");
            }
        }
    }
}
