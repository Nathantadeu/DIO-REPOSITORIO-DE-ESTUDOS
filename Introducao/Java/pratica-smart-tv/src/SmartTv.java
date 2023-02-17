public class SmartTv {
    boolean ligada = false;
    int volume = 25;
    int canal = 1;

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }

    public void aumentavolume(){
        volume++;
    }

    public void abaixavolume(){
        volume--;
    }

    public void trocandocanal(){
        canal++;
    }

    public void retornandocanal(){
        canal--;
    }

    public void mudarcanal(int novoCanal){
        canal = novoCanal;
    }
}
