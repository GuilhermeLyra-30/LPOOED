package r8;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;

public class Teste {
    public static void main(String[] args) {
        Pedido pedido1 = new Pedido("001", LocalDate.of(2023, 5, 10), 150.0);
        Pedido pedido2 = new Pedido("002", LocalDate.of(2023, 5, 12), 200.0);
        Pedido pedido3 = new Pedido("003", LocalDate.of(2023, 5, 11), 100.0);

        ArrayList<Pedido> pedidos = new ArrayList<>();
        pedidos.add(pedido1);
        pedidos.add(pedido2);
        pedidos.add(pedido3);

        pedidos.sort(Comparator.comparing(Pedido::getData, Comparator.reverseOrder()));
        System.out.println("Pedidos ordenados por data:");
        for (Pedido pedido : pedidos) {
            System.out.println(pedido.getId() + " - " + pedido.getData() + " - " + pedido.getValor());
        }

        // Ordenar por valor
        pedidos.sort(Comparator.comparingDouble(Pedido::getValor));
        System.out.println("\nPedidos ordenados por valor:");
        for (Pedido pedido : pedidos) {
            System.out.println(pedido.getId() + " - " + pedido.getData() + " - " + pedido.getValor());
        }
    }
}
