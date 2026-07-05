package classeAbs02;

public class Homem extends PessoaIMC{
    
    Homem(String nome, String dtNascimento, double peso, double altura){
        super(nome, dtNascimento, peso, altura);
    } 

    @Override
    public String resultIMC(){
        double imc = calcularIMC(peso, altura);

        if(imc < 20.7){
            return "Abaixo do peso ideal! IMC adequado 20.7. \n IMC registrado " + imc;
        }
        else if(imc <= 26.4){
            return "Peso ideal! \nIMC registrado: " + imc;
        }
        else{
            return "Acima do peso ideal! \nIMC registrado: " + String.format("%.2f",imc); 
        }
        
    }

}
