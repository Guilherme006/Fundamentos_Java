package PrimeirasAulas;
import java.util.ArrayList;
import java.util.List;


public class EstruturaDeDados {

    public static void main(String[] args) {

        // Lista
        List<String> nomes = new ArrayList<>();
        nomes.add("Guilherme");
        nomes.add("Samuel");
        nomes.add("Bruno");

        // System.out.println(nomes.get(1));

        // for(String nome : nomes) {
        //     System.out.println("O nome é " + nome);
        // }

        nomes.forEach(nome -> System.out.println("O nome é " + nome));
    }
}
