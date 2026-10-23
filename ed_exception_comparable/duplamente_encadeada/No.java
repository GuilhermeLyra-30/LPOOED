package duplamente_encadeada;

public class No {
    private Pagina valor;
    private No proxNo;
    private No antNo; // Adicionado para lista duplamente encadeada

    public No(Pagina valor) {
        this(valor, null, null);
    }

    public No(Pagina valor, No proxNo, No antNo) {
        this.valor = valor;
        this.proxNo = proxNo;
        this.antNo = antNo;
    }

    public Pagina getValor() {
        return valor;
    }

    public void setValor(Pagina valor) {
        this.valor = valor;
    }

    public No getProxNo() {
        return proxNo;
    }

    public void setProxNo(No proxNo) {
        this.proxNo = proxNo;
    }

    public No getAntNo() {
        return antNo;
    }

    public void setAntNo(No antNo) {
        this.antNo = antNo;
    }
}