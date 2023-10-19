package faeterj.edu.br;

import java.util.ArrayList;

public class Carrinho {

    private ArrayList<itensCarrinho> itens;
    private double valorTotal;

    public Carrinho() {
        itens = new ArrayList<>();
        valorTotal = 0;
    }

    public void adicionarItem(int idProduto, int quantidade, ArrayList<Produto> produtos) {
        for (Produto produto : produtos) {
            if (produto.getId() == idProduto) 
            {
                double subtotal = produto.getPreco() * quantidade;
                valorTotal += subtotal;
                itens.add(new itensCarrinho(idProduto, quantidade));
                System.out.println("Produto adicionado ao carrinho: " + produto.getNome() + " x" + quantidade);
                return;
            }
        }
        System.out.println("Produto não encontrado.");
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void listarCarrinho(ArrayList<Produto> produtos) {
        if (itens.isEmpty()) {
            System.out.println("O carrinho está vazio.");
            return;
        }

        System.out.println("Carrinho de Compras:");
        for (itensCarrinho item : itens) {
            for (Produto produto : produtos) {
                if (produto.getId() == item.getIdProduto()) {
                    System.out.println(produto.getNome() + " x" + item.getQuantidade() + " - R$" + produto.getPreco());
                }
            }
        }
        System.out.println("Valor Total do Carrinho: R$" + valorTotal);
    }
}
