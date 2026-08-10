package r4;

import java.util.Comparator;
public class ComparatorProduto {
    public static final Comparator<Produto> compararPorPreco = Comparator.comparingDouble(Produto::getPreco);
    public static final Comparator<Produto> compararPorNome  = Comparator.comparing(Produto::getNome);

}
