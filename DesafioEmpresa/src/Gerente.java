public class Gerente extends Funcionario {
    private  String nomeEquipe;
    private int quantFuncionarios;

    public Gerente(String nome, String Cpf, String email, String nomeEquipe, int quantFuncionarios){
        super(nome, Cpf, email);
        this.nomeEquipe = nomeEquipe;
        this.quantFuncionarios = quantFuncionarios;
    }
    public String getNomeEquipe() {
        return nomeEquipe;
    }

    public void setNomeEquipe(String nomeEquipe) {
        this.nomeEquipe = nomeEquipe;
    }

    public int getQuantFuncionarios() {
        return quantFuncionarios;
    }

    public void setQuantFuncionarios(int quantFuncionarios) {
        this.quantFuncionarios = quantFuncionarios;
    }

    @Override
    public void exibirInfo() {
       super.exibirInfo();
        System.out.println("Equipe: "+ this.nomeEquipe);
        System.out.println("Quantidade de Funcionários: " + this.quantFuncionarios);

    }
    @Override
    public double calcularBonus() {
        return 0;
    }


}
