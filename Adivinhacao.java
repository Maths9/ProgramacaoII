import java.util.Scanner;

public class Adivinhacao {
    public static void main(String[] args) {

        int numeroSecreto = (int) (Math.random() * 50);
        int numeroAleatorio;
        int vezesJogadas = 0;


        boolean condicao = true;
        while (condicao){
            vezesJogadas+= 1;
            Scanner scan = new Scanner(System.in);
            
            System.out.println("Digite um número: ");
            numeroAleatorio = scan.nextInt();

            if (numeroSecreto == numeroAleatorio ){
                System.out.println("++++++++++++++++++++++++++++");
                System.out.println("Parabéns você acertou!!");
                condicao = false;
                System.out.println("Você jogou: " + vezesJogadas + " Vezes");

            } else if (numeroSecreto < numeroAleatorio) {
                System.out.println("Digite um numero menor: ");

            }else if (numeroSecreto > numeroAleatorio){
                System.out.println("Digite um numero maior: ");

            }

            }


        }



    }
