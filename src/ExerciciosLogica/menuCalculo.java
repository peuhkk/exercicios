package ExerciciosLogica;

import java.util.Locale;
import java.util.Scanner;

public class menuCalculo {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double x,y,calc;
        //MENU

        System.out.println("1 - SOMAR");
        System.out.println("2 - SUBTRAIR");
        System.out.println("3 - MULTIPLICAR");
        System.out.println("4 - DIVIDIR");
        char op = sc.next().charAt(0);

        switch (op){
            case '1':
                System.out.println("Insira os dois numeros");
                x = sc.nextDouble();
                y = sc.nextDouble();
                calc = x + y;
                System.out.println("O VALOR DA SUA OPERAÇÃO É: " + calc);
            break;
            case '2':
                System.out.println("Insira os dois numeros");
                x = sc.nextDouble();
                y = sc.nextDouble();
                calc = x - y;
                System.out.println("O VALOR DA SUA OPERAÇÃO É: " + calc);
                break;
            case '3':
                System.out.println("Insira os dois numeros");
                x = sc.nextDouble();
                y = sc.nextDouble();
                calc = x * y;
                System.out.println("O VALOR DA SUA OPERAÇÃO É: " + calc);
                break;
            case '4':
                System.out.println("Insira os dois numeros");
                x = sc.nextDouble();
                y = sc.nextDouble();
                calc = x / y;
                System.out.println("O VALOR DA SUA OPERAÇÃO É: " + calc);
                break;
            default:
                System.out.println("VALOR INVALIDO");
                break;
        }
    }
}
