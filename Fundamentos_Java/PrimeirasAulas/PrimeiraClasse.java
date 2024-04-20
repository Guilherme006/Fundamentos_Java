package PrimeirasAulas;
/**
 * PrimeiraClasse = nome da classe
 * public = tipo de acesso da classe
 * class = tipo da classe   
*/



public class PrimeiraClasse {

        // Todo conteúdo deverá ser iserido aqui dentro
        public static void main(String[] args) {

            /*
             * Valores (int, double, float, long)
             * Texto (String)
             * Booleanos (boolean)
             */

            int DadoDoTipoInt = 10;
            double DadoDoTipoDouble = 13.5;
            float DadoDoTipoFloat = 5.4f; 
            long DadoDoTipoLong = 57541574557515L;

            String DadoDoTipoString = "Meu texto";

            boolean DadoDoTipoBoolean = false;


            // if - else
            if(DadoDoTipoInt == 10) {
                //sysout
                System.out.println("Entrou no if");
            }else if (DadoDoTipoInt < 12) {
                System.out.println("Entrou no else if");
            }else {
                System.out.println("Entrou no else");
            }


            // While (Enquanto algo for verdadeiro, faça alguma coisa)
            int ValorInicial = 0;
            while (ValorInicial < 3) {
                System.out.println(ValorInicial);
                ValorInicial++;
            }


            // For
            for(int i = 0; i < 4; i++) {
                System.out.println("O valor do i é: " + i);
            }
        }
    
}