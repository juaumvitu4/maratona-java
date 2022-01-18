package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao04 {
    // dado um valor de umm carro, descubra em quantas ele pode ser parcelado
    // condição valorParcela >= 100
    public static void main(String[] args) {
        double valorTotal = 30000;
        for (int parcela = 1; parcela <= valorTotal; parcela++) {
            double valoParcela = valorTotal / parcela;
            if (valoParcela < 1000) {
                break;

            }
            System.out.println("Parcela " + parcela + "R$ " + valoParcela);
        }
    }
}