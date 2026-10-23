package simples_encadeada;

public class ListaHistorico {
    private No inicio;
    private No atual;

    public ListaHistorico() {
        this.inicio = null;
        this.atual = null;
    }

    public boolean vazio() {
        return this.inicio == null;
    }

    // Opção 1: Adicionar página no final da lista
    public void add(Pagina novaPagina) {
        No novoNo = new No(novaPagina);

        if (vazio()) {
            inicio = novoNo;
        } else {
            atual = inicio;
            while (atual.getProxNo() != null) {
                atual = atual.getProxNo();
            }
            atual.setProxNo(novoNo);
        }
    }

    // Opção 2: Consultar a página atual (a última colocada na lista)
    public void consultarAtual() {
        if (vazio()) {
            System.out.println("Página em branco!");
        } else {
            atual = inicio;
            while (atual.getProxNo() != null) {
                atual = atual.getProxNo();
            }
            System.out.println("Página atual: " + atual.getValor().getUrl());
        }
    }

    // Opção 3: Voltar para a página anterior (e apagar a última)
    public void voltar() {
        if (vazio()) {
            System.out.println("Página em branco!");
            return;
        }

        // Se houver apenas 1 página na lista
        if (inicio.getProxNo() == null) {
            System.out.println("Voltando da página " + inicio.getValor().getNome() + " (lista agora ficou vazia).");
            inicio = null;
            return;
        }

        // Se houver 2 ou mais páginas, percorre até encontrar o penúltimo e o último nó
        No penultimo = inicio;
        while (penultimo.getProxNo().getProxNo() != null) {
            penultimo = penultimo.getProxNo();
        }

        No ultimo = penultimo.getProxNo();

        // Imprime a mensagem exigida no enunciado
        System.out.println("Voltando da página " + ultimo.getValor().getNome() + 
                           " para a página " + penultimo.getValor().getNome());

        // Apaga o último nó (remove a referência)
        penultimo.setProxNo(null);
    }

    // Opção 4: Mostrar o histórico das páginas acessadas
    public void mostrarHistorico() {
        if (vazio() || inicio.getProxNo() == null) {
            System.out.println("Histórico insuficiente para exibir conexões.");
            return;
        }

        atual = inicio;
        while (atual != null && atual.getProxNo() != null) {
            System.out.println("Avançando da página " + atual.getValor().getNome() + 
                               " para a página " + atual.getProxNo().getValor().getNome());
            atual = atual.getProxNo();
        }
    }

    // Metodos da Questao 2: Ordenação na lista simplesmente encadeada (Bubble Sort)
    public void ordenarPorNome() {
        if (vazio() || inicio.getProxNo() == null) return;

        boolean trocou;
        do {
            trocou = false;
            atual = inicio;
            while (atual.getProxNo() != null) {
                // Usa compareTo da classe Pagina
                if (atual.getValor().compareTo(atual.getProxNo().getValor()) > 0) {
                    Pagina temp = atual.getValor();
                    atual.setValor(atual.getProxNo().getValor());
                    atual.getProxNo().setValor(temp);
                    trocou = true;
                }
                atual = atual.getProxNo();
            }
        } while (trocou);
    }

    public void ordenarPorUrl() {
        if (vazio() || inicio.getProxNo() == null) return;

        Pagina.ComparadorPorUrl comparador = new Pagina.ComparadorPorUrl();
        boolean trocou;
        do {
            trocou = false;
            atual = inicio;
            while (atual.getProxNo() != null) {
                // Usa Comparator da classe Pagina
                if (comparador.compare(atual.getValor(), atual.getProxNo().getValor()) > 0) {
                    Pagina temp = atual.getValor();
                    atual.setValor(atual.getProxNo().getValor());
                    atual.getProxNo().setValor(temp);
                    trocou = true;
                }
                atual = atual.getProxNo();
            }
        } while (trocou);
    }
}