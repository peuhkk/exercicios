package ExerciciosLogica;

import java.util.Locale;
import java.util.Scanner;

public class parOuImpar {
    public static void main (String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double numero;

        System.out.print("Digite um Número: ");
        numero = sc.nextDouble();

        if (numero % 2 == 0 ) {
            System.out.printf("O numero %.0f é PAR.", numero);
        }else {
            System.out.printf("O numero %.0f é ÍMPAR.", numero);
        }

        sc.close();
    }
}