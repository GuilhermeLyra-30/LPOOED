package r4;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
public class Teste {
    public static void main(String[] args) {
        ArrayList<Produto> produtos = new ArrayList<>();
        try (Scanner scanner = new Scanner(System.in)) {
            for(int i = 0; i < 5; i++) {
                System.out.print("Digite o nome do produto " + (i + 1) + ": ");
                String nome = scanner.nextLine();
                System.out.print("Digite o preço do produto " + (i + 1) + ": ");
                double preco = scanner.nextDouble();
                scanner.nextLine(); 
                produtos.add(new Produto(nome, preco));
            }
        }
        Collections.sort(produtos, ComparatorProduto.compararPorPreco);
        System.out.println("Produtos ordenados por preço:");
        for(int i = 0; i < produtos.size(); i++) {
            System.out.println("Produto " + (i + 1) + ": " + produtos.get(i).getNome() + " - R$" + produtos.get(i).getPreco());
        }
        Collections.sort(produtos, ComparatorProduto.compararPorNome);
        System.out.println("Produtos ordenados por nome:");
        for(int i = 0; i < produtos.size(); i++) {
            System.out.println("Produto " + (i + 1) + ": " + produtos.get(i).getNome() + " - R$" + produtos.get(i).getPreco());
        }
    }
}
