package interface2;

import java.util.Scanner;

public class MenuAluno {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        AlunosArrayList aluno = new AlunosArrayList();
        AlunoArray alunoArray = new AlunoArray();
        int escolha = 0;
        int decisao = 0;

        System.out.println("Você quer criar o arquivo do seu aluno em [1] ArrayList ou em [2]Array: ");
        decisao = input.nextInt();
        input.nextLine();

        switch (decisao) {
            case 1:
                do {
                    System.out.println("[1] Adicionar nota \n[2] Remover a última nota \n[3] Calcular a média \n[4] Mostrar a maior nota tirada \n[0] Sair");
                    escolha = input.nextInt();
                    input.nextLine();
        
                    switch (escolha) {
                        case 1:
                            System.out.println("Digite a nova nota: ");
                            double nota = input.nextDouble();
                            aluno.addNovaNota(nota);
                            System.out.println("Nota adicionada com sucesso.");
                            break;
                        case 2:
                            aluno.removerUltimaNota();
                            break;
                        case 3:
                            double media = aluno.calcMedia();
                            System.out.println("A média das notas é: " + media);
                            break;
                        case 4:
                            double maiorNota = aluno.getMaiorNota();
                            System.out.println("A maior nota tirada foi: " + maiorNota);
                            break;
                        case 0:
                            System.out.println("Saindo do programa...");
                            break;
                        default:
                            System.out.println("Opção inválida. Tente novamente.");
                            break;
                    }
                } while (escolha != 0); 
                break;
        
            case 2:
                do {
                    System.out.println("[1] Adicionar nota \n[2] Remover a última nota \n[3] Calcular a média \n[4] Mostrar a maior nota tirada \n[0] Sair");
                    escolha = input.nextInt();
                    input.nextLine();
        
                    switch (escolha) {
                        case 1:
                            System.out.println("Digite a nova nota: ");
                            double nota = input.nextDouble();
                            alunoArray.addNovaNota(nota);
                            System.out.println("Nota adicionada com sucesso.");
                            break;
                        case 2:
                            alunoArray.removerUltimaNota();
                            break;
                        case 3:
                            double m = alunoArray.calcMedia();
                            System.out.println("A média das notas é: " + m);
                            break;
                        case 4:
                            double maiorN = alunoArray.getMaiorNota();
                            System.out.println("A maior nota tirada foi: " + maiorN);
                            break;
                        case 0:
                            System.out.println("Saindo do programa...");
                            break;
                        default:
                            System.out.println("Opção inválida. Tente novamente.");
                            break;
                    }
                } while (escolha != 0); 
                break;
        }
        input.close();
    }
}
