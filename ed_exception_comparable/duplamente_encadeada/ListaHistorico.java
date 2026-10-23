package duplamente_encadeada;

public class ListaHistorico {
    private No inicio;
    private No atual; // Funciona como o "fim" da lista (página atual)

    public ListaHistorico() {
        this.inicio = null;
        this.atual = null;
    }

    public boolean vazio() {
        return this.inicio == null;
    }

    // Opção 1: Navegar para outra página (Adiciona no fim)
    public void adicionar(Pagina novaPagina) {
        No novoNo = new No(novaPagina);

        if (vazio()) {
            inicio = novoNo;
            atual = novoNo;
        } else {
            novoNo.setAntNo(atual);
            atual.setProxNo(novoNo);
            atual = novoNo; // O novo nó se torna a página atual
        }
    }

    // Opção 2: Consultar página atual
    public void consultarAtual() {
        if (vazio()) {
            System.out.println("Página em branco!");
        } else {
            System.out.println("Página atual: " + atual.getValor().getUrl());
        }
    }

    // Opção 3: Voltar para página anterior (Apaga a última)
    public void voltar() {
        if (vazio()) {
            System.out.println("Página em branco! Não há para onde voltar.");
        } else if (atual.getAntNo() == null) {
            // Só tem 1 página na lista
            System.out.println("Fechando a única página. Lista agora está em branco!");
            inicio = null;
            atual = null;
        } else {
            No paginaASerApagada = atual;
            No paginaAnterior = atual.getAntNo();
            
            System.out.println("Voltando da página " + paginaASerApagada.getValor().getNome() + 
                               " para a página " + paginaAnterior.getValor().getNome());
            
            // Removendo a última página (atual)
            paginaAnterior.setProxNo(null);
            atual = paginaAnterior;
        }
    }

    // Opção 4: Mostrar o histórico
    public void mostrarHistorico() {
        if (vazio() || inicio.getProxNo() == null) {
            System.out.println("Histórico insuficiente para mostrar navegação.");
            return;
        }

        No temp = inicio;
        System.out.println("--- Histórico de Navegação ---");
        while (temp.getProxNo() != null) {
            System.out.println("Avançando da página " + temp.getValor().getNome() + 
                               " para a página " + temp.getProxNo().getValor().getNome());
            temp = temp.getProxNo();
        }
    }

    // BÔNUS (Questão 2): Métodos de ordenação exigidos pela prova
    // Utilizando Bubble Sort simples para ordenar a lista customizada
    public void ordenarPorNome() {
        if (vazio() || inicio.getProxNo() == null) return;
        boolean trocou;
        do {
            trocou = false;
            No temp = inicio;
            while (temp.getProxNo() != null) {
                // Usa o compareTo criado na classe Pagina
                if (temp.getValor().compareTo(temp.getProxNo().getValor()) > 0) {
                    Pagina pTemp = temp.getValor();
                    temp.setValor(temp.getProxNo().getValor());
                    temp.getProxNo().setValor(pTemp);
                    trocou = true;
                }
                temp = temp.getProxNo();
            }
        } while (trocou);
        System.out.println("Histórico ordenado por NOME.");
    }

    public void ordenarPorUrl() {
        if (vazio() || inicio.getProxNo() == null) return;
        boolean trocou;
        Pagina.ComparadorPorUrl comparador = new Pagina.ComparadorPorUrl();
        do {
            trocou = false;
            No temp = inicio;
            while (temp.getProxNo() != null) {
                // Usa o Comparator criado na classe Pagina
                if (comparador.compare(temp.getValor(), temp.getProxNo().getValor()) > 0) {
                    Pagina pTemp = temp.getValor();
                    temp.setValor(temp.getProxNo().getValor());
                    temp.getProxNo().setValor(pTemp);
                    trocou = true;
                }
                temp = temp.getProxNo();
            }
        } while (trocou);
        System.out.println("Histórico ordenado por URL.");
    }
}
