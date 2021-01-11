package Ex2;

public class Main {

    public static void main(String[] args){

        GuardaRedes guardaRedes = new GuardaRedes("José", 17);
        JogadorDeCampo jogador = new JogadorDeCampo("Manuel", 12);

        System.out.println("---- INÍCIO DO JOGO ----");
        System.out.println();
        System.out.println(jogador);
        System.out.println();
        System.out.println(guardaRedes);
        System.out.println();

        jogador.fazerPasse();
        jogador.receberPasse();
        jogador.fazerPasse();
        guardaRedes.sofrerGolo();
        jogador.receberPasse();
        jogador.marcarGolo();
        jogador.marcarGolo();
        guardaRedes.sofrerGolo();
        jogador.fazerPasse();
        jogador.marcarGolo();
        guardaRedes.sofrerGolo();
        jogador.receberPasse();
        jogador.marcarGolo();
        guardaRedes.sofrerGolo();

        System.out.println();
        System.out.println("---- FIM DO JOGO ----");
        System.out.println();
        System.out.println(jogador);
        System.out.println();
        System.out.println(guardaRedes);

    }

}
