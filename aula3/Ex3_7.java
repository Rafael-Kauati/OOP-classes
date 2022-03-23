package aula3;

import java.util.Scanner;
import java.util.Random;
public class Ex3_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int randomNumber = random.nextInt(101);

        if(randomNumber == 0){
            randomNumber = 1;
        }
        String resposta = "";
        int tentativas = 0;
        int tentativa;
        while (true){
            while(true) {
                System.out.print("\nTente adivinhar o número : ");
                tentativa = input.nextInt();
                if(tentativa == randomNumber){
                    System.out.printf("\nParabens !!!\nVoce acertou o numero %s%n", randomNumber);
                    break;
                }
                else if(randomNumber > tentativa){
                    if((randomNumber - tentativa) <=50){
                        System.out.printf("\nO número %s%n é demasiado pequeno", tentativa);
                    }
                    else if((randomNumber - tentativa) >50){
                        System.out.printf("\nO número %s%n é pequeno, porém perto", tentativa);
                    }
                }
                else if(randomNumber < tentativa){
                    if((randomNumber + tentativa) >= 50){
                        System.out.printf("\nO número %s%n é demasiadamente grande, porém perto", tentativa);

                    }
                    else if((randomNumber + tentativa) > 20){
                        System.out.printf("\nO número %s%n é grande, porém perto", tentativa);

                    }
                }



                tentativas++;
            }

            System.out.printf("Número de tentativas : %s", tentativas);
            System.out.print("\nPretende continuar? Prima (S)im ");
            resposta = input.next();

            if(!resposta.equals("S")){
                break;
            }
            else{
                continue;
            }



        }

    }
}
