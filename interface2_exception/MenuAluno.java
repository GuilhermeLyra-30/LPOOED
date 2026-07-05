package interface2_exception;

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

        switch (decisao) {
            case 1:
                do {
                    System.out.println("[1] Adicionar nota \n[2] Remover a última nota \n[3] Calcular a média \n[4] Mostrar a maior nota tirada \n[0] Sair");
                    escolha = input.nextInt();
        
                    switch (escolha) {
                        case 1:
                            int check = 0;
                            
                            while (check == 0) {
                                try{
                                    System.out.println("Digite a nova nota: ");
                                    double nota = input.nextDouble();
                                    aluno.addNovaNota(nota);
                                    check++;
                                    System.out.println("Nota adicionada com sucesso.");
                                }catch (NotaInvalidaException e){
                                    System.out.println("Nota Inválida");
                                }finally{
                                    System.out.println("");
                                }
                            }
                            break;
                        
                        case 2:
                            try{
                                aluno.removerUltimaNota();
                            }catch(NotaInvalidaException e){
                                System.out.println("Não há notas cadastradas");
                            }   
                            finally{
                            }
                            break;
                        
                        case 3:
                            try{
                                double media = aluno.calcMedia();
                                System.out.println("A média das notas é: " + media);
                            }catch(NotaInvalidaException e){
                                System.out.println("Não há notas cadastradas");
                            }   
                            finally{
                            }
                            
                            break;
                   
                        case 4:
                            try{
                                double maiorNota = aluno.getMaiorNota();
                                System.out.println("A maior nota tirada foi: " + maiorNota);
                            }catch(NotaInvalidaException e){
                                System.out.println("Não há notas cadastradas");
                            }   
                            finally{
                            }
                            
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
                            int check = 0;
                            while (check == 0) {
                                try{
                                    System.out.println("Digite a nova nota: ");
                                    double nota = input.nextDouble();

                                    aluno.addNovaNota(nota);
                                    check++;
                                    System.out.println("Nota adicionada com sucesso.");
                                }catch (NotaInvalidaException e){
                                    System.out.println("Nota Inválida");
                                }finally{
                                }
                            }
                            break;
                            
                        case 2:
                            try {
                                alunoArray.removerUltimaNota();
                            } catch (NotaInvalidaException e) {
                                System.out.println("Não há notas cadastradas.");
                            }finally{
                            }
                            
                            break;
                        
                        case 3:
                            try{
                                double m = alunoArray.calcMedia();
                                System.out.println("A média das notas é: " + m);
                            }catch(NotaInvalidaException e){
                                System.out.println("Não há notas cadastradas");
                            }   
                            finally{
                            }
                            
                            break;
                        
                        case 4:
                            try{
                                double maiorN = alunoArray.getMaiorNota();
                                System.out.println("A maior nota tirada foi: " + maiorN);
                            }catch(NotaInvalidaException e){
                                System.out.println("Não há notas cadastradas");
                            }   
                            finally{
                            }
                            
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
