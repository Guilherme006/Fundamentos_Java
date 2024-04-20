package Pessoa;

public class Aluno extends Pessoa {
    
    private String matricula;

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    String imprimirDadosDaPessoa(int indice) {
        System.out.println(super.imprimirDadosDaPessoa(indice));
        return "Você é aluno!";
    }
}

