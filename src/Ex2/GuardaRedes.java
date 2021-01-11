package Ex2;

public class GuardaRedes extends Jogador {
    private int golosSofridos = 0;

    public GuardaRedes (String nome, int numero){
        super(nome, numero);
    }

    public void sofrerGolo(){
        golosSofridos++;
        System.out.println("Golo sofrido crl!");
    }

    public int getGolosSofridos(){
        return golosSofridos;
    }

    @Override
    public String toString() {
        return "Guarda Redes: " + getNome() + "(" + getNumero() + ")\nGolos Marcados: "
                + getGoloMarcado() + "\nGolos Sofridos: " + getGolosSofridos();
    }
}
