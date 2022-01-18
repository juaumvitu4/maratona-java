package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominioo;

public class Calculadora {

    public void somaDoisNumeros() {
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros() {
        System.out.println(20 - 10);
    }

    public void multiplicaDoisNumeros(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    public double divideDoisNumeros(double num1, double num2) {
        if (num2 == 0) {
            return 0;
        }
        return num1 / num2;
    }

    public double divideDoisNumeros02(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        }
        return 0;
    }

    public void imprimiDivisaoDeDoisNumeros(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Nao existe divisão por zero");
            return;
        }
            System.out.println(num1 / num2);
        }
        public void alteraDoisNumeros(int numero1, int numero2){
            numero1 = 99;
            numero2 = 33;
            System.out.println("Dentro do AlteraDoisNumeros");
            System.out.println("Num1 "+numero1);
            System.out.println("Num2 "+numero2);
        }

        public void somaArray(int [] numeros){
            int soma = 0;
            for (int temp: numeros){
                soma += temp;
            }
            System.out.println(soma);
        }
        public void somaVarArgs(int... numeros){
            int soma = 0;
            for (int temp: numeros){
                soma += temp;
            }
            System.out.println(soma);
        }
    }
