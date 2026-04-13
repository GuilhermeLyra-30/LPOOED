package poo;
import java.util.Scanner;
public class leitorIdade {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        int decisao;
        double media;
        double contador = 0.0;
        double soma = 0.0;
        
        do{
            System.out.println("Digite a idade do users: ");
            double age = input.nextDouble();

            soma = soma + age;
            contador = contador + 1.0;

            System.out.println("SE QUISER CCONTINUAR DIGITE 1, SE NÃO DIGITE 0!");
            decisao = input.nextInt();
        } while(decisao == 1);

        media = soma / contador;
        System.out.println("A soma das idades é " + media);
        input.close();
    }
}
// A diferença entre o While e o Do while é que o While vai verificar para depois executar, o do while vai executar para depois verificar.
