package Aula4.src;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex4_4 {
    public static void main(String[] args){
        int mes, ano, dia, diasdoMes;
        String month = null;
        Scanner input = new Scanner(System.in);

        do{
            System.out.print("Insira o numero do mês: ");
            mes = input.nextInt();
            if (mes<=0 || mes>12){
                System.out.println("Mês inválido!\nInsira um numero entre 1 e 12");
            }
        }while(mes<=0 || mes>12);


        do{
            System.out.print("Ano: ");
            ano = input.nextInt();
            if (ano<0){
                System.out.println("Insira o numero do ano inválido!\nInsira um numero positivo");
            }
        }while(ano<0);
        do{
            System.out.print("Insira o numero do dia da semana: ");
            dia = input.nextInt();

            if (dia<=0 || dia>7){
                System.out.println("Dia inválido!\nInsira um número entre 1 e 7");
            }

        }while(dia<=0 || dia>7);

        diasdoMes = setDia(mes, ano);

        month = setMes(mes);

        printCalendario(diasdoMes, ano, dia, month);

        input.close();
    }
    public static int setDia(int mes, int ano){
        int dias;
        if (mes == 1 || mes == 3) {
            dias = 31;
        } else if (mes == 2) {
            if ((ano % 4 == 0) && ((ano % 100 != 0) || (ano % 400 == 0))) {
                dias = 29;
            } else {
                dias = 28;
            }
        } else if (mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
            dias = 31;
        } else {
            dias = 30;
        }
        return dias;
    }
    public static String setMes(int mes){
        Map< Integer,String> months = new HashMap<>();
        months.put(1, "Janeiro");
        months.put(2, "Fevereiro");
        months.put(3, "Março");
        months.put(4, "Abril");
        months.put(5, "Maio");
        months.put(6, "Junho");
        months.put(7, "Julho");
        months.put(8, "Agosto");
        months.put(9, "Setembro");
        months.put(10, "Outubro");
        months.put(11, "Novembro");
        months.put(12, "Dezembro");

        return months.get(mes);

    }
    static void printCalendario(int mes, int ano, int dia, String month) {
        System.out.format("\n--------------------------------\n%s   %s   %s   %s   %s   %s   %s    %n", "  ","  ",month, ano,"","","");
        System.out.println("--------------------------------");
        System.out.format("%s   %s   %s   %s   %s   %s   %s   %n", "Su", "Mo", "Tu", "We", "Th", "Fr", "Sa");
        int Finalindex = dia;

        int j = 0;

        while (j < dia) {
            System.out.print("     ");
            j++;
        }

        for (int i = 1; i <= mes; i++) {

            if (Finalindex % 7 == 0) {
                System.out.print("\n");
            }
            System.out.printf("%02d   ", i);

            Finalindex++;
        }

    }
}
