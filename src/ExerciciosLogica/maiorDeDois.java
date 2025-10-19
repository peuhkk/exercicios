package ExerciciosLogica;

import java.util.Locale;
import java.util.Scanner;

public class maiorDeDois {
    public static void main (String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n1, n2;

        System.out.print("Digite dois números para achar o maior entre eles: ");
        n1 = sc.nextInt();
        n2 = sc.nextInt();

        if (n1 > n2){
            System.out.println("O maior entre os dois é o: " + n1 + ".");
        }
        else {
            System.out.println("O maior entre os dois é o: " + n2 +".");
        }

        sc.close();

    }
}