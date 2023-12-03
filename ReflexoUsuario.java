import java.io.IOException;
import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

public class ReflexoUsuario {
    public static void main(String[] args) throws InterruptedException, IOException {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int reflexoMaisRapido = Integer.MAX_VALUE;

        while (true) {
            int tempoAleatorio = random.nextInt(6000) + 1000; 
            int numeroAleatorio = random.nextInt(10); 
            System.out.println("Agora! Digite o número: " + numeroAleatorio);

            long inicio = Calendar.getInstance().getTimeInMillis();
            
            Thread.sleep(tempoAleatorio);

            long fim = Calendar.getInstance().getTimeInMillis();
            int tempoDecorrido = (int) (fim - inicio);

            if (System.in.available() > 0) {
                int numeroDigitado = scanner.nextInt();

                if (numeroDigitado == numeroAleatorio) {
                    System.out.println("Você digitou o número corretamente em " + tempoDecorrido + " milissegundos.");
                    if (tempoDecorrido < reflexoMaisRapido) {
                        reflexoMaisRapido = tempoDecorrido;
                    }
                } else {
                    System.out.println("Você digitou o número incorretamente.");
                }
            } else {
                System.out.println("Tempo esgotado. Você não digitou o número a tempo.");
            }

            System.out.println("Deseja tentar novamente? (s/n)");
            String resposta = scanner.next();
            if (!resposta.equalsIgnoreCase("s")) {
                break;
            }
        }

        System.out.println("Seu reflexo mais rápido foi de " + reflexoMaisRapido + " milissegundos.");
    }
}
