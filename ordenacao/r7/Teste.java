import java.util.ArrayList;
import java.util.Collections;
public class Teste {
    public static void main(String[] args){

        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(new Funcionario("Guilherme", 700, 25));
        funcionarios.add(new Funcionario("Jonathan", 800, 30));
        funcionarios.add(new Funcionario("varbalho", 590, 22));
        funcionarios.add(new Funcionario("Neymar", 1000, 28));

        Collections.sort(funcionarios, Collections.reverseOrder());
        for(Funcionario f : funcionarios){
            System.out.println(f.getSalario() + " - " + f.getNome() + " - " + f.getIdade());
        }
        
      
        funcionarios.sort((f1, f2) ->{
            if(f1.getIdade() < f2.getIdade()) return -1;
            if(f1.getIdade() > f2.getIdade()) return 1;
            return f1.getNome().compareToIgnoreCase(f2.getNome());
        });
        for(Funcionario f : funcionarios){
            System.out.println(f.getIdade() + " - " + f.getNome() + " - " + f.getSalario());
        }

        System.out.println("\nOrdenado por nome:");
        funcionarios.sort((f1, f2) -> f1.getNome().compareToIgnoreCase(f2.getNome()));
        for(Funcionario f : funcionarios){
            System.out.println(f.getNome() + " - " + f.getSalario() + " - " + f.getIdade());
        }
    }
}