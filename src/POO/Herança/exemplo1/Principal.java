package POO.Herança.exemplo1;

public class Principal {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa(18, "Fernando");
        Aluno aluno = new Aluno(18, "Luigi", "3w4s5drftyg");

        aluno.apresentar();

        System.out.println("Nome aluno: " + aluno.getNome());
        System.out.println("Idade aluno: " + aluno.getIdade());
        System.out.println("Matricula aluno: " + aluno.getMatricula());
    }
}
