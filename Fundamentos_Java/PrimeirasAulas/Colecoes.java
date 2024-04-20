package PrimeirasAulas;
import java.util.HashMap;
import java.util.Map;

public class Colecoes {

    public static void main(String[] args) {
        Map<String, Integer> notas = new HashMap<>();
        notas.put("Guilherme", 10);
        notas.put("Samuel", 8);
        notas.put("Bruno", 7);

        // var nota = notas.get("Guilherme");
        // System.out.println(nota);

        for(Map.Entry<String, Integer> entry : notas.entrySet()) {

            String key = entry.getKey();
            Integer value = entry.getValue();

            System.out.println("A chave é " + key + " e o valor é " + value);
        }
    }
}
