import java.util.Scanner;

public class Interacao {

    public static void main(String[] args) {
        
        Scanner armazenamento = new Scanner(System.in);

        System.out.println("Qual é o seu nome? ");
        String nome = armazenamento.nextLine();

        System.out.println("Qual é a sua idade? ");
        int idade = armazenamento.nextInt();

        armazenamento.close();

        System.out.println(String.format("Olá, %s. Você tem %s anos.", nome, idade));
    }
    
}
