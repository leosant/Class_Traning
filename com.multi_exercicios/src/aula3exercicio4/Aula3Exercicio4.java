package aula3exercicio4;

public class Aula3Exercicio4 {

    public static void main(String[] args) {
        System.out.println("Digite número: ");
        int num = 5;
        int num2 =10;
        int somaTudo = num+num2;
        String resultado = somar(somaTudo);
        
        System.out.println(recursiva(15,0));
        System.out.println(resultado +" Resultado");
    }

    public static String somar(int numero) {
        String soma = "";
        int aux = 0;

        for (int i = numero; i >= 0; i--) {
            aux = aux+i;
            if(i == numero) {
                soma = soma +(numero-i);
            }
            else{
                soma = soma +"+"+ +(numero - i);
            }  
        }
        
        return soma+" = "+aux;
    }
    
    public static int recursiva(int n, int soma) {
        if(n == 0){
            return soma;
        }
            soma = soma + n;
        
     return recursiva(n-1,soma);   
    }
}
