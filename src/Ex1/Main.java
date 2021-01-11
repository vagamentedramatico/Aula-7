package Ex1;

public class Main {
    public static void main(String[] args){

        Empresa empresa = new Empresa("XPTO");
        empresa.setLucro(30000);

        Empregado empregadoJose = new Empregado("José");
        Empregado empregadaMaria = new Empregado("Maria");
        Gerente gerenteManuel = new Gerente("Manuel");
        Gerente gerenteAna = new Gerente("Ana");
        Diretor diretorTobias = new Diretor("Tobias", empresa);

        gerenteAna.setCumpriuObjetivos(true);

        empresa.addEmpregado(empregadoJose);
        empresa.addEmpregado(empregadaMaria);
        empresa.addEmpregado(gerenteManuel);
        empresa.addEmpregado(gerenteAna);
        empresa.addEmpregado(diretorTobias);

        System.out.println("Total empresa " + empresa.getSalarioTotal());
    }
}
