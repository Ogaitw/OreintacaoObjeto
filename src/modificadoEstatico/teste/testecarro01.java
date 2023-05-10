package modificadoEstatico.teste;

import modificadoEstatico.dominio.Carro;

import java.util.Scanner;

public class testecarro01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome = scanner.next();
        double velocidadeMaxima = scanner.nextDouble();
        double velocidadeLimite = scanner.nextDouble();
        Carro carro = new Carro(nome, velocidadeMaxima, velocidadeLimite);
        carro.imprimeDados();

    }

}
