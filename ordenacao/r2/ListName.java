package r2;

import java.util.ArrayList;
import java.util.Collections;

public class ListName {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Joelinton");
        names.add("Carlos");
        names.add("Bruno");
        names.add("Vinícius");
        names.add("Eduardo");

        Collections.sort(names);
        System.out.println("Ordem alfabética:");
        for (String name : names) {
            System.out.println(name);
        }

        Collections.sort(names, Collections.reverseOrder());
        System.out.println("\nOrdem inversa:");
        for (String name : names) {
            System.out.println(name);
        }
        
    }
}
