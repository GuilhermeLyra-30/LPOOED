package r9;

import java.util.*; 

public class Teste {
    public static void main(String[] args) {
        ArrayList<Livro> livros = new ArrayList<>();
        try (Scanner scanner = new Scanner(System.in)) {
            for(int i = 0; i < 5; i++) {
                System.out.print("Digite o nome do livro " + (i + 1) + ": ");
                String nome = scanner.nextLine();
                System.out.print("Digite o preço do livro " + (i + 1) + ": ");
                double preco = scanner.nextDouble();
                System.out.print("Digite o ano do livro " + (i + 1) + ": ");
                int ano = scanner.nextInt();
                scanner.nextLine(); 
                System.out.print("Digite o autor do livro " + (i + 1) + ": ");
                String autor = scanner.nextLine();
                livros.add(new Livro(nome, autor, ano, preco));
            }
        }
        Collections.sort(livros, OrdenarLivro.ordenarPreco);
        System.out.println("\nLivros ordenados por preço:");
        for(int i = 0; i < livros.size(); i++) {
            System.out.println("Livro " + (i + 1) + ": " + livros.get(i).getTitulo() + " - R$" + livros.get(i).getPreco() + " - Ano: " + livros.get(i).getAno() + " - Autor: " + livros.get(i).getAutor());
        }
        Collections.sort(livros, OrdenarLivro.ordenarAno);
        System.out.println("\nLivros ordenados por ano:"); 
        for(int i = 0; i < livros.size(); i++) {
            System.out.println("Livro " + (i + 1) + ": " + livros.get(i).getTitulo() + " - R$" + livros.get(i).getPreco() + " - Ano: " + livros.get(i).getAno() + " - Autor: " + livros.get(i).getAutor());
        }
        Collections.sort(livros, OrdenarLivro.ordenarAutor);
        System.out.println("\nLivros ordenados por autor:");   
        for(int i = 0; i < livros.size(); i++) {
            System.out.println("Livro " + (i + 1) + ": " + livros.get(i).getTitulo() + " - R$" + livros.get(i).getPreco() + " - Ano: " + livros.get(i).getAno() + " - Autor: " + livros.get(i).getAutor());
        }
        
    }
}
