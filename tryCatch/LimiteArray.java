package tryCatch;

import java.util.Scanner;

public class LimiteArray {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int[] listArray = {1, 2, 3, 4};
        int checar = 0;

        while(checar == 0){
            try{
                System.out.println("Digite a posição do array que você deseja acessar");
                int posicao = input.nextInt();
                System.out.println(" " + listArray[posicao]);
                checar++;
            }catch(ArrayIndexOutOfBoundsException ex){
                System.out.println("O array não tem todos esses índices, tente novamente. Ele tem " + listArray.length + " posições, começando em posição 0 e indo até 3");
            }finally{
                System.out.println("FIM");
            }
        }

        input.close();
    }
}
