package VetExercises;

import java.util.Locale;
import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

        //VETOR
        int[] vet = new int[5];

        //LEITURA DO VETOR
        for(int i = 0; i < 5; i++){
            vet[i] = sc.nextInt();
        }

        //EXIBIÇÃO DO VETOR
        for(int i = 0; i < 5; i++){
            System.out.print(vet[i] + " ");
        }

        sc.close();
    }
}
