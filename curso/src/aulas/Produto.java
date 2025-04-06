package aulas;

public class Produto {
	private String descricao;
	private double valor;
	private int quantidade;
	
	
	public Produto(String descricao, double valor, int quantidade) {
		super();
		this.descricao = descricao;
		this.valor = valor;
		this.quantidade = quantidade;
	}
	
	
	public double calcularIcms () {
		return valor * quantidade * 0.12;
	}
	
    public void exibirDetalhes() {
        double total = valor * quantidade;
        System.out.println("Descrição: " + descricao);
        System.out.println("Valor: " + valor);
        System.out.println("Total: " + total);
        System.out.println("ICMS: " + calcularIcms());
    }
	
	
}
