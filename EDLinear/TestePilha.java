public class TestePilha {
    public static void main(String[] args) {
        Pilha p = new Pilha();

        p.adc(1);
        p.mostrar();
        p.adc(2);
        p.mostrar();
        p.adc(3);
        p.mostrar();

        System.out.println("\nQuantidade de valores cadastrado: " + p.quantidade()+"\n");
        
        p.mostrar();
        
        No x = new No(1);
        int faltam = p.quantFaltam(x);
        System.out.println("Faltam " + faltam + " para " + x.getValor());
        
        p.remover();
        p.mostrar();

        faltam = p.quantFaltam(x);
        System.out.println("Faltam " + faltam + " para " + x.getValor());

        p.remover();
        p.mostrar();

        faltam = p.quantFaltam(x);
        System.out.println("Faltam " + faltam + " para " + x.getValor());

        p.remover();
        p.mostrar();
    }
}
