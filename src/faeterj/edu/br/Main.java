package faeterj.edu.br;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        ArrayList<Produto> produtos = new ArrayList<>();
        // Adicione os produtos ao ArrayList
        produtos.add(new Produto(1, "Arroz", 10.0));
        produtos.add(new Produto(2, "Feijão", 15.0));
        produtos.add(new Produto(3, "Carne", 25.0));
        produtos.add(new Produto(4, "Frango", 20.0));
        produtos.add(new Produto(5, "Macarrão", 18.0));

        Carrinho carrinho = new Carrinho();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Opções:");
            System.out.println("1 - Listar Produtos");
            System.out.println("2 - Adicionar ao Carrinho");
            System.out.println("3 - Listar Carrinho");
            System.out.println("4 - Sair");

            int opcao = sc.nextInt();

            if (opcao == 1) {
                System.out.println("Produtos Disponíveis:");
                for (Produto produto : produtos) {
                    System.out.println(produto.getId() + " - " + produto.getNome() + " - R$" + produto.getPreco());
                }
            } else if (opcao == 2) {
                System.out.print("Digite o ID do Produto: ");
                int idProduto = sc.nextInt();
                System.out.print("Digite a quantidade: ");
                int quantidade = sc.nextInt();
                carrinho.adicionarItem(idProduto, quantidade, produtos);
            } else if (opcao == 3) {
                carrinho.listarCarrinho(produtos);
            } else if (opcao == 4) {
                break;
            }
        }

    }
}
