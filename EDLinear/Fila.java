public class Fila{
    private No inicio;
    private No atual;

    // Verificar se está vazio, adicionar, remover e mostrar
    // Contar o total, e verificar quantos faltam para determinado valor
    
    public Fila() {
        this.inicio = null;
        this.atual = null;
    }

    public boolean vazio(){
        return this.inicio == null;
    }

    public void add(int valor){
        No novoNo = new No(valor);
        
        if(vazio()){
            inicio = novoNo;
        }
        else{
            atual = inicio;
            while(atual.getProxNo() != null){
                atual = atual.getProxNo();
            }

            atual.setProxNo(novoNo);
        }
        
    }

    public void mostrar(){
        atual = inicio;
        
        while(atual != null){
            System.out.print(atual.getValor() + " -> ");
            atual = atual.getProxNo();
        }
        System.out.println("null");
    }

    public void remover(){
        if(vazio()){
            System.err.println("Lista vazia.");
        }
        else{
            inicio = inicio.getProxNo();
        }
    }

    public int quant(){
        int quant = 0;
        No inicio = this.inicio;

        while(inicio != null){
            quant++;
            inicio = inicio.getProxNo();
        }

        return quant;
    }

    public int quantosFaltam(No x){
        int qf = 0;

        No t = this.inicio;

        while(t.getValor() != x.getValor() && t != null){
            qf++;
            t = t.getProxNo();
        }
        
        return qf;
    }
}