package RestauranteApp.src;

public class Produto {
    //Atributos
    private String nomePrato;
    private double precoUnit;

    //construtores
    public Produto(String nomePrato, double precoUnit){
        this.nomePrato = nomePrato;
        this.precoUnit = precoUnit;
    }

    //gets e sets
    public String getNomePrato() {
        return nomePrato;
    }

    public void setNomePrato(String nomePrato) {
        this.nomePrato = nomePrato;
    }

    public double getPrecoUnit() {
        return precoUnit;
    }

    public void setPrecoUnit(double precoUnit) {
        this.precoUnit = precoUnit;
    }
}
