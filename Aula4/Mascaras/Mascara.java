package Aula4.Mascaras;

public class Mascara{
    private String tipoTecido;
    private boolean tamanhoAdulto;

    public String exibirInstrucoes(int a){
        if(tipoTecido.equals("algodão")){
            return "Pode usar por 2 horas e lavar depois, seue bem!";
        }else{
         return "A máscara deve ser descartada após o uso.";
        }

    }

    public String getTipoTecido() {
        return tipoTecido;
    }

    public void setTipoTecido(String tipoTecido) {
        this.tipoTecido = tipoTecido;
    }

    public boolean isTamanhoAdulto() {
        return tamanhoAdulto;
    }

    public void setTamanhoAdulto(boolean tamanhoAdulto) {
        this.tamanhoAdulto = tamanhoAdulto;
    }
}
