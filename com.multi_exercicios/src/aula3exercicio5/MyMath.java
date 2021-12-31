package aula3exercicio5;

public class MyMath {

    public static int fatorial(int x) {

        int multi = 1;

        for (int i = 1; i <= x; i++) {

            multi *= i;
            System.out.print(multi+"*");
        }
        return multi;
    }
}
