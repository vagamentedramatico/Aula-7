package Ex1;

public class Empresa {

    private String nome;
    private Empregado[] listaEmpregados = new Empregado[0];
    private double lucro;

    public Empresa(String nome) {
        this.nome = nome;
    }

    public String getNome() {return nome;}

    public void setLucro(double lucro){
        this.lucro = lucro;
    }

    public double getLucro() {return lucro;}

    public void addEmpregado(Empregado empregado){
        Empregado[] novaLista = new Empregado[listaEmpregados.length + 1];
        for(int i = 0; i < listaEmpregados.length; i++) {
            novaLista[i] = listaEmpregados[i];
        }
        novaLista[listaEmpregados.length] = empregado;
        this.listaEmpregados = novaLista;
    }

    public double getSalarioTotal() {
        double soma = 0;

        // for(int i=0; i<listaEmpregados.length; i++){
        //  Empregado empregado = listaEmpregados [i];
        //  soma += empregado.getSalario(); }

        //         |  OR  |

        for(Empregado empregado : listaEmpregados) {
            soma += empregado.getSalario();
        }
        return soma;
    }
}
