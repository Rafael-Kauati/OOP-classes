package Aula4.src;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.String;
import java.util.Locale;

public class Ex4_1 {
    public static void main(String[] args) throws IOException {
        //Scanner input = new Scanner(System.in);
        BufferedReader input  = new BufferedReader( new InputStreamReader(System.in));

        System.out.println("Escreva algum texto : ");

        String texto = input.readLine();


        String textoLower = texto.toLowerCase(Locale.ROOT);
        System.out.printf("\nTamanho da String %s : %s caracteres\n",texto ,texto.length());

        System.out.printf("\nTexto inserido com letras minusculas : \n%s\n", textoLower);

        System.out.printf("\nUltimo caracter do texto : \n%s\n", texto.charAt(texto.length() -1));

        System.out.printf("\nTres primeiros caracteres do texto : \n%s %s %s\n", texto.charAt(0), texto.charAt(1), texto.charAt(2));

        System.out.printf("\nTres primeiros caracteres do texto : \n%s %s %s\n", texto.charAt(0), texto.charAt(1), texto.charAt(2));

        System.out.printf("\nHashCode do texto inserido : \n%s\n", texto.hashCode());

        System.out.printf("\nUnicode do primeiro caracter do texto inserido: \n%s\n", (Object) texto.codePointAt(0));




    }
}
