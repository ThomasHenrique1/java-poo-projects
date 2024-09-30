import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        // Iniciando o Scanner para entrada de dados
        @SuppressWarnings("resource")
        Scanner pd = new Scanner(System.in);

        // Criação de um objeto da classe Produto
        Produto x, y;
        x = new Produto(); // Usando o construtor padrão

        // Entrada de dados para o primeiro produto
        System.out.println("Digite os dados do produto!");
        System.out.println("Digite o nome da marca:");
        x.marca = pd.next();
        System.out.println("Digite o fabricante do produto:");
        x.fabricante = pd.next();
        System.out.println("Digite o Código de Barras do produto:");
        x.cod_barras = pd.next();
        System.out.println("Digite o preço do produto:");
        x.preco = pd.nextFloat();

        // Exibe as informações do primeiro produto
        System.out.println("Informações do Produto!");
        System.out.println("O nome da marca do produto é: " + x.marca);
        System.out.println("O fabricante desse produto é: " + x.fabricante);
        System.out.println("O Código de Barras desse produto: " + x.cod_barras);
        System.out.println("O preço deste produto é de: " + x.preco);

        System.out.println("===================================");

        // Solicita informações para o segundo produto
        System.out.println("Digite as informações do próximo produto!");
        System.out.println("====================================");
        System.out.println("Digite os dados do segundo produto, na seguinte ordem: \n Marca \n Fabricante \n Código de Barras \n Preço.");
        System.out.println("====================================");

        // Entrada de dados para o segundo produto, utilizando o construtor com parâmetros
        @SuppressWarnings("resource")
        Scanner pd2 = new Scanner(System.in);

        y = new Produto(
                pd2.next(),   // Marca
                pd2.next(),   // Fabricante
                pd2.next(),   // Código de Barras
                pd2.nextFloat()  // Preço
        );

        // Exibe as informações do segundo produto
        System.out.println("=======================================");
        System.out.println("Informações do Produto!");
        System.out.println("O nome da marca do produto é: " + y.marca);
        System.out.println("O fabricante desse produto é: " + y.fabricante);
        System.out.println("O Código de Barras desse produto: " + y.cod_barras);
        System.out.println("O preço deste produto é de: " + y.preco);
    }
}
