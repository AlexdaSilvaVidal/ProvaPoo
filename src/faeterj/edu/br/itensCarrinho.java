package faeterj.edu.br;

public class itensCarrinho {

	private int idProduto;
    private int quantidade;

    public itensCarrinho(int idProduto, int quantidade) {
        this.idProduto = idProduto;
        this.quantidade = quantidade;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public int getQuantidade() {
        return quantidade;
    }
}
