package VetExercises;

import java.util.Locale;
import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //VETOR
        int[] vet = new int[5];

        //LER O VETOR
        for(int a = 0; a < 5; a++){
            vet[a] = sc.nextInt();
        }

        //EXIBE DE MANEIRA INVERTIDA
        for(int a = 4; a >= 0; a--){
            System.out.print(vet[a] + " ");
        }

        sc.close();
    }
}
