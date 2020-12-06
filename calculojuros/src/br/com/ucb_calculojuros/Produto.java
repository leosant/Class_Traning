package br.com.ucb_calculojuros;

public class Produto {
	private String nomeProduto;
	private float precoProduto;
	
	public Produto(String nomeProduto, float precoProduto) {
		this.setNomeProduto(nomeProduto);
		this.setPrecoProduto(precoProduto);
	}
	
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public float getPrecoProduto() {
		return precoProduto;
	}
	public void setPrecoProduto(float precoProduto) {
		this.precoProduto = precoProduto;
	}
}
