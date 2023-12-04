public class Funcionario extends Pessoa {
    public String setor;
    

    public Funcionario(String nome, int idade, String setor) {
        super(nome, idade);
        this.setor = setor;
    }

    public void mostraDados() {
        super.mostraDados();
        System.out.println("Setor do funcionário: " + setor);
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
}