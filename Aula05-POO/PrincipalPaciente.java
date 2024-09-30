import java.util.Scanner;

public class PrincipalPaciente {
    public static void main(String[] args) {
        // Cria uma instância de Paciente e coleta os dados
        Paciente xp = new Paciente();
        xp.cadastraDados();
        xp.imprimiDados();

        // Calcula e imprime a idade do paciente
        int idadeEmDias = xp.calculaIdade(xp.diaNascimento, xp.mesNascimento, xp.anoNascimento);
        System.out.println("O paciente tem " + idadeEmDias + " dias de vida.");

        System.out.println("================================");

        // Coleta dados novamente para uma nova instância de Paciente
        String n, rg, endereco, telefone, profissao;
        int dia, mes, ano;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite o nome do paciente: ");
            n = scanner.nextLine();

            System.out.println("Digite o RG do paciente: ");
            rg = scanner.nextLine();

            System.out.println("Digite o endereço: ");
            endereco = scanner.nextLine();

            System.out.println("Digite o telefone: ");
            telefone = scanner.nextLine();

            System.out.println("Digite a profissão do paciente: ");
            profissao = scanner.nextLine();

            System.out.println("Digite o dia do nascimento do paciente: ");
            dia = scanner.nextInt();

            System.out.println("Digite o mês do nascimento do paciente: ");
            mes = scanner.nextInt();

            System.out.println("Digite o ano de nascimento do paciente: ");
            ano = scanner.nextInt();
        }

        // Cria uma nova instância de Paciente com o nome e imprime os dados
        Paciente xx = new Paciente(n);
        // Atribui os outros dados à nova instância
        xx.rg = rg;
        xx.endereco = endereco;
        xx.telefone = telefone;
        xx.profissao = profissao;
        xx.diaNascimento = dia;
        xx.mesNascimento = mes;
        xx.anoNascimento = ano;

        // Imprime os dados da nova instância
        xx.imprimiDados();
    }
}
