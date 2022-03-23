package aula3;

import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;

public class Ex3_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double firstNumber;
        double newNumber;
        System.out.println("Insira alguns valores\n");
        firstNumber = input.nextDouble();

        double[] numbersList = {firstNumber};

        System.out.println(numbersList[0]);

        newNumber = input.nextDouble();

        numbersList = Arrays.copyOf(numbersList, numbersList.length + 1);
        numbersList[numbersList.length - 1] = newNumber;

        if(numbersList[0] == newNumber){
            System.out.println(numbersList[numbersList.length -1]);
        }
        else {
            int index = 1;
            while(numbersList[0] != newNumber){
                numbersList = Arrays.copyOf(numbersList, numbersList.length + 1);
                newNumber = input.nextDouble();
                numbersList[index + 1] = newNumber;
                index++;
            }
        }

        Arrays.sort((numbersList));

        System.out.println(Arrays.toString(numbersList));
        System.out.printf("Menor valor : %s%n\nMaior valor : %s%n",numbersList[0], numbersList[numbersList.length -1]);

        int index;
        double soma = 0;
        for(index  = 0; index < numbersList.length; index++){
            soma += numbersList[index];
        }
        double len  = numbersList.length;
        double media = Math.floor(soma/len);
        System.out.printf("A média de todos os valores lidos : %s%n\n e o total de valores lidos : %s%n", media,len);
    }
}
