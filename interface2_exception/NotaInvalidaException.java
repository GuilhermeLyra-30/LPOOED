package interface2_exception;

public class NotaInvalidaException extends Exception {
    public NotaInvalidaException(String mensagem){
        super(mensagem);
    }
}