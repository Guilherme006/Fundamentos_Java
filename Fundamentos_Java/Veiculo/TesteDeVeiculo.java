package Veiculo;

public class TesteDeVeiculo {
    
    public static void main(String[] args) {

        // Não é possível instanciar uma interface
        Veiculo carro = new Carro();
        Veiculo moto = new Moto();

        carro.acelerar();
        carro.frear();

        moto.acelerar();
        moto.frear();

    }
}
