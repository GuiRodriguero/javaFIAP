package Aula4.Mascaras;

import java.util.List;

public class LojaVirtual {
    private int estoque;

    public boolean venderMascara(int qtdeMascara){
        if(estoque >= qtdeMascara) {
            System.out.printf("Vendendo %d máscara(s).", qtdeMascara);
            estoque -= qtdeMascara;
            return true;
        }else{
            System.out.println("Quantidade de estoque insuiciente, solicite mais na fábrica.");
            return false;
        }
    }

    public void solicitarMascarasFabrica(Fabrica fabrica){
        List<Mascara> listaMascara = fabrica.gerarMascara(10);
        estoque += listaMascara.size();
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }
}
