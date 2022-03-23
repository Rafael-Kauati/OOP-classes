package aula3;

import java.util.Scanner;

public class Ex3_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N;

        System.out.println("\nInsira um valor : ");
        N = input.nextInt();

        for(int zero  = 0; N >= zero; N-= 1 ){
            System.out.println(N);
        }

        input.close();
    }
}
