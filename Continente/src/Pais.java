import java.util.Objects;

public class Pais  {
    private String nome;
    private int populacao;
    private int territorio;

    public Pais(String nome, int populacao, int territorio) {
        this.nome = nome;
        this.populacao = populacao;
        this.territorio = territorio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPopulacao() {
        return populacao;
    }

    public void setPopulacao(int populacao) {
        this.populacao = populacao;
    }

    public int getTerritorio() {
        return territorio;
    }

    public void setTerritorio(int territorio) {
        this.territorio = territorio;
    }

    @Override
    public String toString() {
        return "Pais{" +
                "nome='" + nome + '\'' +
                ", populacao=" + populacao +
                ", territorio=" + territorio +
                '}';
    }
}