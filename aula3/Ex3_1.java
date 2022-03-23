package aula3;

import java.util.Scanner;
import java.lang.Math;

public class Ex3_1 {
    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    };
    public static void main(String[] args) {

        double notaP;
        double notaT;
        double notaFinal = 0.0;
        String resultado = null;
        double min = 0.0;
        double max = 20.0;
        Scanner input = new Scanner(System.in);
        System.out.println("\nInsira o valor das notas prática e teórica abaixo, respectivamente : ");
        //notaP = Math.round(input.nextDouble());
        //notaT = Math.round(input.nextDouble());
        notaT = (input.nextDouble());
        notaP = (input.nextDouble());




        while((notaT < min || notaT > max)  || (notaP < min || notaP > max)){
            System.out.println("\nInsira valores entre 0,0 e 20,0");
            notaT = (input.nextDouble());
            notaP = (input.nextDouble());
        }
        if(notaP < 7.0 || notaT < 7.0){
            resultado =  "\nReprovado por nota mínima : ";
            notaFinal = 66;

            System.out.println("\nNota prática : " + notaP);
            System.out.println("\nNota teorica : " + notaT);
            System.out.println(resultado + notaFinal);
        }
        else if(notaP > 7.0 && notaT > 7.0){
            resultado =  "\nAprovado com nota : ";
            notaFinal = round((0.4 * notaT) + (0.6 * notaP), 1);

            System.out.println("\nNota prática : " + notaP);
            System.out.println("\nNota teorica : " + notaT);
            System.out.println(resultado + notaFinal);
        }


        input.close();
    }
}
