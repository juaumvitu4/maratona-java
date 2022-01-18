package academy.devdojo.maratonajava.javacore.Fmodificadorestaticos.domain.Teste;

import academy.devdojo.maratonajava.javacore.Fmodificadorestaticos.domain.Domain.Carro;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro.setVelocidadeLimite(18);
        Carro c1 = new Carro("Mercedes", 150);
        Carro c2 = new Carro("Ferrari", 190);
        Carro c3 = new Carro("Gol", 160);

                    
        c1.imprime();
        c3.imprime();
        c2.imprime();

    }
}

