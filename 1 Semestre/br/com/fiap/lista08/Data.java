package br.com.fiap.lista08;
import java.time.LocalDate;

public class Data {
    Integer dia;
    Integer mes;
    Integer ano;

    LocalDate lData = LocalDate.now();
    int anoAtual = lData.getYear();

    public void Data(){
        dia = 0;
        mes = 0;
        ano = 0;
    }

    public void Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public String getData(){
        dia.toString();
        mes.toString();
        ano.toString();

        String strData = dia + "/" + mes + "/" + ano;
        return strData;
    }

    public String getNomeMes(){
    String nomeMes = "";

    switch (mes){
        case 1:
            nomeMes = "Janeiro";
            break;
        case 2:
            nomeMes = "Fevereiro";
            break;
        case 3:
            nomeMes = "Março";
            break;
        case 4:
            nomeMes = "Abril";
            break;
        case 5:
            nomeMes = "Maio";
            break;
        case 6:
            nomeMes = "Junho";
            break;
        case 7:
            nomeMes = "Julho";
            break;
        case 8:
            nomeMes = "Agosto";
            break;
        case 9:
            nomeMes = "Setembro";
            break;
        case 10:
            nomeMes = "Outubro";
            break;
        case 11:
            nomeMes = "Novembro";
            break;
        case 12:
            nomeMes = "Dezembro";
            break;
    }

    return nomeMes;
    }

    public void setDia(Integer dia) {
        if(dia > 0 && dia < 32){
            this.dia = dia;
        }else {
            this.dia = 1;
        }

    }

    public void setMes(Integer mes) {
        if(mes > 0 && mes < 13){
            this.mes = mes;
        }else {
            this.mes = 1;
        }
    }

    public void setAno(Integer ano) {
        if(ano >= 0){
            this.ano = ano;
        }else{
            this.ano = anoAtual;
        }
    }
}
