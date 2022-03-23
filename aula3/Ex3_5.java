package aula3;

import java.util.Scanner;

public class Ex3_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insira o montante investido : \n");
        double montanteInicial = input.nextDouble();

        while(montanteInicial < 0 || montanteInicial%1000 != 0){
            System.out.println("Insira o montante investido positivo e multiplo de 1000.0 : \n");
            montanteInicial = input.nextDouble();
        }

        System.out.println(montanteInicial);


        System.out.println("Insira a taxa mensal entre 0% e 5% : \n");
        double taxaMensal = input.nextDouble();

        while(taxaMensal < 0 || taxaMensal>5){
            System.out.println("Insira a taxa mensal entre 0% e 5% : \n");
            taxaMensal = input.nextDouble();
        }

        System.out.println(taxaMensal);

        //vm = vi (i*(vitx/100));
        double valorMensal = 0;
        for(int mes = 0; mes < 12; mes++){
            valorMensal = montanteInicial*(Math.pow(1+(taxaMensal/100),2));
            System.out.printf("Mes : %s%n\nMontante : %s%n", mes, valorMensal);
        }

    }
}
