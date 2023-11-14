package Exemplos.VerificarFibonacci;
import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int numero;
        int penultimo = 1;
        int ultimo = 1;
        int soma = 1;

        System.out.println("Digite o numero que deseja12 fazer a busca:");
        numero = scan.nextInt();

        if(numero < 0 ){
            System.out.println("numero invalido");
        }else if( numero <= 1){
            System.out.println("pertence a fibonacci");
        }

        while(soma < numero){
            soma = ultimo + penultimo;
            if(numero == soma){
                System.out.println("pertence a fibonacci");
            }else if(soma >= numero){
                System.out.println("não pertence a fibonacci");
            }else{
                penultimo = ultimo;
                ultimo = soma;
            }
        }
        

    }
}

