package Exemplo2;

public class Produto {
    private int codigo; // Código do produto
    private String descricao; // Descrição do produto
    private float valor; // Valor do produto

    // Construtor padrão
    Produto() {
        // Inicializa o objeto sem valores específicos
    }

    // Construtor com parâmetros
    Produto(int c, String d, float v) {
        // Inicializa os atributos com valores fornecidos
    }

    // Método para imprimir detalhes do produto
    public void print() {
        // Implementação do método print() para a classe Produto
    }

    // Getter para código
    public int getCodigo() {
        return codigo;
    }

    // Setter para código
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    // Getter para descrição
    public String getDescricao() {
        return descricao;
    }

    // Setter para descrição
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    // Getter para valor
    public float getValor() {
        return valor;
    }

    // Setter para valor
    public void setValor(float valor) {
        this.valor = valor;
    }
}
