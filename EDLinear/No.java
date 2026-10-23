public class No {
    private int valor;
    private No proxNo;

    public No(int valor) {
        this(valor, null);
    }

    public No(int valor, No proxNo) {
        this.valor = valor;
        this.proxNo = proxNo;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public No getProxNo() {
        return proxNo;
    }

    public void setProxNo(No proxNo) {
        this.proxNo = proxNo;
    }
}