package Conta;

public class TesteContaBancaria {
    
    public static void main(String[] args) {
        
        ContaBancaria contaBancaria1 = new ContaBancaria();
        contaBancaria1.setNumero("1234"); 
        contaBancaria1.setTitular("Maria"); 

        contaBancaria1.depositar(500);
        contaBancaria1.sacar(100);
    }
}
