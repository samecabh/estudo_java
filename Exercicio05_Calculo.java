import java.util.Scanner;

public class Exercicio05_Calculo {

    public static void main(String[] args) {
        
        /*
        Pedir dois números inteiros e um tipo de cálculo

        As opções de cálculo são:

        1 = Somar
        2 = Subtrair
        3 = Multiplicar
        4 - Dividir

        Retornar o valor em seguida
        */

        Scanner obj = new Scanner(System.in);

        System.out.println("Informe o primeiro número inteiro: ");
        int primeiroNumero = obj.nextInt();

        System.out.println("Informe o segundo número inteiro: ");
        int segundoNumero = obj.nextInt();

        System.out.println("Informe o tipo de cálculo:");
        System.out.println("1 - Somar");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        int opcao = obj.nextInt();

        obj.close();

        // Expressões Switch

        double retorno = switch(opcao){
            case 1 -> primeiroNumero+segundoNumero;
            case 2 -> primeiroNumero-segundoNumero;
            case 3 -> primeiroNumero*segundoNumero;
            case 4 -> primeiroNumero/segundoNumero;
            default -> 0;
        };

        // Exibir o retorno

        System.out.println(retorno);
    }
    
}
