package academy.devdojo.maratonajava.javacore.Heranca.Domain;

public class Funcionario extends Pessoa {
    private double salario;
    static {
        System.out.println("Dentro do bloco de inicialiação estatico Funcionario");

    }
    {
        System.out.println("Dentro do bloco de inicialiação estatico de Funcionario 1");
    }
    {
        System.out.println("Dentro do bloco de inicialiação estatico de Funcionario 2");
    }

    public Funcionario(String nome){
        super(nome);
        System.out.println("Dentro do construtor funcionario");
    }

    @Override
    public void imprime() {
        super.imprime();
        System.out.println(this.salario);
    }

    public void relatorioPagamentos(){
        System.out.println("Eu " + this.nome + " reebi o salario de " +this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
}
