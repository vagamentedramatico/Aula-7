package Ex1;

public class Gerente extends Empregado {

    private boolean cumpriuObjetivos = false;

    public Gerente(String nome) {
        super(nome);
    }

    public void setCumpriuObjetivos(boolean cumpriu) {
        this.cumpriuObjetivos = cumpriu;
    }

    @Override
    public double getSalario() {
        if(cumpriuObjetivos){
            return super.getSalario() + 200;
        }
        return super.getSalario();
    }
}
