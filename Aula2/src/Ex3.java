package Aula2.src;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int agua = scanner.nextInt();

        int tempInicial = scanner.nextInt();

        int tempFinal =  scanner.nextInt();

        int energia =  agua * (tempFinal - tempInicial) * 4184;

        System.out.println(energia);

        scanner.close();




        
    }
    
}
