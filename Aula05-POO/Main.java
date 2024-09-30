import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Cria um novo objeto Produto usando o construtor padrão
            Produto x = new Produto();
            
            // Chama o método cadastraDados() para permitir ao usuário inserir os dados do produto
            x.cadastraDados();
            
            // Declara uma variável para armazenar o valor do imposto
            float imposto;
            
            // Lê o valor do imposto fornecido pelo usuário
            imposto = scanner.nextFloat();
            
            // Chama o método calculaImposto() do objeto Produto para calcular o imposto baseado no valor fornecido
            x.calculaImposto(imposto);
        }
    }
}
