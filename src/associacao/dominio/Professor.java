package associacao.dominio;

public class Professor {
    private String Nome;

    public Professor(String nome) {
        Nome = nome;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }
}
