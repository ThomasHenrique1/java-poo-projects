package Exercicios;

import javax.swing.*;

public class Retangulo extends Triangulo {

    // Construtor padrão
    Retangulo() {
    }

    // Construtor com parâmetros
    Retangulo(float b, float a) {
        super(b, a);
    }

    // Calcula a área do retângulo
    @Override
    public float area() {
        float area;
        area = getBase() * getAltura();
        return area;
    }

    // Calcula o perímetro do retângulo
    public float perimetro() {
        float perimetro;
        perimetro = (getBase() + getAltura()) * 2;
        return perimetro;
    }

    // Exibe a área e o perímetro do retângulo
    public void mostra() {
        JOptionPane.showMessageDialog(null, "O valor da área é de: " + area() + "\n" +
                "O valor do perímetro é igual a: " + perimetro());
    }
}
