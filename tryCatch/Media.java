package tryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Media{
    public static void main(String[] args) throws Exception{

        Scanner input = new Scanner(System.in);
        int checagem = 0;
        do{
            try{
                System.out.println("Digite um número: ");
                double x = input.nextDouble();
                System.out.println("Digte outro número: ");
                double y = input.nextDouble();
                
                double m = (x + y) / 2;
                System.out.println("Média " + m);
                checagem++;
            }catch (InputMismatchException xe){
                System.out.println("Erro ao digitar letra.");
                input.nextLine();
            }finally{
                System.out.println("Sempre faz");
                
            }
        }while(checagem == 0);
        input.close();
    }
}
