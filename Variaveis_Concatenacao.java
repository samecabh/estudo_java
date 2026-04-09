public class Variaveis_Concatenacao {

    public static void main(String[] args) {
        
        // Variáveis
        String nome = "Sâmec Abrahão Souza Lima";
        String profissao = "Programação";
        char letra = 'S';
        int idade = 22;
        double altura = 1.77;
        boolean estuda = true;

        // Concatenação
       System.out.println("Nome: "+nome);
       System.out.println("Letra: "+letra);
       System.out.println("Idade: "+idade);
       System.out.println("Altura: "+altura);
       System.out.println("Estuda: "+estuda);
       System.out.println("Profissão: "+profissao);

       // MÉTODO 1

        System.out.println("Olá, "+nome+". Você tem "+idade+" anos e quer trabalhar com "+profissao+".");

       // MÉTODO 2

        System.out.println(String.format("Olá, %s. Você tem %s anos e quer trabalhar com %s.", nome, idade, profissao));

    }
    
}
