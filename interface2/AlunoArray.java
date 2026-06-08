package interface2;

public class AlunoArray implements Aluno{
    double notasAluno[] = new double[0];
    int quantidade = 0;
    
    @Override
    public void addNovaNota(double nota){
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

    @Override
    public void removerUltimaNota(){
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

    @Override
    public double calcMedia(){
        if(quantidade == 0){
            System.out.println("Você não cadastrou nenhuma nota ainda.");
            return 0;
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
    public double getMaiorNota(){
        if(quantidade == 0){
            System.out.println("Você não cadastrou nenhuma nota ainda.");
            return 0;
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
