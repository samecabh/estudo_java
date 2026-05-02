import java.util.Scanner;

public class Exercicio06_Calculo {

    public static void main(String[] args) {
        
        /*

        Pedir o código do produto e a quantidade, e retornar o valor a pagar

        */

        Scanner obj = new Scanner(System.in);

        System.out.println("Informe o código do produto desejado: ");
        System.out.println("1 - Samsung Galaxy S20 | R$ 2000");
        System.out.println("2 - Samsung Galaxy S21 | R$ 2100");
        System.out.println("3 - Samsung Galaxy S22 | R$ 2200");
        int codigo = obj.nextInt();

        System.out.println("Informe a quantidade: ");
        int quantidade = obj.nextInt();

        obj.close();

        double retorno = switch(codigo){
            case 1 -> 2000 * quantidade;
            case 2 -> 2100 * quantidade;
            case 3 -> 2200 * quantidade;
            default -> 0;
        };

        System.out.println("R$ "+retorno);
    }
    
}
