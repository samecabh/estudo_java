public class Transformando_Inteiro {

    public static void main(String[] args) {
        
        String numero = "50";
        String outronumero = "40";

        // Transformar o texto em número inteiro

        Integer x = Integer.parseInt(numero);

        Integer y = Integer.parseInt(outronumero);

        Integer soma = x + y;

        System.out.println(soma);
    }
    
}
