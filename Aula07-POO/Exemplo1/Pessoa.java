package Exemplo1;

public class Pessoa {
    private String nome;
    private String fone;

    // Construtor padrão
    public Pessoa() {
        // Inicializa os atributos com valores padrão (null)
    }

    // Construtor com parâmetros
    public Pessoa(String n, String f) {
        nome = n;
        fone = f;
    }

    // Método para imprimir detalhes da pessoa
    public void print() {
        System.out.println("Nome: " + nome);
        System.out.println("Telefone: " + fone);
    }

    // Getter para nome
    public String getNome() {
        return nome;
    }

    // Setter para nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter para telefone
    public String getFone() {
        return fone;
    }

    // Setter para telefone
    public void setFone(String fone) {
        this.fone = fone;
    }
}
