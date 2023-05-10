package devedojo.metodos.dominio;

import java.util.Scanner;

public class Calculadora {
    public  void somaDoisNumero() {
        Scanner scanner = new Scanner(System.in);
        int numeroUm = scanner.nextInt();
        int numeroDois = scanner.nextInt();
        System.out.println(numeroUm+numeroDois);

    }
    public  void subtraiDoisNumero() {
        Scanner scanner = new Scanner(System.in);
        int numeroUm = scanner.nextInt();
        int numeroDois = scanner.nextInt();
        System.out.println(numeroUm-numeroDois);

    }
    public  void multiplicaDoisNumero( int numeroUm , int numeroDois) {

        System.out.println(numeroUm*numeroDois);

    }
    public  double divideDoisNumero ( double doublenumeroUm, double doubleNumeroDois){
        if (doublenumeroUm == 0 || doubleNumeroDois == 0){

            System.out.println("Entrou no Metodo");
            return  0;

        }
        return doublenumeroUm/doubleNumeroDois;


    }
    public  void divideDoisNumero02 ( double doublenumeroUm, double doubleNumeroDois) {
        if (doublenumeroUm == 0 || doubleNumeroDois == 0) {

            System.out.println("Entrou no Metodo");
            return;

        }
        System.out.println(doublenumeroUm/doubleNumeroDois);
    }
    public void  somaArray (int... numeros) {

    }
}
