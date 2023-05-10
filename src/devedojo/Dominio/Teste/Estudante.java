package devedojo.Dominio.Teste;

public class Estudante {
    public String nome;
    public int Idade;
    public char sexo;

    public  void imprime ()  {
        System.out.println(this.nome);
        System.out.println(this.Idade);
        System.out.println(this.sexo);
// Usa o This quando você quer referencia uma variavel que ja foi ultizada dentro do prorio metodo.
    }
}
