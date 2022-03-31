package Aula4.src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class Ex4_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader input  = new BufferedReader( new InputStreamReader(System.in));
        System.out.println("Escreva um nome : ");

        String texto = input.readLine();
        StringBuilder acronimo = new StringBuilder();
        String frsLetter;
        String frsLetterCaptalized;
        String[] Frase = (texto.split(" "));

        for(int index = 0; index < Frase.length; index++){
            if(Frase[index].length() >= 3) {
                frsLetter = Frase[index].substring(0,1);
                frsLetterCaptalized = frsLetter.toUpperCase(Locale.ROOT);

                acronimo.append(frsLetterCaptalized);

            }
        }
        System.out.printf("Acronimo : %s", acronimo.toString());
    }
}
