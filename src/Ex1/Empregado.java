package Ex1;

public class Empregado {
    private String nome;
    private double salario = 800;

    public Empregado(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return "Olá, eu sou o " + getNome() + ", e SÓ recebo " + getSalario() + "€ :(";
    }
}
