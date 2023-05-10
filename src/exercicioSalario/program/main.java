package exercicioSalario.program;

import exercicioSalario.Funcionario;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Funcionario funcionario = new Funcionario();

        System.out.println("Digite o Nome do funcionario: ");
        String nome = scanner.next();
        funcionario.setNome(nome);
        double salario[] = new  double[3];
        System.out.println("Digite a idade do funcionario: ");
        int idade = scanner.nextInt();
        funcionario.setIdade(idade);
        System.out.println(" Digite os salários do funcionarios: ");

        for (int i = 0; i < salario.length; i++) {
            salario[i] = scanner.nextDouble();
        }
        funcionario.setSalario(salario);

        System.out.println(funcionario.retornaMediaSalario());

        System.out.println(funcionario.toString());

    }
}
