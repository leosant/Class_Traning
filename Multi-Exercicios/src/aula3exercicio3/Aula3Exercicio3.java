package aula3exercicio3;

/**
 *
 * @author LeoUser
 */
public class Aula3Exercicio3 {

    public static void main(String[] args) {
        double a, b, resultado = 0;
        int deci = 0;
        System.out.println("Qual calcúlo gostaria de fazer");
        System.out.println(" 1 para expoente, \n 2 para dividir \n 3 para multiplicar"
                + "\n 4 para subtrair \n 5 para somar: ");

        deci = Leitor.lerNumerosInt();
        System.out.println(deci);

        System.out.println("Qual o números a ser calculados");
        a = Leitor.lerNumeros("Informe o primeiro número: ");
        b = Leitor.lerNumeros("Informe o segundo número: ");
        
        resultado = decisao(deci,a,b);
        System.out.println(resultado);
        
        System.out.println("Valor: " + resultado);

    }

    public static double decisao(int dec, double num1, double num2) {
        double resultado = 0;

        if (dec == 1) {
            resultado = Matematica.expoente(num1, num2);
        }
        if (dec == 2) {
            resultado = Matematica.dividir(num1, num2);
        }
        if (dec == 3) {
            resultado = Matematica.multiplicar(num1, num2);
        }
        if (dec == 4) {
            resultado = Matematica.subtrair(num1, num2);
        }
        if (dec == 5) {
            resultado = Matematica.somar(num1, num2);
        }
        return resultado;
    }
}
