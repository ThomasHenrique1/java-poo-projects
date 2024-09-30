package Exercicios;

import javax.swing.*;

public class Circuferencia extends Forma {
    private float raio; // Raio da circunferência

    // Construtor padrão
    public Circuferencia() {
        // Inicializa o objeto sem valores específicos
    }

    // Construtor com parâmetro para inicializar o raio
    Circuferencia(float raio) {
        this.raio = raio;
    }

    // Calcula a área da circunferência
    public float area() {
        Double area;
        area = Math.PI * (getRaio() * getRaio()); // Fórmula da área
        return area.floatValue();
    }

    // Calcula o perímetro da circunferência
    public float perimetro() {
        Double perimetro;
        perimetro = 2 * Math.PI * raio; // Fórmula do perímetro
        return perimetro.floatValue();
    }

    // Mostra área e perímetro em uma caixa de diálogo
    public void mostra() {
        JOptionPane.showMessageDialog(null,
                "O valor da área da circunferência é de: " + area() + "\n"
                + "O valor do perímetro da circunferência é de: " + perimetro());
    }

    // Getter para raio
    public float getRaio() {
        return raio;
    }

    // Setter para raio
    public void setRaio(float raio) {
        this.raio = raio;
    }
}
