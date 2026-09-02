package POO.Polimorfismo.exemplo3;

public class CartaoCredito extends MetodoPagamento {

    @Override
    public void pagarAVista() {
        System.out.println("Pagando com Cartão de Crédito");
    }
}
