public class Funcionario extends Pessoa {
    private String SetorTrabalho;

    
    public Funcionario(String nome, int idade, String setorTrabalho) {
        super(nome, idade);
        SetorTrabalho = setorTrabalho;
    }

    public String getSetorTrabalho() {
        return SetorTrabalho;
    }

    public void setSetorTrabalho(String setorTrabalho) {
        SetorTrabalho = setorTrabalho;
    }

    @Override
    public void mostrarDados(){
        super.mostrarDados();
        System.out.println(SetorTrabalho);
        
    }
    
    
}