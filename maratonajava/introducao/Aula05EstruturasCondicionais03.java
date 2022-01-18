package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        double salario = 6000;
        String mensagemDoar = "Vou doar 500 reia pra mim";
        String mensagemNaoDoar = "Ainda Nao tenho condições, mas vou ter";
        //String resultado = (condicao) ? verdadeiro : falso
        String resultado = salario > 5000 ?  mensagemDoar : mensagemNaoDoar;
        System.out.println(resultado);

        // ou
        // String resultado = salario > 5000 ? "Vou Doar 500 reais a mim" : "Ainda Não Tenho Condições, Mas Vou Ter
    }
}
