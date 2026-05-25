package calsseAbs03;
import java.util.Scanner;
import java.util.ArrayList;

public class Teste {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcao = 0;

        System.out.println("[1] Cadastrar Carro \n[2] Cadastrar Moto \n[3] Mostrar os detalhes de todos os veículos \n[4] Lista Autonomia de todas as motos \n[5]Lista autonomia de todos os carros");
        opcao = input.nextInt();
        input.nextLine();

        ArrayList<Moto> motos = new ArrayList<>();
        ArrayList<Carro> carros = new ArrayList<>();

        switch (opcao) {
            case 1:
                System.out.println("Digite a marca do carro:");
                String marca = input.nextLine();
                
                System.out.println("Digite o modelo do carro:");
                String modelo = input.nextLine();
                
                System.out.println("Digite capacidade do Tanque do carro:");
                double capacidadeTanque = input.nextDouble();
                
                System.out.println("Digite o consumo por litro:");
                double consumoLitro = input.nextDouble();
                
                System.out.println("Digite o número de portas do carro:");
                int numPortas = input.nextInt();
                input.nextLine();

                Carro carro = new Carro(numPortas, marca, modelo, capacidadeTanque, consumoLitro);
                carros.add(carro);
                break;
            case 2:
                System.out.println("Digite a marca da moto:");
                String marcaMoto = input.nextLine();

                System.out.println("Digite o modelo da moto:");
                String modeloMoto = input.nextLine();

                System.out.println("Digite capacidade do Tanque da moto:");
                double capacidadeTanqueMoto = input.nextDouble();

                System.out.println("Digite o consumo por litro:");
                double consumoLitroMoto = input.nextDouble();

                System.out.println("Digite o tipo de guidão da moto:");
                String tipoGuidao = input.nextLine();

                Moto moto = new Moto(tipoGuidao, marcaMoto, modeloMoto, capacidadeTanqueMoto, consumoLitroMoto);
                motos.add(moto);
                break;
            case 3:
                for (Carro c : carros) {
                    if (c instanceof Carro) {
                        System.out.println(c);
                    }
                }
                for (Moto m : motos) {
                    if (m instanceof Moto) {
                        System.out.println(m);
                    }
                }
                break;
            case 4:
                break;
            case 5:
            
                break;
            
        }
        input.close();
    }    
}
