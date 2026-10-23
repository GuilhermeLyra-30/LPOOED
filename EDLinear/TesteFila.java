public class TesteFila {
    public static void main(String[] args) {
        Fila f = new Fila();
        
        f.add(1);
        f.mostrar();
        f.add(2);
        f.mostrar();
        f.add(3);
        f.mostrar();
        
        System.out.println("\nQuantidade de valores cadastrado: " + f.quant()+"\n");

        f.mostrar();

        No x = new No(3);
        int faltam = f.quantosFaltam(x);
        System.out.println("Faltam " + faltam +" para " + x.getValor());
        
        f.remover();
        f.mostrar();

        faltam = f.quantosFaltam(x);
        System.out.println("Faltam " + faltam + " para " + x.getValor() + "\n");
        
        f.remover();
        f.mostrar();
        
        faltam = f.quantosFaltam(x);
        System.out.println("Faltam " + faltam + " para " + x.getValor());
        
        f.remover();
        f.mostrar();

    }
}
