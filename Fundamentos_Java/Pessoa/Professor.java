package Pessoa;

public class Professor extends Pessoa {
    
    private double salario;

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    String imprimirDadosDaPessoa(int indice) {
        System.out.println(super.imprimirDadosDaPessoa(indice));
        return "Você é professor!";
    }
}
