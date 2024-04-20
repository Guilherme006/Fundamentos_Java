package Construtor;

public class Construtor {
    
    private int numero;

    public Construtor(int numero) {
        this.numero = numero;
        System.out.println("Construtor com um parâmetro criado!");
    }

    public Construtor(int numero, String texto) {
        this.numero = numero;
        System.out.println("Construtor com dois parâmetros criado!");
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }
}
