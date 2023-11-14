import java.sql.SQLOutput;

public class Aluno {
    //Atributos
    private String matricula;
    private String nome;
    private double notaP1;
    private double notaP2;
    private double notaT;
    private double peso1;
    private double peso2;
    private double pesoT;

    //Construtores
    public Aluno(String matricula, String nome){
        this.matricula = matricula;
        this.nome = nome;
        this.peso1 = 4;
        this.peso2 = 4;
        this.pesoT = 2;
    }

    public Aluno(String matricula, String nome, double notaP1, double notaP2, double notaT){
        this.matricula = matricula;
        this.nome = nome;
        this.notaP1 = notaP1;
        this.notaP2 = notaP2;
        this.notaT = notaT;
        this.peso1 = 4;
        this.peso2 = 4;
        this.pesoT = 2;
    }

    //Metodos gets e sets
    public String getMatricula(){
        return this.matricula;
    }

    public void setMatricula(String matricula){
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNotaP1() {
        return notaP1;
    }

    public void setNotaP1(double notaP1) {
        this.notaP1 = notaP1;
    }

    public double getNotaP2() {
        return notaP2;
    }

    public void setNotaP2(double notaP2) {
        this.notaP2 = notaP2;
    }

    public double getNotaT() {
        return notaT;
    }

    public void setNotaT(double notaT) {
        this.notaT = notaT;
    }

    // outros métodos

    public double calcularMedia(){
        double media;
        media = ((this.notaP1 * this.peso1) + (this.notaP2 * this.peso2) + (this.notaT * this.pesoT)) / (this.peso1+this.peso2+this.pesoT);
        return media;
    }

    public double calcularFinal(){
        double media = this.calcularMedia();
        if(media >= 7.0){
            return 0;
        }else{
            //double notaFinal = 10 - media;
            //return notaFinal;
            return 10 - media;
        }
    }

    public void exibirAluno(){
        System.out.println("Aluno: "+this.nome);
        System.out.println("Matricula: " + this.matricula);
        double media = this.calcularMedia();
        double fin = this.calcularFinal();
        if(media >= 7){
            System.out.println("Parabéns, você foi aprovado com a média " + media);
        }else{
            System.out.println("Ih rapaz, você está na Final precisando de " + fin);
        }
        System.out.println();
        System.out.println();
    }

}
