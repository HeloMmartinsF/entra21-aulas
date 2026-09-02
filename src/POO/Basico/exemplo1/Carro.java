package POO.Basico.exemplo1;

import POO.Basico.exercicios.um.Aluno;

public class Carro {
    String cor;
    String modelo;
    String marca;
    int ano;
    Pessoa dono;

    void ligar() {
        if (dono == null) {
            System.out.println("carro sem dono");
        } else {
            dono.apresentar();
            System.out.println("vruuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuum");
        }
    }
}
