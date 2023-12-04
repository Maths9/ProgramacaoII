import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Continente{
        private String nome;
        private List<Pais> pais;

    public Continente(String nome) {
        this.nome = nome;
        pais = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicinarPais(Pais p) {
        pais.add(p);
    }

    public int populacaoTotal() {
        int populacao = 0;

        for(Pais p : pais) {
            populacao += p.getPopulacao();
        }

        return populacao;
    }
    public int territorio(){
        int territorio = 0;

        for (Pais p : pais){
            territorio += p.getTerritorio();
        }
        return territorio;
    }
    public Pais maiorpopulacao(){
        Pais maiorPopulacao = pais.get(0);
        for (Pais p: pais) {
            if ( p.getPopulacao() > maiorPopulacao.getPopulacao()){
                maiorPopulacao = p;
            }
        }
        return maiorPopulacao;
    }
}
