package exercicioSalario;

import java.util.Arrays;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salario = new double[3];

    private  int cpf;

    public double retornaMediaSalario (){
        double media =(salario[0] +salario[1] +salario[2])/salario.length;
       return media;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalario() {
        return salario;
    }

    public void setSalario(double[] salario) {
        this.salario = salario;
    }

    public int getCpf() {
        return cpf;
    }

    }


