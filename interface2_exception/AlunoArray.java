package interface2_exception;

public class AlunoArray implements Aluno{
    double notasAluno[] = new double[0];
    int quantidade = 0;
    
    @Override
    public void addNovaNota(double nota) throws NotaInvalidaException{
        if(nota < 0 || nota > 10){
            throw new NotaInvalidaException("Notá inválida! Tente novamente");
        }else{
            if(quantidade == notasAluno.length){
                double arrayMaior[] = new double[notasAluno.length + 1];
                for(int i = 0; i < notasAluno.length; i++){
                    arrayMaior[i] = notasAluno[i];
                }
                notasAluno = arrayMaior;
            }
            notasAluno[quantidade] = nota;
            quantidade++;  
        }
        
    }

    @Override
    public void removerUltimaNota() throws NotaInvalidaException{
        if(quantidade == 0){
            throw new NotaInvalidaException("Não há notas cadastradas.");
        }
        else{
            if(quantidade > 0){
                quantidade--;
                double arrayMenor[] = new double[notasAluno.length - 1];
                for(int i = 0; i < quantidade; i++){
                    arrayMenor[i] = notasAluno[i];
                }
                notasAluno = arrayMenor;
                System.out.println("Nota removida com sucesso!");
            }
            else{
                System.out.println("Você não cadastrou nenhuma nota ainda.");
            }
        }
    }

    @Override
    public double calcMedia() throws NotaInvalidaException{
        if(quantidade == 0){
            throw new NotaInvalidaException("Não há notas cadastradas.");
        }
        else{
            double somaN = 0;
            for(int i = 0; i < notasAluno.length; i++){
                somaN = somaN + notasAluno[i];
            }
            return somaN / quantidade;
        }
    }

    @Override
    public double getMaiorNota() throws NotaInvalidaException{
        if(quantidade == 0){
            throw new NotaInvalidaException("Não há notas cadastradas ainda.");
        }
        else{
            double maiorNota = 0;
            for(int i = 0; i < notasAluno.length; i++){
                if(notasAluno[i] > maiorNota){
                    maiorNota = notasAluno[i];
                }
            }
            return maiorNota;
        }
        
    }
        
}
