/*
Vamos modelar uma classe Conta, representando uma conta bancária
A classe conta precisa armazenar o valor atual do saldo da conta (use float ou double mesmo, não tem problema nesse exercício)
O objeto deve ser inicializado com o saldo inicial da conta
Crie métodos para creditar e debitar valores da conta, bem como retornar o saldo
Crie uma classe chamada ContaTeste, nela declare o método main, crie e manipule alguns objetos Conta, creditando, debitando e exibindo o saldo das mesmas após as manipulações

 */


public class ContaBancaria {


    private double saldo;
    private String titularConta;
    public int escolha;

    public ContaBancaria( double saldo, String titularConta){

        this.saldo = saldo;
        this.titularConta = titularConta;
    }


    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitularConta() {
        return titularConta;
    }

    public void setTitularConta(String titularConta) {
        this.titularConta = titularConta;
    }

    public double saqueConta(double valorSaque){
        if (saldo < valorSaque){
            System.out.println("Digite um valor valido, acima do valor ");
        }
        saldo = saldo - valorSaque;
        return  saldo;

    }

    public double depositoConta(double valorDeposito){
        saldo = saldo + valorDeposito;
        return saldo;
    }

    public void extrato(){

        System.out.println("======================================");
        System.out.println("Nome do titular: \t"+ titularConta);
        System.out.println("Saldo Atual: \t"+saldo);
        System.out.println("======================================");
        System.out.println(" Operação Finalizada!");
    }


}




