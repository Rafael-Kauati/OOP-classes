package aula3;

import java.util.Scanner;

public class Ex3_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\nInsira um valor : ");
        
        int numero = input.nextInt();
        int numeroDivisores = 0;
        
        int metade = numero/2;


        while(numero < 0){
            System.out.println("\nInsira um valor positivo inteiro : ");
            numero = input.nextInt();
                if(numero  > 0){
                    break;
                }
        }

        if(numero == 0||numero == 1){
            System.out.println(numero+" não é primo ");
        }
        else
        {
            for(int index = 2 ; index<=metade ; index++){
                if(numero % index == 0){
                    System.out.println(numero+ " não é primo ");
                    numeroDivisores=1;
                    break;
                }
            }
            if(numeroDivisores==0) {
                System.out.println(numero + " é primo"); }
        }


    }
}
