public class Moto extends Veiculo {
    private String TipoMotor;

    public Moto(String modelo, int ano, String tipoMotor, String placa) {
        super(modelo, ano,placa);
        this.TipoMotor = tipoMotor;
    }

    public String getTipoMotor() {
        return TipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        TipoMotor = tipoMotor;
    }


    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Tipo do Motor: " + this.TipoMotor);
    }
    public String toString(){
        return super.getModelo() + "" + getTipoMotor() + " " + super.getAno();
    }
}
