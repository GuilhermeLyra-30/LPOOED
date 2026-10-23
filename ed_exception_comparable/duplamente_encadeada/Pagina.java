package duplamente_encadeada;

import java.util.Comparator;

public class Pagina implements Comparable<Pagina> {
    private String nome;
    private String url;

    public Pagina(String nome, String url) {
        this.nome = nome;
        this.url = url;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    // Ordenação padrão por nome (Questão 2)
    @Override
    public int compareTo(Pagina outra) {
        return this.nome.compareTo(outra.getNome());
    }

    // Classe estática para ordenação por URL (Questão 2)
    public static class ComparadorPorUrl implements Comparator<Pagina> {
        @Override
        public int compare(Pagina p1, Pagina p2) {
            return p1.getUrl().compareTo(p2.getUrl());
        }
    }
}
