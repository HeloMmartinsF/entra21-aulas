package POO.Polimorfismo.exemplo1;

public class Cachorro extends Animal {

    @Override
    public void emitirSom() {
        System.out.println("Au au!");
    }

    public void perserguirCarteiro() {
        System.out.println("Volta aqui au au au");
    }
}
