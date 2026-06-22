package interface2;

public interface Aluno {
    double calcMedia() throws NotaInvalidaException;
    void addNovaNota(double nota) throws NotaInvalidaException;  
    void removerUltimaNota() throws NotaInvalidaException;
    double getMaiorNota() throws NotaInvalidaException;
}
