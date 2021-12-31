/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula2exercicio4;

import java.util.Scanner;

/**
 * Exercicio: Media de altura de pessoas com 50 anos
 * @author LeoUser
 */
public class Aula2Exercicio4 {

    public static void main(String[] args) {
        int[] idade = new int[10];
        float[] altura = new float[10];
        float soma = 0,mediaFinal = 0;
        int freque = 0;

        //
        Scanner teclado = new Scanner(System.in);

        //Estrutura de repetição para preencher o Array
        for (int i = 0; i < idade.length; i++) {
            System.out.println("Qual a sua idade: ");
            idade[i] = teclado.nextInt();

            System.out.println("Qual a sua altura: ");
            altura[i] = teclado.nextFloat();

        }
        for (int y = 0; y < idade.length; y++) {
            if (idade[y] == 50) {
                freque++;
                soma = soma + altura[y];
            }  
            
        }
        mediaFinal = soma / freque;
        System.out.println("Media: " + mediaFinal);
    }
}
