package Exemplos;
import java.util.Scanner;

public class PrimeiroProjeto{
    public static void main(String[] args){
        int numero_A, numero_B;
        Scanner scan = new Scanner(System.in);
        System.out.println("Escreva Seu número 'A':");
        numero_A = scan.nextInt();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Escreva Seu número 'B':");
        numero_B = scanner.nextInt();
        scan.close();

        if(numero_A > numero_B){
            int temp = numero_A;
            numero_A = numero_B;
            numero_B = temp;
        }
        for( int i = numero_A; i <= numero_B; i++){
            if( i%2 == 1){
                System.out.println(i);
            }
        }

    }
}