package poo;
import java.util.Scanner;
public class vetorInverso {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int listNum[] = new int[10];
        int invertList[] = new int[listNum.length];
        
        for(int i = 0; i < listNum.length; i++){
            System.out.println("Digite um número inteiro: ");
            int inputNum = input.nextInt();
            listNum[i] = inputNum;
        }
        for(int i = 0; i < listNum.length; i++){
            invertList[listNum.length - 1 - i] = listNum[i];
        }
        for(int i = 0; i < listNum.length; i++){
            System.out.println(invertList[i]);
        }
        
        input.close();
    }
}
