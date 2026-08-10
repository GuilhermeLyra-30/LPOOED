package r6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Teste {
    public static void main(String[] args) {
        List<Aluno> alunos = new ArrayList<>();
        alunos.add(new Aluno("Joelinton", 18));
        alunos.add(new Aluno("Ana", 10));
        alunos.add(new Aluno("Zendaya", 25));
        alunos.add(new Aluno("Guilherme", 41));
        
        alunos.sort(Comparator.comparing((Aluno a) -> a.getNome()));
        System.out.println("Ordenado por nome:");
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }

        alunos.sort(Comparator.comparing((Aluno a) -> a.getIdade()));
        System.out.println("\nOrdenado por idade:");
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }
        
        alunos.sort(Comparator.comparing((Aluno a) -> a.getIdade()).reversed());
        System.out.println("\nOrdenado por idade (decrescente):");
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }
    }
}
