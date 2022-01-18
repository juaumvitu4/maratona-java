package academy.devdojo.maratonajava.javacore.Heranca.Domain;

public class Funcionario1 extends Pessoa1 {

    private double salario;

    public void imprime(){
        super.imprime();
        System.out.println(this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
