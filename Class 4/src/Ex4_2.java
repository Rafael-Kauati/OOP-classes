package Aula4.src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex4_2 {

    public static int numericCount(String string){
        int num = 0;
        char letter;
        for(int index = 0; index<string.length(); index++){
            letter = string.charAt(index);
            if(Character.isDigit(letter)){
                num++;
            }
        }
        return num;
    }

    public static int numberOfWhiteSpace(String string){
        int num = 0;
        char letter;
        for(int index = 0; index<string.length(); index++){
            letter = string.charAt(index);
            if(Character.isWhitespace(letter)){
                num++;
            }
        }
        return num;
    }

    public static String replaceSequenceOfWhiteSpaces(String string){
        int x;
        String empty = "";
        char letter;
        boolean LastWasWhiteSpace= true;
        for(int index = 0; index<string.length(); index++){
            letter = string.charAt(index);
            if(Character.isWhitespace(letter)){
                if(LastWasWhiteSpace){
                    empty += letter;
                    LastWasWhiteSpace = false;
                }
                else{
                    LastWasWhiteSpace =true;
                }

            }
        }
        return string;
    }

    public static int HasOnlyUpperCaseChar(String string){
        int num = 0;
        char letter;
        for(int index = 0; index<string.length(); index++){
            letter = string.charAt(index);
            if(Character.isUpperCase(letter)){
                num++;
            }
        }
        return num;
    }

    public static boolean reverseString(String string){
        StringBuilder str =  new StringBuilder();

        str.append(string);

        str.reverse();
        return str.equals(string);

    };


    public static void main(String[] args)throws IOException {
        BufferedReader input  = new BufferedReader( new InputStreamReader(System.in));
        System.out.println("Escreva algum texto : ");

        String texto = input.readLine();

        System.out.printf("\nNumero de  carateres numéricos no texto/frase %s: \n%s\n ",texto,numericCount(texto));

        System.out.printf("\nNumero de  espaços vazios no texto/frase %s: \n%s\n ",texto,numberOfWhiteSpace(texto));

        if(HasOnlyUpperCaseChar(texto) == 0){
            System.out.printf("\nA texto/frase %s só contem letras minúsculas\n",texto);
        }
        else{
            System.out.printf("\nA texto/frase %s contem : %s letras maiusculas\n",texto,HasOnlyUpperCaseChar(texto));
        }

        if(!reverseString(texto)){
            System.out.printf("\nA frase/texto %s não é um palíndromo", texto);
        }
        else if(reverseString(texto)){
            System.out.printf("\nA frase/texto %s é um palíndromo", texto);
        }

        System.out.println("\n"+replaceSequenceOfWhiteSpaces(texto));


    }
}
