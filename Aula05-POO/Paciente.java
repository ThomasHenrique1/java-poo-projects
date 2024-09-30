import java.util.Date;
import java.util.Scanner;

public class Paciente {
    String nome;          // Nome do paciente
    String rg;            // Registro Geral (identidade) do paciente
    String endereco;      // Endereço do paciente
    String telefone;      // Telefone de contato do paciente
    int anoNascimento;    // Ano de nascimento do paciente
    int mesNascimento;    // Mês de nascimento do paciente
    int diaNascimento;    // Dia de nascimento do paciente
    String profissao;     // Profissão do paciente

    public int dia;       // Dia de um evento (não utilizado)
    public int mes;       // Mês de um evento (não utilizado)

    // Construtor vazio
    Paciente() {
        // Construtor vazio
    }

    // Construtor com nome
    Paciente(String n) {
        nome = n;
    }

    // Método para cadastrar os dados do paciente
    public void cadastraDados() {
        try (Scanner scanner = new Scanner(System.in)) {
            // Solicita e armazena os dados do paciente
            System.out.println("Digite o nome do paciente: ");
            nome = scanner.nextLine();

            System.out.println("Digite o RG do paciente: ");
            rg = scanner.nextLine();

            System.out.println("Digite o endereço: ");
            endereco = scanner.nextLine();

            System.out.println("Digite o telefone: ");
            telefone = scanner.nextLine();

            System.out.println("Digite a profissão do paciente: ");
            profissao = scanner.nextLine();

            System.out.println("Digite o dia do nascimento do paciente: ");
            diaNascimento = scanner.nextInt();

            System.out.println("Digite o mês do nascimento do paciente: ");
            mesNascimento = scanner.nextInt();

            System.out.println("Digite o ano de nascimento do paciente: ");
            anoNascimento = scanner.nextInt();
        }
    }

    // Método para imprimir os dados do paciente
    public void imprimiDados() {
        // Imprime as informações do paciente
        System.out.println("O nome do paciente é: " + nome);
        System.out.println("O RG do paciente é: " + rg);
        System.out.println("O endereço do paciente é: " + endereco);
        System.out.println("O telefone do paciente é: " + telefone);
        System.out.println("A profissão do paciente é: " + profissao);
        System.out.println("A data de nascimento do paciente é: " + diaNascimento + "/" + mesNascimento + "/" + anoNascimento);
        System.out.println("O paciente possui " + calculaIdade(diaNascimento, mesNascimento, anoNascimento) + " dias de vida!");
    }

    // Método para calcular a idade em dias
    @SuppressWarnings("deprecation") // Suppressão para evitar aviso sobre o uso de métodos descontinuados
    public int calculaIdade(int d, int m, int a) {
        Date x = new Date();  // Cria uma instância de Data para obter a data atual

        a = x.getYear() + 1900;  // Obtém o ano atual

        int calculoTotal;
        int calculo;

        // Calcula a diferença de anos
        calculo = a - anoNascimento;

        // Calcula a idade total em dias
        calculoTotal = calculo * 365 + mesNascimento * 30 + diaNascimento;

        return calculoTotal;
    }
}
