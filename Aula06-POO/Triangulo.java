import javax.swing.*;

public class Triangulo {
    private double base;    // Base do triângulo
    private double altura;  // Altura do triângulo

    // Construtor padrão
    Triangulo() {}

    // Construtor com parâmetros
    Triangulo(double base, double altura) {
        setBase(base);        // Define a base
        setAltura(altura);    // Define a altura
    }

    // Calcula a área do triângulo
    public double calculaArea() {
        return ((getBase() * getAltura()) / 2);
    }

    // Exibe os dados do triângulo em uma caixa de mensagem
    void imprimiDados() {
        JOptionPane.showMessageDialog(null,
                "O triângulo possui base de " + getBase() +
                " e altura de " + getAltura() +
                "\nLogo, sua área é igual a " + calculaArea());
    }

    // Setter para a base
    public void setBase(double base) {
        this.base = base;
    }

    // Getter para a base
    public double getBase() {
        return base;
    }

    // Getter para a altura
    public double getAltura() {
        return altura;
    }

    // Setter para a altura
    public void setAltura(double altura) {
        this.altura = altura;
    }
}
