package aula3;

import java.util.Scanner;

public class Ex3_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\nInsira um ano : \n");
        boolean isBissexto = false;
        int year = input.nextInt();

        while(year == 0 || year < 0){
            System.out.println("\nInsira um ano válido: \n");
            year = input.nextInt();
        }

        //Checar se é bissexto
        if(year%4==0){
            if(year%100!=0){
                isBissexto = true;
            }
        }
        else{
            if(year%400==0){
                isBissexto =true;
            }
        }

        System.out.println("\nInsira o mês desse ano : \n");

        int month = input.nextInt();

        while(month <= 0 || month > 12){
            System.out.println("\nInsira um dos dozes meses  : \n");
            month = input.nextInt();
        }

        System.out.println(isBissexto);

        if(month == 1){
            System.out.printf("\nNúmero de dias do mês de Janeiro do ano %s%n : %s%n dias", year, 31);
        }
        else if(month == 2){
            if(isBissexto){
                System.out.printf("\nNúmero de dias do mês de Fevereiro do ano %s%n : %s%n dias", year, 29);
            }else{
                System.out.printf("\nNúmero de dias do mês de Fevereiro do ano %s%n : %s%n dias", year, 28);

            }
        }
        else if(month ==3){
            System.out.printf("\nNúmero de dias do mês de Março do ano %s%n : %s%n dias", year, 31);

        }
        else if(month == 4){
            System.out.printf("\nNúmero de dias do mês de Abril do ano %s%n : %s%n dias", year, 30);


        }
        else if(month == 5){
            System.out.printf("\nNúmero de dias do mês de Maio do ano %s%n : %s%n dias", year, 31);


        }
        else if(month ==6){
            System.out.printf("\nNúmero de dias do mês de Junho do ano %s%n : %s%n dias", year, 30);

        }
        else if(month == 7){
            System.out.printf("\nNúmero de dias do mês de Julho do ano %s%n : %s%n dias", year, 31);

        }
        else if(month == 8){
            System.out.printf("\nNúmero de dias do mês de Agosto do ano %s%n : %s%n dias", year, 31);

        }
        else if(month == 9){
            System.out.printf("\nNúmero de dias do mês de Setembro do ano %s%n : %s%n dias", year, 30);

        }
        else if(month == 10){
            System.out.printf("\nNúmero de dias do mês de Outubro do ano %s%n : %s%n dias", year, 31);

        }
        else if (month == 11) {
            System.out.printf("\nNúmero de dias do mês de Novembro do ano %s%n : %s%n dias", year, 30);


        }
        else{
            System.out.printf("\nNúmero de dias do mês de Dezembro do ano %s%n : %s%n dias", year, 31);

        }



    }
}
