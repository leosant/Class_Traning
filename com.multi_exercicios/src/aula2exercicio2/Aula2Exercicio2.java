package aula2exercicio2;

import java.util.Scanner;

/**
 * Exercicio: Calculo de divida com juros
 *
 * @author LeoUser
 */
public class Aula2Exercicio2 {

    public static void main(String[] args) {
        
        float valorTotal, juros, valorDivida;

        String nomeUsuario;

        Scanner teclado = new Scanner(System.in);

        //Input name
        System.out.println("Qual o nome do cliente: ");
        nomeUsuario = teclado.next();

        //Input de valores e cálculos
        System.out.println("Informe o valor do produto: ");
        valorTotal = teclado.nextFloat();

        System.out.println("Informe o valor do juros: ");
        juros = teclado.nextFloat();

        //Calc
        valorDivida = (valorTotal * juros) / 100;

        //Output user
        System.out.println("Cliente: " + nomeUsuario);
        System.out.println("Valor do produto: " + valorTotal);
        System.out.println("Valor com juros: " + (valorDivida + valorTotal));

    }
}
