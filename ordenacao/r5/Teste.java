package r5;

import java.util.ArrayList;
import java.util.Collections;

public class Teste {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Joelinton");
        names.add("Carlos");
        names.add("Bruno");
        names.add("Vinícius");
        names.add("Eduardo");

        Collections.sort(names, new OrdenarPorNome());

        System.out.println("Nomes ordenados:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}