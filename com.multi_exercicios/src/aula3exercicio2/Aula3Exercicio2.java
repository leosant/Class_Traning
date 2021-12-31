/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula3exercicio2;
import java.util.Scanner;
/**
 *
 * @author LeoUser
 */
public class Aula3Exercicio2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite a temperatura: ");
        double temp = teclado.nextDouble();
        
        double temperatura = fahrenheit(temp);
        
        System.out.println("Temperatura em fahrenheit: "+temperatura);
    }

    public static double fahrenheit(double celsius) {
        double far;

        return far = (9 * celsius + 160) / 5;

    }
}
