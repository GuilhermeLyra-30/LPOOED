package classeAbs02;

public abstract class PessoaIMC extends Pessoa{
    protected double peso;
    protected double altura;
    protected abstract String resultIMC();

    PessoaIMC(String nome, String dtNascimento, double peso, double altura){
        super(nome, dtNascimento);
        this.peso = peso;
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso){
        this.peso = peso;
    }

    public double getAltura(){
        return altura;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    public double calcularIMC(double peso, double altura){
        return peso / (altura * altura);
    }

    @Override 
    public String toString(){
        return super.toString() + "\nPeso: " + getPeso() + "\nAltura: " + getAltura();
    }

}
