package Exercicios;

public class Triangulo extends Forma {
    private float base, altura;

    // Construtor padrão
    public Triangulo() {
    }

    // Construtor com parâmetros
    public Triangulo(float b, float h) {
        base = b;
        altura = h;
    }

    // Métodos de acesso
    public float getBase() { 
        return base; 
    }

    public float getAltura() { 
        return altura; 
    }

    public void setBase(float b) { 
        base = b; 
    }

    public void setAltura(float h) { 
        altura = h; 
    }

    // Implementação do método para calcular a área
    @Override
    public float area() {
        return (base * altura) / 2;
    }

    // Exibe as informações do triângulo
    @Override
    public void mostra() {
        System.out.println("\nBase: " + base + "\nAltura: " + altura + "\nÁrea: " + area());
    }
}
