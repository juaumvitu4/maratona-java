package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;


import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Honda civic";
        carro1.modelo = "Sedan";
        carro1.ano = 2008;

        //carro1 = carro2;
        //referencia

        carro2.nome = "Mustang";
        carro2.ano = 2015;
        carro2.modelo = "Turbo";

        System.out.println(carro1.nome);
        System.out.println(carro1.ano);
        System.out.println(carro1.modelo);

        System.out.println("----------------");

        System.out.println(carro2.nome);
        System.out.println(carro2.ano);
        System.out.println(carro2.modelo);




    }
}
