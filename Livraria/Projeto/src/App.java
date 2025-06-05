import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Livro> livrosDisponiveis = new ArrayList<>();

        Autor autor1 = new Autor("George Orwell", "Inglaterra");
        Genero genero1 = new Genero("Distopia", "sociedades opressoras");
        livrosDisponiveis.add(new Livro("1984", autor1, genero1, 49.90));

        Autor autor2 = new Autor("Machado de Assis", "Brasil");
        Genero genero2 = new Genero("Romance", "eelações humanas e dilemas sociais");
        livrosDisponiveis.add(new Livro("Dom Casmurro", autor2, genero2, 39.90));

        //Devido a herança, o pedido serve para tanto o padrão como o online
        Pedido pedido = null;

        int opcao;

        do {
            System.out.println("\n=== SISTEMA LIVRARIA ===");
            //Após criar o pedido, ele passa para as opções 3 e 4
            if (pedido == null) {
                System.out.println("1 - Criar Pedido Físico");
                System.out.println("2 - Criar Pedido Online");
            } else {
                System.out.println("3 - Adicionar Livro ao Pedido");
                System.out.println("4 - Mostrar Pedido");
            }
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            // Limpar o buffer
            sc.nextLine(); 

            switch (opcao) {
                case 1:
                    if (pedido == null) {
                        pedido = new Pedido();
                        System.out.println("Pedido físico criado.");
                    } else {
                        System.out.println("Você já criou um pedido.");
                    }
                    break;

                case 2:
                    if (pedido == null) {
                        pedido = new PedidoOnline();
                        System.out.println("Pedido online criado (frete fixo de R$20,00).");
                    } else {
                        System.out.println("Você já criou um pedido.");
                    }
                    break;

                case 3:
                    if (pedido == null) {
                        System.out.println("Crie um pedido antes de adicionar livros.");
                    } else {
                        System.out.println("\n--- Livros Disponíveis ---");
                        //For que percorre o arraylist mostrando os dados
                        for (int i = 0; i < livrosDisponiveis.size(); i++) {
                            System.out.println((i + 1) + " - " + livrosDisponiveis.get(i));
                        }
                        System.out.print("Número do livro para adicionar: ");
                        int escolha = sc.nextInt();
                        //Adiciona um livro ao pedido
                        if (escolha >= 1 && escolha <= livrosDisponiveis.size()) {
                            // - 1 para acessar a posição correta
                            pedido.adicionarLivro(livrosDisponiveis.get(escolha - 1));
                            System.out.println("Livro adicionado ao pedido.");
                        } else {
                            System.out.println("Número inválido.");
                        }
                    }
                    break;

                case 4:
                    if (pedido == null || pedido.itens.isEmpty()) {
                        System.out.println("Nenhum item no pedido.");
                    } else {
                        System.out.println("\n--- Itens do Pedido ---");
                        pedido.listarItens();
                    }
                    break;

                case 0:
                    System.out.println("Encerrando o sistema");
                    break;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }

        } while (opcao != 0);

        sc.close();
    }
}

