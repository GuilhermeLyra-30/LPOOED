package classeAbs02;

public class Mulher extends PessoaIMC{
    
    Mulher(String nome, String dtNascimento, double peso, double altura){
        super(nome, dtNascimento, peso, altura);
    }

    @Override
    public String resultIMC(){
        double imc = calcularIMC(peso, altura);

        if(imc < 19){
            return "Abaixo do peso ideal! IMC adequado 20.7. \nIMC registrado: " + imc;
        }
        else if(imc <= 25.8){
            return "Peso ideal! \nIMC registrado: " + imc;
        }
        else{
            return "Acima do peso ideal! \nIMC registrado: " + String.format("%.2f",imc); 
        }
        
    }
    
}
