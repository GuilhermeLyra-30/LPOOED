package interface2;

import java.util.ArrayList;

public class AlunosArrayList implements Aluno {
    ArrayList <Double> NotasAluno = new ArrayList<>();

    @Override
    public void addNovaNota(double nota) throws NotaInvalidaException{
        if(nota < 0 || nota > 10){
            throw new NotaInvalidaException("Notá inválida! Tente novamente");
        }else{
            NotasAluno.add(nota);  
        }
    }
    
    @Override
    public void removerUltimaNota() throws NotaInvalidaException{
        if (NotasAluno.isEmpty()) {
            throw new NotaInvalidaException("Ainda não há notas cadastradas");
        }else{
            NotasAluno.remove(NotasAluno.size() - 1);
            System.out.println("Nota removida com sucesso!");
        }
    }
        
    
    @Override
    public double calcMedia() throws NotaInvalidaException{
        if(NotasAluno.isEmpty()){
            throw new NotaInvalidaException("Ainda não há notas cadastradas");
        }else{
            double vSoma = 0;
            for(int i = 0; i < NotasAluno.size(); i++){
                vSoma = vSoma + NotasAluno.get(i);
            }
            return vSoma / NotasAluno.size();
        }
    }
    
    @Override
    public double getMaiorNota() throws NotaInvalidaException{
        if(NotasAluno.isEmpty()){
            throw new NotaInvalidaException("Ainda não há notas cadastradas");
        }else{
            double maiorNota = NotasAluno.get(0);
            for (double nota : NotasAluno) {
                if(maiorNota < nota){
                    maiorNota = nota;
                }
            }
        
            return maiorNota;
        }
    }
}
