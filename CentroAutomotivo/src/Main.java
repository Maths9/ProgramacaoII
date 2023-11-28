import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
        //List<Carro> carros = new ArrayList<>();
        //List<Moto> motos = new ArrayList<>();
        List<Veiculo> veiculo = new ArrayList<>();

        Carro c1 = new Carro("Corsa", 2012, 4, "a", "ABCD");
        Carro c2 = new Carro("Celta", 2012, 4, "a","ABCD");


        System.out.println(c1.equals(c2));



        Scanner scan = new Scanner(System.in);

        System.out.println("Bem vindo ao Centro automotivo");
        System.out.println();
        boolean condicao = true;

        while(condicao) {

            System.out.println("MENU:");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Listar Veiculos cadastrados");
            int resposta = scan.nextInt();
            scan.nextLine();

            if(resposta == 1) {
                System.out.println("Você deseja cadastrar:");
                System.out.println("1 - Carro");
                System.out.println("2 - Moto");
                System.out.println("3 - Sair da aplicação");
                resposta = scan.nextInt();
                scan.nextLine();

                String modelo = null;
                int ano = 0;

                if (resposta == 1 || resposta == 2) {
                    System.out.println("Digite o modelo:");
                    modelo = scan.nextLine();
                    System.out.println("Digite o ano:");
                    ano = scan.nextInt();
                    scan.nextLine();
                    System.out.println();
                }

                String placa = null;
                if (resposta == 1) {
                    System.out.println("Digite o numero de portas: ");
                    int numPortas = scan.nextInt();
                    scan.nextLine();
                    System.out.println("Digite o tipo do volante: ");
                    String tipoVolante = scan.nextLine();
                    System.out.println("Digite o Número da placa: ");
                    placa = scan.nextLine();
                    veiculo.add(new Carro(modelo, ano, numPortas, tipoVolante, placa));
                } else if (resposta == 2) {
                    System.out.println("Digite o tipo do Motor: ");
                    String tipoMotor = scan.nextLine();
                    veiculo.add(new Moto(modelo, ano, tipoMotor, placa));
                } else if (resposta == 3) {
                    condicao = false;
                } else {
                    System.out.println("Você não digitou uma opção válida");
                }
            }else if(resposta == 2){
//                for(Veiculo v : veiculos){
//                    v.exibirInfo();
//                }
                System.out.println(veiculo);
            }

        }








    }
}