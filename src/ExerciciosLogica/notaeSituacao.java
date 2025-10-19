package ExerciciosLogica;

import java.util.Locale;
import java.util.Scanner;

public class notaeSituacao{
    public static void main (String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a nota: ");
        double nota = sc.nextDouble();

        if (nota >= 7){
            System.out.println("Aprovado.");
        }
        else if (nota >= 5 && nota <= 6.9){
            System.out.println("Recuperação.");
        } else{
            System.out.println("Reprovado!");
        }

        sc.close();

    }
}