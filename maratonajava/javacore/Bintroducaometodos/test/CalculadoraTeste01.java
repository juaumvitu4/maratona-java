package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominioo.Calculadora;

public class CalculadoraTeste01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
        System.out.println("Finalizando Calculadora");
        calculadora.subtraiDoisNumeros();

    }
    public void multiplicaDoisNumeros (int num1, int num2) {
        System.out.println(num1 * num2 );
    }
}
