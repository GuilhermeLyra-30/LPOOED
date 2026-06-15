package tryCatch;
import java.util.Scanner;

public class ConversorTipo {
    public static void main(String[] args) throws Exception{
        Scanner input = new Scanner(System.in);
        int checar = 0;
        
        while (checar == 0) {
            try{
                System.out.println("Digite um texto: ");
                String n = input.nextLine();
                Integer.parseInt(n);
                System.out.println("" + n);
                checar++;
            }catch(NumberFormatException xe){
                System.out.println("Erro ao digitar letra.");  
            }finally{
                System.out.println("FIM");
            }
            
        }
        
        input.close();
    }      
}
