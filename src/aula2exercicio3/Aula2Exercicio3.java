package aula2exercicio3;

import java.util.Scanner;

/**
 * Exercicio: Calculo do salario do vendedor com base nas vendas e porcentagem
 *
 * @author LeoUser
 */
public class Aula2Exercicio3 {

     public static void main(String[] args) {
        
        String nomeVendedor;
        float salario, salarioComisao,valorProduto;
        int produtoVendidos;

        //Leitura de input´s
        Scanner teclado = new Scanner(System.in);
        //Input´s
        System.out.println("Digite o nome do vendedor: ");
        nomeVendedor = teclado.next();
        System.out.println("Informe o salario do vendedor: ");
        salario = teclado.nextFloat();
        System.out.println("Informe a quantidade de produtos vendidos: ");
        produtoVendidos = teclado.nextInt();
        System.out.println("Informe a o valor do produtos: ");
        valorProduto = teclado.nextInt();
        
        //Calc
        salarioComisao = ((produtoVendidos*valorProduto)*15)/100;
        salario += salarioComisao; 
        //Output´s
        System.out.println("Nome do vendedor: "+nomeVendedor);
        System.out.println("Comisão: "+salarioComisao);
        System.out.println("Quantidade de produtos vendidos: "+produtoVendidos);
        System.out.println("Salario total: "+salario);
        
    }
}
