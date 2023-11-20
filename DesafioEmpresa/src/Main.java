import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(new Gerente("flavio", "1009", "flavio@.com", "azul", 10 ));
        funcionarios.add(new Gerente("matheus","20003", "matheus.com" ,"amarelo",0 ));
        funcionarios.add(new Gerente("jadson", "23444", "jandson.com", "rosa", 2));
        funcionarios.add(new Programador("pedro", "23245", "pedro.com", "python", "backend"  ));

        for (Funcionario func : funcionarios){
            func.exibirInfo();
            System.out.println();
        }
    }
}