package poo;

import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double num1 = 0.0, num2 = 0.0;
        char operator;

        System.out.println("Digite o primeiro número para operação: ");
        num1 = input.nextDouble();
        System.out.println("Digite o segundo número para operação: ");
        num2 = input.nextDouble();
        input.nextLine();
        System.out.println("Digite o tipo de operação desejada: \n (+) para somar \n (-) para subtrair \n (*) para multiplicar \n (/) para dividir");
        operator = input.next().charAt(0);

        if(operator == '+'){
            double soma = num1 + num2;
            System.out.println("O valor da soma é " + soma);
        }else if(operator == '-'){
            double subtrai = num1 - num2;
            System.out.println("O valor da soma é " + subtrai);
        }else if(operator == '*'){
            double multiplica = num1 * num2;
            System.out.println("O valor da soma é " + multiplica);
        }else if(operator == '/'){
            double divide = num1 / num2;
            System.out.println("O valor da soma é " + divide);
        }
        input.close();
 
    }
}
