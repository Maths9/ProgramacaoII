public class Moto extends Veiculos {
    private String TipoMotor;

    public Moto(String modelo, int ano, String tipoMotor) {
        super(modelo, ano);
        TipoMotor = tipoMotor;
    }

    public String getTipoMotor() {
        return TipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        TipoMotor = tipoMotor;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Tipo do Motor: " + this.TipoMotor);
    }
}
