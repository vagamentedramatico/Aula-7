package Ex2;

public abstract class Jogador {
    // abstract: só pode ser utilizada através das sub-classes
    private String nome;
    private int numero;
    private int golosMarcados = 0;

    public Jogador(String nome, int numero){
        this.nome = nome;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }

    public void marcarGolo() {
        golosMarcados++;
        System.out.println("GOOOOOOOOOLOOOOOOOOOO!!!!!!!AAAAHHHHHHHHH!!!!!!!");
    }

    public int getGoloMarcado() {
        return golosMarcados;
    }

}
