package Aula2.src;

import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args) throws Exception {
        Scanner scan =  new Scanner(System.in);
        double distancia;
        double milhas;

        distancia = scan.nextDouble();
        milhas =  distancia / 1.609;

        System.out.println(milhas);

        scan.close();

    }
}
