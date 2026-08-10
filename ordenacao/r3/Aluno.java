package r3;

public class Aluno implements Comparable<Aluno> {

    private String nome;
    private double nota;

    public Aluno(String nome, double nota){
        super();
        this.nome = nome;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public double getNota() {
        return nota;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }


    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public int compareTo(Aluno a){
        if(this.nota < a.nota){
            return -1;
        }
        if(this.nota > a.nota){
            return 1;
        }
        return this.nome.compareToIgnoreCase(a.nome);
    }
}


