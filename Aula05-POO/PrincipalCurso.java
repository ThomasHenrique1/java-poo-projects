import java.util.Scanner;

public class PrincipalCurso {
    public static void main(String[] args) {
        // Cria uma instância de Curso usando o construtor vazio
        Curso x = new Curso();
        // Coleta os dados do curso e imprime as informações
        x.cadastraCurso();
        x.imprimiDados();
        x.calculaTotalMensalidade(); // Este método é chamado, mas seu resultado não é usado

        // Declara variáveis para os dados do curso
        String n;
        int q;
        String t;
        float m;

        // Coleta os dados do curso através do Scanner
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite o nome do curso: ");
            n = scanner.nextLine(); // usa nextLine() para permitir nomes com espaços

            System.out.println("Digite a turma: ");
            t = scanner.nextLine(); // usa nextLine() para permitir turmas com espaços

            System.out.println("Digite a quantidade de alunos: ");
            q = scanner.nextInt();

            System.out.println("Digite o valor da mensalidade: ");
            m = scanner.nextFloat();
        }
        
        // Cria uma nova instância de Curso com os dados coletados
        Curso xp = new Curso(n, q, t, m);
        // Imprime os dados do novo curso
        xp.imprimiDados();
    }
}
