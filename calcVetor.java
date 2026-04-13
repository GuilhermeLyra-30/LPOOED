package poo;
import java.util.Scanner;
public class calcVetor {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double listNum[] = new double[10];
        double media = 0;
        double soma = 0;
        
        for(int i = 0; i < 10; i++){
            System.out.println("Digite um número: ");
            int inputNum = input.nextInt();

            listNum[i] = inputNum;

        }
        
        double menorValor = listNum[0];
        double maiorValor = listNum[0];
        
        for(int i = 0; i < listNum.length; i++){
            if(menorValor > listNum[i]){
                menorValor = listNum[i];
            }
            
            if(maiorValor < listNum[i]){
                maiorValor = listNum[i];
            }

            soma = soma + listNum[i];

        }

        media = soma / listNum.length;
        System.out.println("O menor valor é: " + menorValor + "\nO maior valor é: " + maiorValor + "\nA média dos valores é: " + media);
        
        input.close();
    }
}
