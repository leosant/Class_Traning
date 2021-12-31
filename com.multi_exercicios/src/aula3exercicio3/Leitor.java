package aula3exercicio3;

import java.util.Scanner;

/**
 *
 * @author LeoUser
 */
public class Leitor {

    public static int lerNumerosInt() {
        return new Scanner(System.in).nextInt();
    }

    public static double lerNumeros(String msg) {
        System.out.println(msg);
        return lerNumeros();
    }

    public static double lerNumeros() {
        return new Scanner(System.in).nextDouble();
    }
}
