package br.com.ucb_calculojuros;


//import java.util.ArrayList;
//import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner print = new Scanner(System.in);
		//ArrayList produtos = new ArrayList();
		Produto produto1 = new Produto("Armario", 150);
		Juros juros = new Juros();
		juros.setJuros((float) 0.10);
		System.out.println("Nome do produto é: "+produto1.getNomeProduto() + 
				" e o preço está: R$"+ produto1.getPrecoProduto());
		System.out.println("Juros é: "+ juros.calcularDivida(produto1));
		
	}

}
