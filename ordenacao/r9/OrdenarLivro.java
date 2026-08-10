package r9;
import java.util.*;
public class OrdenarLivro {
    public static final Comparator<Livro> ordenarPreco = Comparator.comparingDouble(Livro::getPreco);
    public static final Comparator<Livro> ordenarAno = Comparator.comparing(Livro::getAno);
    public static final Comparator<Livro> ordenarAutor = Comparator.comparing(Livro::getAutor);
    
}
