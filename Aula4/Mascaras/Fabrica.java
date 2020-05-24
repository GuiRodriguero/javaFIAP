package Aula4.Mascaras;

import java.util.ArrayList;
import java.util.List;

public class Fabrica {
    private int qtdeMateriaPrima;
    private boolean funcionarioTrabalhando;

    public List<Mascara> gerarMascara(int qutantidade){
        List<Mascara> listaMascara = new ArrayList<>();

        for(int i = 0; i <= qutantidade; i++) {
            Mascara mascara = new Mascara();
            mascara.setTipoTecido("algodão");
            mascara.setTamanhoAdulto(true);

            listaMascara.add(mascara);
        }
        return listaMascara;
    }
    public int getQtdeMateriaPrima() {
        return qtdeMateriaPrima;
    }

    public void setQtdeMateriaPrima(int qtdeMateriaPrima) {
        this.qtdeMateriaPrima = qtdeMateriaPrima;
    }

    public boolean isFuncionarioTrabalhando() {
        return funcionarioTrabalhando;
    }

    public void setFuncionarioTrabalhando(boolean funcionarioTrabalhando) {
        this.funcionarioTrabalhando = funcionarioTrabalhando;
    }
}
