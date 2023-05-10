package sobrecargaDeMetodo.teste;

import sobrecargaDeMetodo.Anime;

import java.util.Scanner;

public class Teste01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String tipo = scanner.next();
        int epsodios =  scanner.nextInt();
        String nomes = scanner.next();
        String autor = scanner.next();

        Anime anime = new Anime(tipo,epsodios,nomes,autor);

        anime.imprimeDados();



    }

}
