package devedojo.Dominio.Teste;

import java.util.Scanner;

public class ProfessorTeste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Professor professor = new Professor();

        System.out.println("Digite o nome do professor:");
        professor.nome = scanner.next();
        System.out.println("Digite a idade do Professor:");
        professor.Idade = scanner.nextInt();
        System.out.println("Digite o sexo do professor:");
        professor.sexo = scanner.next().charAt(0);

        System.out.println("Nome;"+professor.nome + " Idade: "+ professor.Idade + " Sexo: " + professor.sexo );

    }
}
