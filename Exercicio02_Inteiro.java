import java.util.Scanner;

public class Exercicio01_Inteiro {

    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);

        // Obter o primeiro número
        System.out.println("Informe o primeiro número: ");
        int numero1 = obj.nextInt();

        // Obter o segundo número
        System.out.println("Informe o segundo número: ");
        int numero2 = obj.nextInt();

        // Obter o terceiro número
        System.out.println("Informe o terceiro número: ");
        int numero3 = obj.nextInt();

        obj.close();

        // Criar uma váriavel menor número
        int menorNumero = numero1;

        // Condicionais
        if(numero2 < menorNumero){
            menorNumero = numero2;
        }

        if(numero3 < menorNumero){
            menorNumero = numero3;
        }

        // Exibir o menor número
        System.out.println("O menor número é "+menorNumero);
    }
    
}
