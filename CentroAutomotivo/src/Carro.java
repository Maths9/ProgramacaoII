public class Carro extends Veiculos {
    private int NumeroPortas;

    public Carro(String modelo, int ano, int numeroPortas) {
        super(modelo, ano);
        NumeroPortas = numeroPortas;
    }

    public int getNumeroPortas() {
        return NumeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        NumeroPortas = numeroPortas;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Número de portas: " + this.NumeroPortas);
    }
}
