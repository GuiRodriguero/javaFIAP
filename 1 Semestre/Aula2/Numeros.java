package Aula2;

public class Numeros {
    public static void main(String[] args) {
        System.out.print("FOR\n");
        for(int i = 0; i <= 100; i++){
            System.out.println(i);
        }

        System.out.println("\nWHILE");
        int i = 0;
        while(i <= 100){
            System.out.println(i);
            i++;
        }

        System.out.println("\nDOWHILE");
        int numero = 0;
        do{
            System.out.println(numero);
            numero++;
        }while(numero <= 100);

    }
}
