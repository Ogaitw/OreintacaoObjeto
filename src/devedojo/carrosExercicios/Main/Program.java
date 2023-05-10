package devedojo.carrosExercicios.Main;

import devedojo.carrosExercicios.Carros;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Carros sedans = new Carros();
        Carros esportivos = new Carros();

        System.out.println(" Carros Sedans dados\n Nome: ");
        sedans.nome = scanner.next();
        System.out.println("Digite o modelo:");
        sedans.modelo = scanner.next();
        System.out.println("Digite o Ano:");
        sedans.ano = scanner.nextInt();


        System.out.println(" Carros Esportivos dados\n Nome: ");
        scanner.nextLine();
        esportivos.nome = scanner.next();
        System.out.println("Digite o modelo:");
        scanner.nextLine();
        esportivos.modelo = scanner.nextLine();
        System.out.println("Digite o Ano:");
        esportivos.ano = scanner.nextInt();

        System.out.println("Dados carros Sedans\n Nome:"+ sedans.nome + "\n Modelo: " + sedans.modelo + "\n Ano: "+sedans.ano);
        System.out.println("Dados carros Esportivos\n Nome:"+ esportivos.nome + "\n Modelo: " + esportivos.modelo + "\n Ano: "+esportivos.ano);
    }
}
