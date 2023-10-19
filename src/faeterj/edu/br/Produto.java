package faeterj.edu.br;

public class Produto {
	
	private int Id;
    private String Nome;
    private double Valor;

    public Produto(int Id, String Nome, double Valor) {
        this.Id = Id;
        this.Nome = Nome;
        this.Valor = Valor;
    }

    public int getId() {
        return Id;
    }

    public String getNome() {
        return Nome;
    }

    public double getPreco() {
        return Valor;
    }
}

