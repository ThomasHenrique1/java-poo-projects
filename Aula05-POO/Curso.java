import java.util.Scanner;

public class Curso {
    // Atributos da classe Curso
    String nome;               // Nome do curso
    int quantidadedealunos;    // Quantidade de alunos matriculados
    String turma;              // Turma ou turma do curso
    float mensalidade;         // Valor da mensalidade do curso

    // Construtor vazio - inicializa um curso sem dados
    Curso() {
        // Construtor padrão sem parâmetros
    }

    // Construtor com parâmetros - inicializa um curso com dados fornecidos
    Curso(String n, int q, String t, float m) {
        nome = n;               // Atribui o nome do curso
        quantidadedealunos = q; // Atribui a quantidade de alunos
        turma = t;              // Atribui a turma
        mensalidade = m;        // Atribui o valor da mensalidade
    }

    // Método para cadastrar os dados do curso via entrada do usuário
    public void cadastraCurso() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite o nome do curso: ");
            nome = scanner.nextLine();  // Recebe o nome do curso

            System.out.println("Digite a turma: ");
            turma = scanner.nextLine(); // Recebe a turma

            System.out.println("Digite a quantidade de alunos: ");
            quantidadedealunos = scanner.nextInt(); // Recebe a quantidade de alunos

            System.out.println("Digite o valor da mensalidade: ");
            mensalidade = scanner.nextFloat(); // Recebe o valor da mensalidade
        }
    }

    // Método para imprimir os dados do curso
    public void imprimiDados() {
        System.out.println("O nome do curso é: " + nome);
        System.out.println("A turma é: " + turma);
        System.out.println("A quantidade de alunos é de: " + quantidadedealunos);
        System.out.println("O valor da mensalidade do curso é: " + mensalidade);
        System.out.println("O valor anual deste curso é de R$: " + calculaTotalMensalidade());
    }

    // Método para calcular o valor anual da mensalidade
    public float calculaTotalMensalidade() {
        float valorAnual = mensalidade * 12; // Multiplica a mensalidade por 12 para obter o valor anual
        return valorAnual;  // Retorna o valor anual
    }
}
