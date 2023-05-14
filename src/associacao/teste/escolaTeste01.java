package associacao.teste;

import associacao.dominio.Escola;
import associacao.dominio.Professor;

public class escolaTeste01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Jirayza");
        Professor professor2 = new Professor("Kakashhi");
        Professor[] professores = {professor1, professor2};
        Escola escola = new Escola("Konoha", professores);

        escola.imprime();


    }
}
