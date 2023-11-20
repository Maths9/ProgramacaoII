public abstract  class Funcionario {
    private String nome;
    private String Cpf;
    private String email;


    public Funcionario( String nome, String Cpf, String email){
        this.nome = nome;
        this.Cpf =  Cpf;
        this.email = email;

    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String cpf) {
        Cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void exibirInfo(){
        System.out.println("nome: " + this.nome );
        System.out.println("CPF: " + this.Cpf);
        System.out.println("email: " + this.email);
    }
    public abstract double calcularBonus();
}
