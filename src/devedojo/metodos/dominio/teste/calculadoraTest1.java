package devedojo.metodos.dominio.teste;

import devedojo.metodos.dominio.Calculadora;

import java.util.Scanner;

public class calculadoraTest1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumero();
        calculadora.subtraiDoisNumero();
        int numeroUm = scanner.nextInt();
        int numeroDois = scanner.nextInt();
        calculadora.multiplicaDoisNumero(numeroUm , numeroDois);
        double doubleNumeroUm = scanner.nextDouble();
        double doubleNumeroDois = scanner.nextDouble();
        double resultado = calculadora.divideDoisNumero(doubleNumeroUm , doubleNumeroDois);
        System.out.println(resultado);

        calculadora.divideDoisNumero02(numeroUm,numeroDois);
    }

}
