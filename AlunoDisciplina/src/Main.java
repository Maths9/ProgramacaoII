package AlunoDisciplina.src;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("S0321", "João Flavio");
        a1.setNotaP1(4);
        a1.setNotaP2(4.2);
        a1.setNotaT(10);

        Aluno a2 = new Aluno("S057473", "Robert", 9, 7.5, 6);

        a1.exibirAluno();
        a2.exibirAluno();
    }
}