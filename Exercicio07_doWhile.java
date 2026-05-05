import java.util.Scanner;

public class Exercicio07_doWhile {

    public static void main(String[] args) {
        
        /*
        Pedir ao usuário diversos números, até que seja informado o 0.

        Exibir a soma de todos os números informados.
        */

        Scanner obj = new Scanner(System.in);

        int numero = 0;
        int soma = 0;

        do{
            System.out.println("Informe um número: ");
            numero = obj.nextInt();

            soma+=numero;
        }while(numero != 0);

        obj.close();

        System.out.println("A soma é "+soma);
    }
    
}
