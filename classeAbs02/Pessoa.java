package classeAbs02;

public class Pessoa {
    private String nome;
    private String dtNascimento;

    Pessoa(String nome, String dtNascimento){
        this.nome = nome;
        this.dtNascimento = dtNascimento;
    }

    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getDtNascimento(){
        return dtNascimento;
    }

    @Override
    public String toString(){
        return "Nome: " + nome + "\nData de Nascimento: " + dtNascimento;
    };
}
