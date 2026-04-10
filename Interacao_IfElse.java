import java.util.Scanner;

public class Interacao_IfElse {

    public static void main(String[] args) {
        
        Scanner programacao = new Scanner(System.in);

        System.out.println("Você está aprendendo a programar");
        String questao = programacao.nextLine();

        if (questao.equalsIgnoreCase("Sim")){
            System.out.println("Parabéns!");
        } else {
            System.out.println("O que espera para começar?");
        }

        programacao.close();
    }
    
}
