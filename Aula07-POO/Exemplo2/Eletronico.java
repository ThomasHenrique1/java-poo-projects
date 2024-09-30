package Exemplo2;

public class Eletronico extends Produto {
    private int voltagem; // Voltagem do eletrônico

    // Construtor padrão
    Eletronico() {
        // Inicializa o objeto sem valores específicos
    }

    // Construtor com parâmetros
    Eletronico(int c, String d, float v, int vo) {
        // Inicializa os atributos com valores fornecidos
    }

    // Método para imprimir detalhes do eletrônico
    @Override
    public void print() {
        // Implementação do método print() para a classe Eletronico
    }

    // Getter para voltagem
    public int getVoltagem() {
        return voltagem;
    }

    // Setter para voltagem
    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }
}
