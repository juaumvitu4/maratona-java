package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores4 {
    public static void main(String[] args) {
        double valorTotalContaCorrente = 200 ;
        double valorTotalPoupanca = 10000;
        float valorPlay = 5000F;
        boolean isPlaystationCinco = valorTotalContaCorrente > valorPlay || valorTotalPoupanca > valorPlay;
        System.out.println("Playstation é Compravel "+isPlaystationCinco);

    }
}
