package Exercicios;

public class Analista extends Empregado {

    private float[] valorPorProjeto; // Valores de remuneração por projeto

    // Calcula o salário total como a soma dos valores por projeto
    public float calculaSalario() {
        float salario = 0;
        for (int i = 0; i < valorPorProjeto.length; i++) {
            salario += valorPorProjeto[i];
        }
        return salario;
    }

    // Construtor padrão
    Analista() {
        // Inicializa o objeto sem valores específicos
    }

    // Construtor com parâmetros
    Analista(String nome, String matricula, float[] valorPorProjeto) {
        super(nome, matricula); // Chama o construtor da classe pai
        this.setValorPorProjeto(valorPorProjeto); // Inicializa valorPorProjeto
    }

    // Getter para valorPorProjeto
    public float[] getValorPorProjeto() {
        return valorPorProjeto;
    }

    // Setter para valorPorProjeto
    public void setValorPorProjeto(float[] valorPorProjeto) {
        this.valorPorProjeto = valorPorProjeto;
    }
}
