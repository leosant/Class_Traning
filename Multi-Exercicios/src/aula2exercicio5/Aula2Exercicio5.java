package aula2exercicio5;

import java.util.Scanner;

/**
 * Exercicio:
 *
 * @author LeoUser
 */
public class Aula2Exercicio5 {

    public static void main(String[] args) {
        int[] num = new int[5];
        int numMaior = 0;
        int numMenor = 0;
        int media = 0;

        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < num.length; i++) {
            System.out.println("Digite o número: ");
            num[i] = teclado.nextInt();
            if(num[i]<0){
                System.out.println("Proíbido a inserção desse valor!");
                continue;
            }

            if (num[i] < numMaior) {
                if(numMenor>num[i]){
                    numMenor = num[i];
                }
                continue;
            }
            if(numMenor == 0){
                numMenor = num[i];
            }
            numMaior = num[i];
        }
        media = (numMaior+numMenor)/2;
        
        System.out.println("Esse numero é o maior: " + numMaior);
        System.out.println("Esse numero é o menor: " + numMenor);
        System.out.println("Essa é a média dos números: "+media);
    }
}
