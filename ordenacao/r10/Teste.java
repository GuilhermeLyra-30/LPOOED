import java.util.ArrayList;
import java.util.Collections;
public class Teste {
    public static void main(String[] args){

        ArrayList<Jogador> jogadores = new ArrayList<Jogador>();

        jogadores.add(new Jogador("Guilherme", 7.00, 1));
        jogadores.add(new Jogador("Cláudio", 7.00, 2));
        jogadores.add(new Jogador("Jonathan", 2.50, 1));
        jogadores.add(new Jogador("Júnior", 9.5, 3));

        Collections.sort(jogadores, Collections.reverseOrder());
        for(Jogador j : jogadores){
            System.out.println(j.getNivel() + " - " + j.getNome());
        }

        Collections.sort(jogadores, Collections.reverseOrder());
        jogadores.sort((j1, j2) -> {
            if (j1.getPotuacao() < j2.getPotuacao()) {
                return -1;
            }
            if (j1.getPotuacao() > j2.getPotuacao()) {
                return 1;
            }
            return j1.getNome().compareToIgnoreCase(j2.getNome());
        });
        for(Jogador j : jogadores){
            System.out.println(j.getPotuacao() + " - " + j.getNome());
        }

        jogadores.sort((j1, j2) -> j1.getNome().compareToIgnoreCase(j2.getNome()));
        for(Jogador j : jogadores){
            System.out.println(j.getNome() );
        }
    }
}



