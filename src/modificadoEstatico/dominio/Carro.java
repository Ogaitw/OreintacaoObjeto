package modificadoEstatico.dominio;

public class Carro  {
    private  String nome;
    private  double VelocidadeMaxima;
    private  double velcidadeLimite;

    public Carro(String nome, double velocidadeMaxima, double velcidadeLimite) {
        this.nome = nome;
        this.VelocidadeMaxima = velocidadeMaxima;
        this.velcidadeLimite = velcidadeLimite;
    }

    public  void imprimeDados (){
        System.out.println("Nome: "+this.nome);
        System.out.println("Velocidade: " + this.VelocidadeMaxima);
        System.out.println("Velocidade Limite: " + this.velcidadeLimite);
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidade() {
        return VelocidadeMaxima;
    }

    public void setVelocidade(double velicudadeMaxima) {
        this.VelocidadeMaxima = velicudadeMaxima;
    }

    public double getVelcidadeLimite() {
        return velcidadeLimite;
    }

    public void setVelcidadeLimite(double velcidadeLimite) {
        this.velcidadeLimite = velcidadeLimite;
    }
}
