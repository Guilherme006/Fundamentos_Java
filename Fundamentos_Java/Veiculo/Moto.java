package Veiculo;

public class Moto implements Veiculo {

    @Override
    public void acelerar() {
        System.out.println("\nAcelerando a moto");
    }

    @Override
    public void frear() {
        System.out.println("Freando a moto");
    }
    
}
