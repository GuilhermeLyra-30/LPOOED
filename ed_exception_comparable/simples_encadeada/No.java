package simples_encadeada;
public class No {
    private Pagina valor;
    private No proxNo;

    public No(Pagina valor) {
        this(valor, null);
    }

    public No(Pagina valor, No proxNo) {
        this.valor = valor;
        this.proxNo = proxNo;
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
}