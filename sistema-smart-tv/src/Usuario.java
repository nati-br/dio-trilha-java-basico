public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();
        System.out.println("TV Ligada ?\t" + smartTv.ligada);
        System.out.println("Canal Atual?\t"+ smartTv.canal);
        System.out.println("Volume Atual?\t" + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status-> TV Ligada?\t" + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo Status-> TV Ligada?\t" + smartTv.ligada);

        smartTv.dimuinuirVolume();
        smartTv.dimuinuirVolume();
        smartTv.dimuinuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume atual:\t" + smartTv.volume);

        smartTv.mudarCanal(13);
        System.out.println("Canal atual:\t" + smartTv.canal);
        System.out.println("Volume Atual:\t" + smartTv.volume);

    }   
}
