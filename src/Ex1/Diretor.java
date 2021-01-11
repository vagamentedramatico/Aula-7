package Ex1;

public class Diretor extends Empregado {

    private Empresa empresa;
    public Diretor(String nome, Empresa empresa){
        super(nome);
        this.empresa = empresa;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    @Override
    public double getSalario() {
        return super.getSalario() * 2 + (getEmpresa().getLucro() * 0.01);
    }
}
