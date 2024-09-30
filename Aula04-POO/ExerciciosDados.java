public class ExerciciosDados {

    public static void main(String[] args) {

        // Criação de dois objetos da classe Triangulo, um com valores padrão e outro com valores fornecidos
        Triangulo roberwando = new Triangulo();  // Usando o construtor padrão
        Triangulo goiabinha = new Triangulo(12.3f, 2.5f);  // Usando o construtor com base e altura

        // Exibição dos dados do primeiro triângulo (com valores padrão)
        System.out.println(roberwando.imprimeDados());
        // Exibição dos dados do segundo triângulo (com valores fornecidos)
        System.out.println(goiabinha.imprimeDados());

        System.out.println("============================");

        // Criação de um objeto da classe Data com a data atual
        Data hoje = new Data();  // Usando o construtor que pega a data do sistema
        System.out.println(hoje.imprimeDados());  // Exibe a data atual

        System.out.println("=============================");

        // Criação de um objeto da classe Data com valores fornecidos pelo usuário
        Data combinada = new Data();  // Criação do objeto com o construtor padrão
        combinada.cadastra_Data();  // Cadastra os dados da data manualmente via entrada do usuário
        System.out.println(combinada.imprimeDados());  // Exibe a data cadastrada

    }
}
