package Exercicios;

public abstract class Forma {

    // Método abstrato para calcular a área, deve ser implementado pelas subclasses
    public abstract float area();

    // Método abstrato para exibir informações sobre a forma, deve ser implementado pelas subclasses
    public abstract void mostra();

    // Método opcional para calcular o perímetro, retorna 0 por padrão
    public float perimetro() {
        return 0f;
    }
}
