package interface2;

import java.util.ArrayList;

public class AlunosArrayList implements Aluno {
    ArrayList <Double> NotasAluno = new ArrayList<>();

    @Override
    public void addNovaNota(double nota){
        NotasAluno.add(nota);
    }
    @Override
    public void removerUltimaNota(){
        NotasAluno.remove(NotasAluno.size() - 1);
    }
    @Override
    public double calcMedia(){
        double vSoma = 0;
        double media = 0;
        for(int i = 0; i < NotasAluno.size(); i++){
            vSoma = vSoma + NotasAluno.get(i);
        }
        media = vSoma / NotasAluno.size();
        return media;
    }
    @Override
    public double getMaiorNota(){
        double maiorNota = 0;
        for(int i = 0; i < NotasAluno.size(); i++){
            if(maiorNota < NotasAluno.get(i)){
                maiorNota = NotasAluno.get(i); 
            }
        }
    }
}
