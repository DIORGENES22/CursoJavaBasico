public class Ususario {


    public static void main(String[] args){

        smartTv smartTv = new smartTv();

        smartTv.dimunuirVolume();
        smartTv.dimunuirVolume();
        smartTv.dimunuirVolume();
        smartTv.aumneterVolume();

        System.out.println("Canal Atual : "+smartTv.canal);
        smartTv.mudarCanal(13);

        System.out.println("Canal Atual : "+smartTv.canal);
        System.out.println("TV Ligada ? "+smartTv.ligada);
        System.out.println("Volume Atual : "+smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status -> TV Ligada ? "+smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo Status -> TV Ligada ? "+smartTv.ligada);

    }
    
}
