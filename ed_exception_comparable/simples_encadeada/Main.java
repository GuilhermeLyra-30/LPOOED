package simples_encadeada;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListaHistorico historico = new ListaHistorico();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1 para navegar para outra página;");
            System.out.println("2 para consultar qual a página atual;");
            System.out.println("3 para voltar para a página anterior; ou");
            System.out.println("4 para mostrar o histórico das páginas acessadas.");
            System.out.print("Escolha uma opção: ");

            String opcao = scanner.nextLine();

            try {
                switch (opcao) {
                    case "1":
                        System.out.print("Digite o nome da página: ");
                        String nome = scanner.nextLine();
                        System.out.print("Digite a URL da página: ");
                        String url = scanner.nextLine();
                        
                        historico.add(new Pagina(nome, url));
                        break;

                    case "2":
                        historico.consultarAtual();
                        break;

                    case "3":
                        historico.voltar();
                        break;

                    case "4":
                        historico.mostrarHistorico();
                        break;

                    default:
                        // Lança a exceção customizada exigida na prova
                        throw new OpcaoInvalidaException("Opção inválida!");
                }
            } catch (OpcaoInvalidaException e) {
                // Imprime a mensagem exatamente como manda a questão
                System.out.println(e.getMessage());
            }
            {
                scanner.close();
            }
        }
    }
}
