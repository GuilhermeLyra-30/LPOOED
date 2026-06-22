package interface2;

public class NotaInvalidaException extends Exception {
    public NotaInvalidaException(String mensagem){
        super(mensagem);
    }
}