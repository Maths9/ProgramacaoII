import java.util.Scanner;

public class ContaTeste {
    public static void main(String[] args) {


        Scanner leitor = new Scanner(System.in);
        ContaBancaria newConta = new ContaBancaria(0,"Matheus Barboza");
        System.out.println(newConta.getTitularConta());
        System.out.println(newConta.getSaldo());
        System.out.println("O que deseja fazer?");
        System.out.println("Digite 1 caso queira fazer Deposito");
        System.out.println("Digite 2 caso queira fazer um Saque");
        leitor.nextLine();


        System.out.println("Digite valor do Deposito: ");
        double valorModificar = leitor.nextDouble();
        newConta.depositoConta(valorModificar);
        System.out.println("Saldo Atual: "+newConta.getSaldo());

        System.out.println("Digite valor do Saque: ");
        valorModificar = leitor.nextDouble();
        newConta.saqueConta(valorModificar);
        System.out.println("Saldo Atual: "+newConta.getSaldo());

        newConta.extrato();



    }
}