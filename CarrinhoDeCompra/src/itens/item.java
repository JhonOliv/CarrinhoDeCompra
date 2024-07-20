package itens;

public class item{
	
	// Definir atributos
	
	private String nomeProduto;
	private double precoProduto;
	private int qtdProduto;
	
	public item(String nomeProduto, double precoProduto, int qtdProduto) {
		this.nomeProduto = nomeProduto;
		this.precoProduto = precoProduto;
		this.qtdProduto = qtdProduto;
	}
	
	public String getNomeProduto() {
		return nomeProduto;
	}

	public double getPrecoProduto() {
		return precoProduto;
	}
	
	public int getQtdProduto() {
		return qtdProduto;
	}
	
	public void setQtdProduto(int qtdProduto) {
		this.qtdProduto = qtdProduto;
	}

	@Override
	public String toString() {
		return "nomeProduto= " + nomeProduto + ", precoProduto= " + precoProduto + ", qtdProduto= " + qtdProduto
				+ "\n";
	}
	

}
