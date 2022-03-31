package Aula2.src;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Insira o total do tempo em segundos  : ");
        int total = input.nextInt();

        int minutos = total/60;
        int horas = total/3600;
        int segundos = total%60;

        System.out.println(horas+":"+minutos+":"+segundos);

    }
    
}
