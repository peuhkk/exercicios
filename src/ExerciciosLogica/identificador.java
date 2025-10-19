package ExerciciosLogica;

import java.util.Locale;
import java.util.Scanner;

public class identificador {
        public static void main (String[] args){

            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);

            int n1;

            System.out.print("Digite um numero para saber se ele é positivo, negativo ou zero: ");
            n1 = sc.nextInt();

            if (n1 < 0){
                System.out.println("Seu número é Negativo.");
            } else if(n1 > 0 ){
                System.out.println("Seu numero é Positivo.");
            } else {
                System.out.println("Seu numero é Zero.");
            }

            sc.close();
        }
    }
