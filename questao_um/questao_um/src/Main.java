import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int numero_A;
        int numero_B;

        Scanner escanear = new Scanner(System.in);
        System.out.println("Escreva seu número 'A': ");
        numero_A = escanear.nextInt();

        System.out.println("Escreva seu número 'B': ");
        numero_B = escanear.nextInt();
        escanear.close();

        if(numero_A > numero_B){
            int temp = numero_A;
            numero_A = numero_B;
            numero_B = temp;
        }

        for(int i = numero_A; i <= numero_B; i++){
            if(i%2 == 1){
                System.out.println(i);
            }
        }

    }
}