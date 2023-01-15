public class Estrutura {
//Varivel
    public static void main(String[] args) {
        String primeiroNome = "Juliana";
        String segundoNome = "Cardoso";
        String nomeCompleto = nomeCompleto(primeiroNome,segundoNome);

        System.out.println(nomeCompleto);
    }
//Metodo
    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}

