public class Carro extends Veiculo {

    private int numPorta;
    private String tipoVolante;
    private String placa;

    public Carro(String modelo, int ano, int numPorta, String tipoVolante, String placa){
        super(modelo, ano,placa);
        this.numPorta = numPorta;
        this.tipoVolante = tipoVolante;
        this.placa = placa;
    }

    public int getNumPorta() {
        return numPorta;
    }

    public void setNumPorta(int numPorta) {
        this.numPorta = numPorta;
    }

    public String getTipoVolante() {
        return tipoVolante;
    }

    public void setTipoVolante(String tipoVolante) {
        this.tipoVolante = tipoVolante;
    }

    @Override
    public void exibirInfo(){
        super.exibirInfo();
        System.out.println("Numero de Portas: " + this.numPorta);
        System.out.println("Tipo do Volante: " + this.tipoVolante);
        System.out.println("Número da placa: " + this.placa);
    }
    @Override
    public String toString(){
        return super.getModelo() + ", " + super.getAno() + ", " +
                this.numPorta + ", " + this.tipoVolante + ", " + this.placa;
    }

    @Override
    public boolean equals(Object obj) {
        Carro carro = (Carro) obj;
        if(super.getModelo().equals(carro.getModelo())) {
            return true;
        }else{
            return false;
        }
    }

}
