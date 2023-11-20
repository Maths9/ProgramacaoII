public class Programador extends  Funcionario {
    private String linguagem;
    private String tipo;

    public Programador(String nome, String Cpf, String email, String linguagem, String tipo) {
        super(nome, Cpf, email);
        this.linguagem = linguagem;
        this.tipo = tipo;
    }

    public String getLinguagem() {
        return linguagem;
    }

    public void setLinguagem(String linguagem) {
        this.linguagem = linguagem;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Linguagem: "+ this.linguagem);
        System.out.println("tipo: " + this.tipo);
    }

    @Override
    public double calcularBonus() {
        return 0;
    }
}
