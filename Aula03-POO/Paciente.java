public class Paciente {
    // Atributos da classe Paciente
    String nome;           // Nome do paciente
    String rg;             // RG do paciente
    String endereco;       // Endereço do paciente
    String telefone;       // Telefone do paciente
    String dataNascimento; // Data de nascimento do paciente
    String profissao;      // Profissão do paciente

    // Construtor padrão (vazio)
    Paciente() {
        // Construtor vazio
    }

    // Construtor com parâmetro (apenas nome)
    Paciente(String n) {
        nome = n;  // Define o nome do paciente
    }
}
