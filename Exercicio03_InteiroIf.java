import java.util.Scanner;

public class Exercicio03_InteiroIf {

    public static void main(String[] args) {
        
        // Pedir dois números inteiros
        // If iguais = soma, else = multiplicação

        Scanner obj = new Scanner(System.in);
        
        // Obter o primeiro número inteiro
        System.out.println("Informe um número inteiro: ");
        int numero1 = obj.nextInt();

        // Obter o segundo número inteiro
        System.out.println("Informe outro número inteiro: ");
        int numero2 = obj.nextInt();

        // Encerrar interação com o usuário
        obj.close();

        int calculo = numero1 == numero2 ? numero1+numero2 : numero1*numero2;

        // Exibir o resultado

        System.out.println(calculo);
    }
    
}
