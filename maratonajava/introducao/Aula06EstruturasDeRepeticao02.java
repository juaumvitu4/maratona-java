package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao02 {
    // Imprima todos os numeros pares de 0 ate 10000
    public static void main(String[] args) {
        for (int i = 0; i <= 10000; i += 2) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
