package Aula2.src;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double velocidade1 = input.nextDouble();
        double distancia1 = input.nextDouble();

        double velocidade2 = input.nextDouble();
        double distancia2 = input.nextDouble();

        double tempo1 = distancia1/velocidade1;
        double tempo2 = distancia2/velocidade2;

        double velocidadeMediaFinal =  (distancia2 - distancia1)/(tempo2 - tempo1);

        System.out.println("Velocidade Média Final : " + velocidadeMediaFinal);
        input.close();

    }
    
}
