import java.util.Scanner;

public class Produto {
    // Atributos da classe Produto
    String marca;  // Marca do produto
    float valor;   // Valor do produto
    float x;       // Atributo não utilizado (pode ser removido)

    // Método para cadastrar os dados do produto
    public void cadastraDados() {
        try (Scanner scanner = new Scanner(System.in)) {
            // Solicita ao usuário o nome da marca do produto
            System.out.println("Digite o nome do produto: ");
            marca = scanner.next();
            
            // Solicita ao usuário o valor do produto
            System.out.println("Digite o valor: ");
            valor = scanner.nextFloat();
        }
    }

    // Método para imprimir os dados do produto
    public void imprimiDados() {
        // Exibe a marca e o valor do produto
        System.out.println("A marca do produto é: " + marca);
        System.out.println("O valor do produto é: " + valor);
    }

    // Método para calcular o imposto baseado em uma porcentagem fornecida
    public float calculaImposto(float porcentagem) {
        float imposto = 0;
        
        // Calcula o imposto multiplicando a porcentagem pelo valor do produto e dividindo por 100
        imposto = porcentagem * valor / 100;
        
        return imposto;  // Retorna o valor do imposto calculado
    }
}
