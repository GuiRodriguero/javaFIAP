package Aula4.Mascaras;

public class AplicacaoLojaMascaras {
    public static void main(String[] args) {
        Fabrica fabrica = new Fabrica();
        LojaVirtual lojaVirtual = new LojaVirtual();

        lojaVirtual.solicitarMascarasFabrica(fabrica); // o estoque aumentou em 10
        lojaVirtual.venderMascara(9); // vendendo 9
        lojaVirtual.venderMascara(2); // erro
    }
}
