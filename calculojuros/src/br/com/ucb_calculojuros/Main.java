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
		System.out.println("Nome do produto �: "+produto1.getNomeProduto() + 
				" e o pre�o est�: R$"+ produto1.getPrecoProduto());
		System.out.println("Juros �: "+ juros.calcularDivida(produto1));
		
	}

}
