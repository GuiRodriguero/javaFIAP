package Aula2;
//5 lines
public class Arvore {
    public static void main(String[] args) {

        for(int linha = 0; linha <= 4; linha++){
            for(int ast = 0; ast <= 4; ast++){
                if(ast<=linha) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
