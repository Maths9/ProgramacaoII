import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Veiculos> veiculos = new ArrayList<>();

        veiculos.add(new Carro("FIAT UNO ", 2018,4));
        veiculos.add(new Carro("Chevrolet CAMARO",2019,2));
        veiculos.add(new Moto("Fan",2015,"160"));

        for (Veiculos func : veiculos){
            func.exibirInfo();
            System.out.println();
        }

    }
}
