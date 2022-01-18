package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais06 {
    // dados os valores de 1 a 7, imprima se é dia util ou final de semana
    public static void main(String[] args) {
        byte dia = 5;
        switch (dia) {
            case 1 :
                System.out.println("Segunda Feira, Dia Util");
                break;
            case 2 :
                System.out.println("Terça Feira, Dia Util");
                break;
            case 3 :
                System.out.println("Quarta Feira, Dia Util");
                break;
            case 4 :
                System.out.println("Quinta Feira, Dia Util");
                break;
            case 5 :
                System.out.println("Sexta Feira, Dia Util");
                break;
            case 6 :
                System.out.println("Sabado, Final De Semana");
                break;
            case 7 :
                System.out.println("Domingoo, Final De Semana");
                break;
            default:
                System.out.println("Invalido");
        }
        byte dias = 7;
        switch (dias){
            case 1:
            case 7:
                System.out.println("Final De Semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia Util");
                break;
        }
    }
}
