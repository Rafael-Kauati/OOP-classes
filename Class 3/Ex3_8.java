package aula3;

import java.lang.Math;
import java.util.Arrays;
import java.util.Random;

import static java.lang.Math.round;

public class Ex3_8 {
    public static double nextDoubleBetween2(double min, double max) {
        return (new Random().nextDouble() * (max - min)) + min;
    }
    public static void main(String[] args) {


        double[] notasPauta = {};
        double[][] notas  = new double[16][2];

        Random random = new Random();
        double min = 7.0;
        double max = 20.0;
        for(int i = 0; i < 16; i++){
            for(int j = 0 ; j < 2; j++ ){
                notas[i][j] = round(nextDoubleBetween2(0.0,20.0));
            }
        }

        int index;
        for(index = 0; index < 16 ; index++){
            if(notas[index][0] > min && notas[index][1] > min){
                notasPauta = Arrays.copyOf(notasPauta,notasPauta.length + 1);

                notasPauta[index] = round((0.4 * notas[index][0]) + (0.6 * notas[index][1]));

            }
            else if(notas[index][0] < min || notas[index][1] < min){
                notasPauta = Arrays.copyOf(notasPauta,notasPauta.length + 1);
                notasPauta[index] = 66.0;

            }
        }
        System.out.println("NotaT  NotaP Pauta");
        for(index = 0; index < notasPauta.length; index++){
            System.out.printf("\n%s  %s  %s", notas[index][0], notas[index][1], notasPauta[index]);
        }
    }
}
