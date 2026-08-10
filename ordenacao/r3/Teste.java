package r3;

import java.util.ArrayList;
import java.util.Collections;

public class Teste {
    public static void main(String[] args){

        ArrayList<Aluno> alunos = new ArrayList<Aluno>();

        alunos.add(new Aluno("Guilherme", 7.00));
        alunos.add(new Aluno("Jonathan", 7.00));
        alunos.add(new Aluno("Cláudio", 2.50));
        alunos.add(new Aluno("Júnior", 9.5));
            

        Collections.sort(alunos);          
        for(Aluno a : alunos){
        System.out.println(a.getNota() + " - " + a.getNome());
        }
    }
}


