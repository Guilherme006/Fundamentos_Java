package Pessoa;

public class TesteDePessoa {
    
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.setCpf("111.111.111-11");
        professor.setNome("Cleber");
        professor.setIdade(30);
        professor.setSalario(5000);

        System.out.println(professor.imprimirDadosDaPessoa(1));

        Aluno aluno = new Aluno();
        aluno.setCpf("222.222.222-22");
        aluno.setNome("Gabriela");
        aluno.setIdade(27); 
        aluno.setMatricula("44455585");

        System.out.println(aluno.imprimirDadosDaPessoa(2));
    }
}
