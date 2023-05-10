package devedojo.Dominio.Teste;

import java.util.Scanner;

public class EstudanteTeste01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Estudante estudante = new Estudante();
        System.out.println( "Digite a Idade;");
        estudante.Idade = scanner.nextInt();
        System.out.println("Digite um nome;");
        estudante.nome = scanner.next();
        System.out.println("Digite o sexo;");
        estudante.sexo = scanner.next().charAt(0);



        estudante.imprime();
    }
}
