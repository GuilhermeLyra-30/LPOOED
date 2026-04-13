package poo;

import java.util.Scanner;

public class calculoMedia {
    public static void main(String[] args) {
        
        Scanner input =  new Scanner(System.in);

        double listMedias[] = new double[10];
        int indiceAprovados = 0;
        int indiceReprovados = 0;

        for(int i = 0; i < listMedias.length; i++){
            System.out.println("Digite a média dos seus alunos: ");
            double inputMedia = input.nextDouble();

            listMedias[i] = inputMedia;

        }
        for(int i = 0; i < listMedias.length; i++){
            if(listMedias[i] >= 6){
                indiceAprovados++;
            }else{
                indiceReprovados++;
            }
        }
        System.out.println("O número de aprovados foi de " + indiceAprovados + "\nO número de reprovador foi de " + indiceReprovados);

        input.close();
    }
}
