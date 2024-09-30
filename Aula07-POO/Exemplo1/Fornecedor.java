package Exemplo1;

public class Fornecedor extends Pessoa {
    private float valorCompra;

    // Construtor padrão
    Fornecedor(){}

    // Construtor com parâmetros
    Fornecedor(String n, String f, float vc){
        // Inicializa os atributos usando os parâmetros fornecidos
    }

    // Método abstrato da classe pai Pessoa
    @Override
    public void print(){
        // Implementação do método print() específico para Fornecedor
    }

    // Calcula e aplica imposto com base em um valor fornecido
    public void calculaImposto(float imposto){
        // Implementação para calcular e aplicar o imposto
    }

    // Getter para valorCompra
    public float getValorCompra() {
        return valorCompra;
    }

    // Setter para valorCompra
    public void setValorCompra(float valorCompra) {
        this.valorCompra = valorCompra;
    }
}
