package Aula2.src;
import java.util.Scanner;
import java.lang.Math;
public class Ex8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insira o valor do cateto A ");
        double catetoA = input.nextInt();

        System.out.println("Insira o valor do cateto B ");
        double catetoB = input.nextInt();

        double hipotenusa = Math.hypot(catetoA, catetoB);

        System.out.print("Hipotenusa : " + hipotenusa);

    }


}
