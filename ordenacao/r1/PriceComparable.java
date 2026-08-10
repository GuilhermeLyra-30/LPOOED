package r1;

import java.util.ArrayList;
import java.util.Collections;

public class PriceComparable {
    public static void main(String[] args) {
        ArrayList<Product> listP = new ArrayList<>();
        listP.add(new Product("Celular X", 1850.00));
        listP.add(new Product("Celular y", 2500.00));
        listP.add(new Product("Celular z", 1000.00));
        listP.add(new Product("Capa b", 25.00));
        listP.add(new Product("Fone de Ouvido", 180.00));

        Collections.sort(listP);

        for(Product p: listP){
            System.out.println("Product: " + p.getName() + ", Price: " + p.getPrice());
        }

    }

}
