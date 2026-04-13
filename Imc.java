package poo;
import java.util.Scanner;
public class Imc {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        float imc[] = new float[4];
        int abaixoPeso = 0;
        int acimaPeso = 0;
        int pesoIdeal = 0;

        for(int i = 0; i < 4; i++){
            System.out.println("Digite altura [FORMATO 1,50cm]:  ");
            float alt = input.nextFloat();
            input.nextLine();
            System.out.println("Digite o peso [FORMATO 35,8kg]: ");
            float peso = input.nextFloat();

            float calculoImc = peso / (alt * alt);

            imc[i] = calculoImc;

        }

        for(int i = 0; i < imc.length; i++){
            if(imc[i] < 18.5){
                abaixoPeso++;   
            }
            if(imc[i] > 18.5 && imc[i] < 25){
                pesoIdeal++;
            }
            if(imc[i] >= 25){
                acimaPeso++;
            }
        }

        System.out.println("Temos " + abaixoPeso + " abaixo do peso\nTemos " + acimaPeso + " acima do peso\nTemos" + pesoIdeal +" no peso ideal");
        input.close();
    }
    
}
