package Aula2.src;

import java.lang.Math;
import java.util.Scanner;
public class Ex4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double montanteInvestido = input.nextDouble();

        double taxa = input.nextDouble();
        double a = (1+taxa);

        double montanteFinal =  montanteInvestido * Math.pow(a, 3);

        System.out.println(montanteFinal);
        input.close();
        
    }
    
}
