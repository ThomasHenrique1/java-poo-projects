public class Trab0a {

    public static void main(String[] args) {
        // Cria um objeto Trabalhador com o construtor padrão
        Trabalhador trabA = new Trabalhador();
        trabA.mostra();  // Exibe informações do trabalhador trabA

        // Cria um objeto Trabalhador com nome e salário especificados
        Trabalhador trabB = new Trabalhador("Joao Silva", 1500.75f);
        trabB.mostra();  // Exibe informações do trabalhador trabB

        // Cria outro objeto Trabalhador com nome e salário especificados
        Trabalhador trabC = new Trabalhador("Ana Souza", 1000f);
        trabC.mostra();  // Exibe informações do trabalhador trabC

        // Altera o salário de trabC e exibe novamente as informações
        System.out.println("\nDepois de alterar o salario da Ana: ");
        trabC.setSalario(4000);  // Atualiza o salário da Ana
        trabC.mostra();  // Exibe as informações atualizadas do trabalhador trabC
    }
}
