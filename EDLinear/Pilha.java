public class Pilha {
    private No topo;
    private No atual;

    public Pilha() {
        this.topo = null;
        this.atual = null;
    }

    public boolean vazio() {
        return this.topo == null;
    }

    public void adc(int val) {
        No novoTopo = new No(val);

        if(vazio()){
            topo = novoTopo;
        }
        else{
            novoTopo.setProxNo(topo);
            topo = novoTopo;
        }
    }

    public void mostrar() {
        atual = topo;

        while(atual != null){
            System.out.print(atual.getValor() + " -> ");
            atual = atual.getProxNo();
        }
        System.out.println("null");
    }

    public void remover() {
        if(vazio()){
            System.out.println("Pìlha vazia.");
        }
        else{
            topo = topo.getProxNo();
        }
    }

    public int quantidade() {
        int quant = 0;
        No topo = this.topo;

        while(topo != null){
            quant++;
            topo = topo.getProxNo();
        }

        return quant;
    }

    public int quantFaltam(No x) {
        int q = 0;

        No topo = this.topo;

        while(topo.getValor() != x.getValor() && topo != null) {
            q++;
            topo = topo.getProxNo();
        }
        return q;
    }
}
