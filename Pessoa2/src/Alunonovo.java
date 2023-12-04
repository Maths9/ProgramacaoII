public class Alunonovo extends  Pessoa{

    public Alunonovo(String nome, int idade) {
        super(nome, idade);
        //TODO Auto-generated constructor stub
    }

    public String curso;


    public void mostraDados() {
        super.mostraDados();
        System.out.println("Curso do aluno: " + curso);
    }
}