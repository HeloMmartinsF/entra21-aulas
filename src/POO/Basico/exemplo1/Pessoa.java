package POO.Basico.exemplo1;

public class Pessoa {
    String nome;
    int idade;
    double peso;

    //CONSTRUTOR VAZIO
    public Pessoa(){}

    //CONSTRUTOR COM PARAMETROS
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    void apresentar() {
        System.out.println("Olá meu nome é " + this.nome);
        System.out.println("Minha idade é " + this.idade);
    }
}
