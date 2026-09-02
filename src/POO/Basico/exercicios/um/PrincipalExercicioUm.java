package POO.Basico.exercicios.um;

public class PrincipalExercicioUm {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        aluno1.nome = "José";

        Aluno aluno2 = new Aluno();
        aluno2.nome = "José2";

        aluno1.estudar();
        aluno2.estudar();
    }
}
