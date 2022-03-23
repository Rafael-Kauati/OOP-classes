package Aula2.src;

import java.util.Scanner;
import java.lang.Math;
public class Ex7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insira o valor x do ponto 1");
        int x1 = input.nextInt();

        System.out.println("Insira o valor y do ponto 1");
        int y1 = input.nextInt();

        System.out.println("Insira o valor x do ponto 2");
        int x2 = input.nextInt();

        System.out.println("Insira o valor y do ponto 2");
        int y2 = input.nextInt();

        input.close();

        int deltaX = x2-x1;
        int deltaY =  y2-y1;

        int distancia = (int) Math.sqrt((deltaX * deltaX) + (deltaY * deltaY));

        System.out.println("Distancia entre o p1 e p2  : " + distancia);
    }
}
