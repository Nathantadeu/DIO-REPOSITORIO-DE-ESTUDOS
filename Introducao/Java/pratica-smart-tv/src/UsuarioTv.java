public class UsuarioTv {
    public static void main(String[] args) {
        //Cria um parametro para chamar, o metodo.
        SmartTv smartTv = new SmartTv();

        //Sendo impresso o metodo chamado.
        System.out.println("Tv Ligada ? " + smartTv.ligada);
        System.out.println("Canal atual : " + smartTv.canal);
        System.out.println("Volume atual :" + smartTv.volume);

        //Primeiro chamo o metodo, depois da verificacao o metodo e impresso.
        smartTv.ligar();
        System.out.println("Novo Status -> Tv ligada ? " + smartTv.ligada);

        //Primeiro chama o metodo, depois da verificacao o metodo e impresso.
        smartTv.desligar();
        System.out.println("Status inicial -> Tv desligada ? "+ smartTv.ligada);

        //Primeiro chama o metodo, depois da verificacao o metodo e impresso.
        smartTv.aumentavolume();
        System.out.println("Aumentando volume : " + smartTv.volume);

        //Primeiro chama o metodo, depois da verificacao o metodo e impresso.
        smartTv.abaixavolume();
        System.out.println("Abaixando volume : " + smartTv.volume);

        //Primeiro chama o metodo, depois da verificacao o metodo e impresso.
        smartTv.trocandocanal();
        System.out.println("Trocando canal : " + smartTv.canal);

        //Primeiro chama o metodo, depois da verificacao o metodo e impresso.
        smartTv.retornandocanal();
        System.out.println("Retornando canal : " + smartTv.canal);

        //Primeiro chama o metodo, depois da verificacao o metodo e impresso.
        smartTv.mudarcanal(20);
        System.out.println("Digite um canal : " + smartTv.canal);

    }
}
