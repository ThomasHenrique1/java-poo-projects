import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        // Inicia o Scanner para entrada de dados
        @SuppressWarnings("resource")
        Scanner pc = new Scanner(System.in);

        // Criação de um objeto da classe Paciente
        Paciente x, y;
        x = new Paciente();

        // Entrada de dados para o primeiro paciente
        System.out.println("Digite os dados do paciente:");
        System.out.println("Digite o nome do paciente:");
        x.nome = pc.next();
        System.out.println("Digite a data de nascimento do paciente:");
        x.dataNascimento = pc.next();
        System.out.println("Digite o RG do paciente:");
        x.rg = pc.next();
        System.out.println("Digite o telefone do paciente:");
        x.telefone = pc.next();
        System.out.println("Digite a profissão do paciente:");
        x.profissao = pc.next();
        System.out.println("Digite o endereço do paciente:");
        x.endereco = pc.next();

        // Exibe os dados do primeiro paciente
        System.out.println("Prontuário do Paciente:");
        System.out.println("Nome: " + x.nome);
        System.out.println("Data de Nascimento: " + x.dataNascimento);
        System.out.println("RG: " + x.rg);
        System.out.println("Telefone: " + x.telefone);
        System.out.println("Profissão: " + x.profissao);
        System.out.println("Endereço: " + x.endereco);

        // Entrada de dados para o próximo paciente
        System.out.print("Digite os dados do próximo paciente: ");
        @SuppressWarnings("resource")
        Scanner pc2 = new Scanner(System.in);
        y = new Paciente(pc2.nextLine());  // Cria um novo objeto paciente com entrada inicial

        // Entrada dos dados do segundo paciente
        System.out.println("Digite o nome do paciente:");
        y.nome = pc2.next();
        y.dataNascimento = pc2.next();
        y.rg = pc2.next();
        y.telefone = pc2.next();
        y.profissao = pc2.next();
        y.endereco = pc2.next();

        // Exibe o nome do próximo paciente
        System.out.println("O nome do próximo paciente é: " + y.nome);
    }
}
