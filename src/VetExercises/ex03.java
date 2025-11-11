package VetExercises;

import java.util.Locale;
import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //VETOR E VARIAVEIS:
        double[] vet = new double[5];
        double media, soma = 0;

        //LEITURA DOS NUMEROS E CALCULO DE SOMA:
        for(int i = 0; i < vet.length; i++){
            vet[i] = sc.nextDouble();
            soma = soma + vet[i];
        }

        //CALCULO DA MEDIA:
        media = soma / vet.length;

        //EXIBIÇÃO DA MEDIA
        System.out.printf("MÉDIA = %.2f%n", media);
        sc.close();

    }
}
