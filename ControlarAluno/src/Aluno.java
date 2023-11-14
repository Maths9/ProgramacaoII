package ControlarAluno.src;


public class Aluno {

    private String nome;
    private int Idade;

    public String getNome(){
        return this.nome;
    }

    public int getIdade(){
        return this.Idade;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int Idade){
        this.Idade = Idade;
    }

    public void bemVindo(){
      
        System.out.println("oi, eu sou o aluno: " + this.nome +" e tenho " + this.Idade + " Anos");
    }


}