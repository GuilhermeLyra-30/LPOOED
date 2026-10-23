package duplamente_encadeada;

import java.util.Scanner;

public class Navegador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListaHistorico historico = new ListaHistorico();

        while (true) {
            System.out.println("\n--- MENU NAVEGADOR ---");
            System.out.println("1 para navegar para outra página");
            System.out.println("2 para consultar qual a página atual");
            System.out.println("3 para voltar para a página anterior");
            System.out.println("4 para mostrar o histórico das páginas acessadas");
            System.out.println("5 para SAIR");
            System.out.print("Escolha uma opção: ");
            
            String opcaoStr = scanner.nextLine();
            
            try {
                int opcao = Integer.parseInt(opcaoStr);
                
                switch (opcao) {
                    case 1:
                        System.out.print("Digite o NOME da página: ");
                        String nome = scanner.nextLine();
                        System.out.print("Digite a URL da página: ");
                        String url = scanner.nextLine();
                        
                        Pagina novaPagina = new Pagina(nome, url);
                        historico.adicionar(novaPagina);
                        System.out.println("Página adicionada!");
                        break;
                        
                    case 2:
                        historico.consultarAtual();
                        break;
                        
                    case 3:
                        historico.voltar();
                        break;
                        
                    case 4:
                        historico.mostrarHistorico();
                        break;
                        
                    case 5:
                        System.out.println("Encerrando o navegador...");
                        scanner.close();
                        System.exit(0);
                        break;
                        
                    default:
                        // Lança a exceção customizada se não for de 1 a 5
                        throw new OpcaoInvalidaException("Opção inválida!");
                }
            } catch (OpcaoInvalidaException e) {
                // Captura a exceção customizada e imprime a mensagem exigida
                System.out.println(e.getMessage());
            } catch (NumberFormatException e) {
                // Caso o usuário digite uma letra ao invés de número
                System.out.println("Opção inválida!"); 
            }
        }
    }
}