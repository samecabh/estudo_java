public class Matriz {

    public static void main(String[] args) {
        
        // Matriz
        String[][] clientes = {
            {"Sâmec", "Hortolândia"},
            {"Abrahão", "Campinas"},
            {"Souza", "Sumaré"},
            {"Lima", "São Paulo"}
        };
        // Exibir
        // System.out.println(clientes[0][0]);
        for(int indice=0; indice <4; indice++){
            System.out.println("Nome: "+clientes[indice][0]);
            System.out.println("Cidade: "+clientes[indice][1]);
            System.out.println();
        }
    }
    
}
