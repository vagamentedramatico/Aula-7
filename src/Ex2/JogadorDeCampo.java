package Ex2;

public class JogadorDeCampo extends Jogador {

    private int passesFeitos;
    private int passesRecebidos;

    public JogadorDeCampo(String nome, int numero) {
        super(nome, numero);
    }

    public void fazerPasse() {
        passesFeitos++;
        System.out.println("Passe feito!");
    }

    public void receberPasse() {
        passesRecebidos++;
        System.out.println("Passe recebido!");
    }

    public int getPassesFeitos() {
        return passesFeitos;
    }

    public int getPassesRecebidos() {
        return passesRecebidos;
    }

    @Override
    public String toString() {
        return "Jogador de Campo " + getNome() + "(" + getNumero() + ")\nGolos Marcados: "
                + getGoloMarcado() + "\nPasses Feitos: " + getPassesFeitos() +
                "\nPasses Recebidos: " + getPassesRecebidos();
    }
}
