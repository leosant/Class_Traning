package br.com.ucb_calculojuros.com.calculojuros.model;

public class Juros {
	private float juros;

	
	public double calcularDivida(Produto produto) {
		
		return produto.getPrecoProduto()* getJuros();
	
	}
	
	public float getJuros() {
		return juros;
	}

	public void setJuros(float juros) {
		this.juros = juros;
	}
	
	
	
}
