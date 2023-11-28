package ControlarAluno.src;


import ControlarAluno.src.Aluno;

public class Main {
    public static void main(String[] args) {
        System.out.println("Estou na main...");

        Aluno aluno = new Aluno();
        aluno.setNome("Matheus");
        aluno.setIdade(20);
        aluno.bemVindo();
        String nome = aluno.getNome();
        System.out.println(nome);
       
    }
    
}

