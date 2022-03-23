package Aula2.src;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double celsius = input.nextDouble();

        double farenheit = 1.8 * celsius + 32;

        System.out.println(farenheit);

        input.close();


        
    }
    
}
