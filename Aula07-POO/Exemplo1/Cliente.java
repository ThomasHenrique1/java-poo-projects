package Exemplo1;

public class Cliente extends Pessoa {
    private float valorDivida;

    // Construtor padrão
    public Cliente(){}

    // Construtor com parâmetros
    Cliente(String n, String f, float v){
        // Inicializa os atributos usando os parâmetros fornecidos
    }

    // Método abstrato da classe pai Pessoa
    @Override
    public void print(){
        // Implementação do método print() específico para Cliente
    }

    // Getter para valorDivida
    public float getValorDivida() {
        return valorDivida;
    }

    // Setter para valorDivida
    public void setValorDivida(float valorDivida) {
        this.valorDivida = valorDivida;
    }

    // Calcula e retorna juros baseado em um valor fornecido
    public float calculaJuros(float x){
        return x; // Implementação simplificada, deve ser ajustada conforme a lógica de juros
    }
}
