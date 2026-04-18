import java.util.Scanner;

public class Exercicios01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a primeira nota:");
        double nota1 = sc.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();

        System.out.print("Digite a frenquencia: ");
        int frequencia = sc.nextInt();

        double mediaminima = 7.0;
        int frequenciaminima = 75; // 75%

        double mediafinal = (nota1 + nota2) / 2;

        if(mediafinal >= mediaminima && frequencia >= frequenciaminima) {
            System.out.println("aprovado");
        } else if (mediafinal >= 5.0 && frequencia >= frequenciaminima){
            System.out.println("recuperacao");
        } else{
            System.out.println("reprovado");
        }
        System.out.println("media final:" + mediafinal);

        sc.close();
    }
}