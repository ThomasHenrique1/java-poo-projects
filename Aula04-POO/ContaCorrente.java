import java.util.Scanner;

public class ContaCorrente {

    // Atributos da classe ContaCorrente
    String nome;   // Nome do titular da conta
    float saldo;   // Saldo disponível na conta
    float limite;  // Limite da conta
    char tipo;     // Tipo de conta (ex: 'C' para conta corrente, 'P' para poupança)

    // Construtor padrão (vazio)
    ContaCorrente() {
        // Construtor vazio
    }

    // Construtor com parâmetros (nome, saldo, limite, tipo)
    ContaCorrente(String n, float s, float l, char t) {
        nome = n;    // Define o nome do titular
        saldo = s;   // Define o saldo da conta
        limite = l;  // Define o limite da conta
        tipo = t;    // Define o tipo de conta
    }

    // Construtor com parâmetros (nome, saldo, tipo) sem limite
    ContaCorrente(String n, float s, char t) {
        nome = n;    // Define o nome do titular
        saldo = s;   // Define o saldo da conta
        tipo = t;    // Define o tipo de conta
    }

    // Método para imprimir os dados da conta
    String imprimeDados() {
        String relatorio = "";
        relatorio = relatorio + "Cliente: " + nome;
        relatorio = relatorio + "\nSaldo: " + saldo;
        relatorio = relatorio + "\nLimite: " + limite;
        relatorio = relatorio + "\nTipo: " + tipo;
        return relatorio;
    }

    // Método para sacar um valor da conta
    void sacar(float x) {
        saldo = saldo - x;  // Subtrai o valor sacado do saldo
    }

    // Método para depositar um valor na conta
    void depositar(float x) {
        saldo = saldo + x;  // Adiciona o valor depositado ao saldo
    }

    // Método para cadastrar dados da conta via entrada do usuário
    void cadastra_Dados() {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome: ");
        nome = scanner.next();  // Entrada do nome
        System.out.print("Digite o saldo: ");
        saldo = scanner.nextFloat();  // Entrada do saldo
        System.out.print("Digite o limite: ");
        limite = scanner.nextFloat();  // Entrada do limite
        System.out.println("Digite o tipo de conta: ");
        tipo = (scanner.next()).charAt(0);  // Entrada do tipo de conta (apenas um caractere)
    }
}
