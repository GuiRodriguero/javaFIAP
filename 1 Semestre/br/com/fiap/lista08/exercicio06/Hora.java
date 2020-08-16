package br.com.fiap.lista08.exercicio06;

public class Hora {
    private Integer hora;
    private Integer minuto;
    private Integer segundo;

    public Hora(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public String obterHora(){
        hora.toString();
        minuto.toString();
        segundo.toString();

        String horaCompleta = hora + ":" + minuto + ":" + segundo;
        return horaCompleta;
    }
}
