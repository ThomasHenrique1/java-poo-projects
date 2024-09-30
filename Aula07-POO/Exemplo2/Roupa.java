package Exemplo2;

public class Roupa extends Vestuario {
    private String tecido; // Tipo de tecido da roupa

    // Construtor padrão
    Roupa() {
        // Inicializa o objeto sem valores específicos
    }

    // Construtor com parâmetros
    Roupa(int c, String d, float v, String fco, String t, String te) {
        // Inicializa os atributos com valores fornecidos
    }

    // Método para imprimir detalhes da roupa
    @Override
    public void print() {
        // Implementação do método print() para a classe Roupa
    }

    // Getter para tecido
    public String getTecido() {
        return tecido;
    }

    // Setter para tecido
    public void setTecido(String tecido) {
        this.tecido = tecido;
    }
}
