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
        if(NotasAluno.isEmpty()){
            System.out.println("Não há nenhuma nota para ser removida.");   
            return;
        }
        NotasAluno.remove(NotasAluno.size() - 1);
        System.out.println("Nota removida com sucesso!");
    }
    
    @Override
    public double calcMedia(){
        if(NotasAluno.isEmpty()){
            System.out.println("Não há nenhuma nota cadrastada.");
            return 0;   
        }
        double vSoma = 0;
        for(int i = 0; i < NotasAluno.size(); i++){
            vSoma = vSoma + NotasAluno.get(i);
        }
        return vSoma / NotasAluno.size();
    }
    
    @Override
    public double getMaiorNota(){
        if(NotasAluno.isEmpty()){
            System.out.println("Não há nenhuma nota cadrastada.");
            return 0;   
        }
        double maiorNota = NotasAluno.get(0);
        for (double nota : NotasAluno) {
            if(maiorNota < nota){
                maiorNota = nota;
            }
        }
        
        return maiorNota;
    }
}
