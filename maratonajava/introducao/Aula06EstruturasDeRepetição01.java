package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepetição01 {
    public static void main(String[] args) {
        // while, do while, for
        int count = 0;
        while (count < 11) {
            System.out.println(count);
            count = count + 1;
        }
        do {
            System.out.println("Dentro Do Do While");
        } while (count < 10 );
    }
}
