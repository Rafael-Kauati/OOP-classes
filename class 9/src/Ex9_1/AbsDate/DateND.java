package Ex9_1.AbsDate;

public class DateND extends Date implements Comparable<Date>{
    public int dia, mes, ano;

    public DateND(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public int getDia() {return dia;}

    public int getMes() {return mes;}

    public int getAno() {return ano;}

    public int getDate() {return this.dia + this.mes + this.ano;}


    public int monthDays(int m, int a){
        int dias;
        switch (m){
            case 1:
            case 3:dias = 31; break;
            case 2:
                if((a%4 == 0) && ((a%100 != 0) || (a%400 == 0))){
                    dias = 29;
                }else{dias = 28;
                }break;
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: dias = 31; break;
            default: dias = 30;
        }
        return dias;
    }
    public int decrementDatee(int dia, int mes, int ano){
        int d = 0;

        while(dia != 1 || mes != 1 || ano != 2000){
            if(dia == 1){
                dia = this.monthDays(mes, ano);
                mes--;
            }else{
                dia--;
            }
            if(mes == 0){
                mes = 12;
                ano--;
            }
            d++;
        }

        return d;
    }



    @Override
    public Boolean validMonth(int m) {
        return null;
    }

    @Override
    public Boolean leapYear(int a) {
        return null;
    }

    @Override
    public Boolean validDate(int d, int m, int a) {
        return null;
    }

    @Override
    public String printt() {
        return null;
    }

    @Override
    public void incrementDate() {
    }

    @Override
    public void decrementDate() {
    }

    @Override
    public String toString() {
        return dia + "/" + mes + "/" + ano;
    }

    @Override
    public int compareTo(Date date) {
        return date.getDate() - (getDate());
    }

}
