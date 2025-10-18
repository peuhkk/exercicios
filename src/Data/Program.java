package Data;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main (String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double numero;

        System.out.print("Digite um Número: ");
        numero = sc.nextDouble();

        if (numero % 2 == 0 ) {
            System.out.println("O numero é par");
        }else {
            System.out.println("O numero é impar");
        }

        sc.close();
    }
}