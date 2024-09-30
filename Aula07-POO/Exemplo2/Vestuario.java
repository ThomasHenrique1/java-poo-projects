package Exemplo2;

public class Vestuario extends Produto {
    private String nome;     // Nome do vestuário
    private String cor;      // Cor do vestuário
    private String tamanho;  // Tamanho do vestuário

    // Construtor padrão
    Vestuario() {
        // Inicializa o objeto sem valores específicos
    }

    // Construtor com parâmetros
    Vestuario(String c, String d, float v, String n, String fco, String t) {
        // Inicializa os atributos com valores fornecidos
    }

    // Método para imprimir detalhes do vestuário
    @Override
    public void print() {
        // Implementação do método print() para a classe Vestuario
    }

    // Getter para nome
    public String getNome() {
        return nome;
    }

    // Setter para nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter para cor
    public String getCor() {
        return cor;
    }

    // Setter para cor
    public void setCor(String cor) {
        this.cor = cor;
    }

    // Getter para tamanho
    public String getTamanho() {
        return tamanho;
    }

    // Setter para tamanho
    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
}
