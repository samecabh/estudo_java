import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        
        // Peça duas notas, exiba a média e a situação

        // Média 7 ou superior = Aprovado(a)
        // Média inferior a 7 = Reprovado(a)

        // Objeto da classe Scanner
        Scanner obj = new Scanner(System.in);

        // Obter primeira nota
        System.out.println("Insira a primeira nota: ");
        double nota1 = obj.nextDouble();

        // Obter a segunda nota
        System.out.println("Insira a segunda nota: ");
        double nota2 = obj.nextDouble();

        // Fechar o Scanner
        obj.close();

        // Calcular a média
        double media = (nota1 + nota2) / 2;

        // Situação
        if(media >= 7){
            System.out.println("Aprovado(a) com média "+media);
        }else{
            System.out.println("Reprovado(a) com média "+media);
        }
    }
    
}
