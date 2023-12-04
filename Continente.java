import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Continente{
    public static void main(String[] args) {
        
    }
    private String nome;
    private List<Pais> paises;

    public Continente(String nome) {
        this.nome = nome;
        this.paises = new ArrayList<>();
    }

    public void adicionarPais(Pais pais) {
        if (!paises.contains(pais)) {
            paises.add(pais);
        } else {
            System.out.println("O país já foi cadastrado anteriormente.");
        }
    }

    public int getDimensaoTotal() {
        return paises.size();
    }

    public int getPopulacaoTotal() {
        int populacaoTotal = 0;
        for (Pais pais : paises) {
            populacaoTotal += pais.getPopulacao();
        }
        return populacaoTotal;
    }

    public Pais getPaisComMaiorPopulacao() {
        return paises.stream().max(Comparator.comparing(Pais::getPopulacao)).orElse(null);
    }

    public Pais getPaisComMenorPopulacao() {
        return paises.stream().min(Comparator.comparing(Pais::getPopulacao)).orElse(null);
    }
}