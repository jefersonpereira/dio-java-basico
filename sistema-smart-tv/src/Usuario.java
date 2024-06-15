public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("TV Volume Atual : " + smartTv.volume);

        System.out.println("TV Ligada ? " + smartTv.ligada);
        System.out.println("TV Canal Atual : " + smartTv.canal);
        System.out.println("TV Volume Atual : " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status --> TV Ligada ? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo Status --> TV Ligada ? " + smartTv.ligada);

        System.out.println("TV Canal Atual : " + smartTv.canal);
        smartTv.mudarCanal(10);
        System.out.println("TV Canal Atual : " + smartTv.canal);
    }
}
