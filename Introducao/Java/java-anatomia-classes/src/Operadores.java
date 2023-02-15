public class Operadores {
    public static void main(String[] args) {

        // Sistema de conferencia (verdadeiro, falso com nomes, para termos de comparacao deve ser usado o equals)
        String nomeUm = "Gleyson";
        String nomeDois = "Gleyson";

        System.out.println(nomeUm.equals(nomeDois)); 


        // Sistema de comparacao com numeros(verdadeio e falso com numeros)
        int numero1 = 1;
        int numero2 = 2;

        //Primeiro teste
        boolean simNao = numero1 == numero2;

        System.out.println("Numero1 e igual a Numero2 ? " + simNao);

        // Segundo teste
        simNao = numero1 != numero2;

        System.out.println("Numero1 e diferente da Numero2 ? " + simNao);

        //Terceiro teste
        simNao = numero1 > numero2;

        System.out.println("Numero1 e maior que Numero2 ? " + simNao);

        //Quarto teste (testando com funcao if)
        if(simNao = numero1 < numero2){
            System.out.println("a nossa condicao e verdadeira ? " + simNao);
        }
        
        //Operadores Logicos
        boolean condicao1 = true;
        boolean condiacao2 = false;
        
        // Se condicao1 e condicao2 forem verdadeira, executar codigo
        if(condicao1 && condiacao2){
            System.out.println("Ambas as condicoes sao verdadeiras");
        }

        //Se condicao ou condicao 2 for verdadeira, executar codigo
        if(condicao1 || condiacao2){
            System.out.println("Uma das condicoes e verdadeira");
        }

    }
}
