import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List <Pessoa> pessoa = new ArrayList();

            pessoa.add(new Aluno("Gabriel ", 14, "chibata" ));
            pessoa.add(new Funcionario("cu ", 35, "popou"));

            String pdf = "Gabriel ";

            for(Pessoa p: pessoa ){
                if(p.getNome().equals(pdf)) {
                    if(p instanceof Aluno) {
                        System.out.println(p.getNome() + "é aluno");
                    } else {
                        System.out.println(p.getNome() + "é funcionario");
                    }
                }
            }



        
    }
}
