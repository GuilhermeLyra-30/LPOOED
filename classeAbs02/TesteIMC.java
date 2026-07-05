package classeAbs02;

import java.util.Scanner;
import java.util.ArrayList;

public class TesteIMC {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int opcao = 0;

        ArrayList<PessoaIMC> listPessoas = new ArrayList<>();

        do {
            System.out.println("1. Cadastra Homem\n" + //
                                "2. Cadastrar Mulher\n" + //
                                "3. Consultar IMC (Busca pelo nome)\n" + //
                                "4. Listar Homens\n" + //
                                "5. Listar Mulheres\n" + //
                                "6. Listar todos os IMCs dos Homens\n" + //
                                "7. Listas todos os IMCs\n" + //
                                "0. Sair"
            );
            opcao = input.nextInt();
            input.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do homem: ");
                    String nomeH = input.nextLine();

                    System.out.println("Digite a data de nascimento no formato DD/MM/YYYY");
                    String nascimentoH = input.nextLine();

                    System.out.println("Digite o peso: ");
                    double pesoH = input.nextDouble();

                    System.out.println("Digite a altura no formato EX: 1,78 ");
                    double alturaH = input.nextDouble();

                    Homem homem = new Homem(nomeH, nascimentoH, pesoH, alturaH);
                    listPessoas.add(homem);
                    break;
                
                case 2:
                    System.out.println("Digite o nome da mulher: ");
                    String nomeM = input.nextLine();

                    System.out.println("Digite a data de nascimento no formato DD/MM/YYYY");
                    String nascimentoM = input.nextLine();

                    System.out.println("Digite o peso: ");
                    double pesoM = input.nextDouble();

                    System.out.println("Digite a altura no formato EX: 1,78 ");
                    double alturaM = input.nextDouble();

                    Mulher mulher = new Mulher(nomeM, nascimentoM, pesoM, alturaM);
                    listPessoas.add(mulher);
                    break;

                case 3:
                    System.out.println("Digite o nome da pessoa que deseja buscar: ");
                    String searchName = input.nextLine();

                    boolean busca = false;
                    
                    for(PessoaIMC p: listPessoas){
                        if(p.getNome().equalsIgnoreCase(searchName)){
                            System.out.println("===== CADASTRO ENCONTRADO =====");
                            System.out.println("Pessoa: " + p.toString());
                            System.out.println("Índice de massa corporea: " + p.resultIMC());
                            busca = true;
                            break;
                        }
                    }

                    if(busca == false){
                        System.out.println("O nome " + searchName + " não foi encontrado!");
                    }
                    break;
                
                case 4:
                    int contador = 0;
                    
                    for (PessoaIMC pHomem: listPessoas) {
                        if(pHomem instanceof Homem){
                            System.out.println("\n" + pHomem.toString());
                            contador++;
                        }
                    }
                    
                    if(contador == 0){
                        System.out.println("Não existem homens cadastrados ainda!");
                    }
                    break;

                case 5:
                    int cont = 0;
                    
                    for (PessoaIMC pMulher: listPessoas) {
                        if(pMulher instanceof Mulher){
                            System.out.println("\n" + pMulher.toString());
                            cont++;
                        }
                    }
                    
                    if(cont == 0){
                        System.out.println("Não existem Mulheres cadastradas ainda!");
                    }
                    break;

                case 6:
                    int c = 0;
                
                    for(PessoaIMC listP: listPessoas){
                        if(listP instanceof Homem){
                            System.out.println("\n" + listP.resultIMC());
                            c++;
                        }
                    }

                    if (c == 0){
                        System.out.println("Não existem homens cadastrados ainda! ");
                    }
                    break;
                    
                case 7:
                    if (listPessoas.isEmpty()){
                        System.out.println("Não existem pessoas cadastradas!");
                    }else{
                        for (PessoaIMC pIMC : listPessoas) {
                            System.out.println("" + pIMC.resultIMC());
                        }
                    }
                    
                    break;
                
                    default:
                        System.out.println("Opção digitada inválida! Por favor, tente novamente!");
                        break;
            }

        } while (opcao != 0);


        input.close();
    }
}
