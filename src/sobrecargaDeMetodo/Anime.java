package sobrecargaDeMetodo;

public class Anime {
    private String tipo;
    private  int epsodios;
    private  String nomes;
    private  String  autor;
public Anime (String tipo, int epsodios, String nomes, String autor){
    this.tipo = tipo;
    this.epsodios = epsodios;
    this.nomes = nomes;
    this.autor = autor;
}
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

//    public  void init (String tipo, int epsodios, String nomes){
//        this.tipo = tipo;
//        this.epsodios = epsodios;
//        this.nomes = nomes;
//    }
//    public  void init (String tipo, int epsodios, String nomes, String autor){
//        this.init(tipo,epsodios,nomes);
//        this.autor = autor;
//    }
    public  void imprimeDados(){
        System.out.println(this.tipo);
        System.out.println(this.epsodios);
        System.out.println(this.nomes);
        System.out.println(this.autor);

    }

    public String getNomes() {
        return nomes;
    }

    public void setNomes(String nomes) {
        this.nomes = nomes;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getEpsodios() {
        return epsodios;
    }

    public void setEpsodios(int epsodios) {
        this.epsodios = epsodios;
    }
}
