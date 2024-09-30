package company;

import javax.swing.*;

public class UsaTriangulo {
    public static void main(String[] args) {
        // Cria instâncias de Triangulo
        Triangulo x = new Triangulo();
        Triangulo y = new Triangulo(2.5, 3.8);

        // Solicita e define a altura e base do triângulo x
        x.setAltura(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a altura do triângulo: ")));
        x.setBase(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a base do triângulo: ")));

        // Define altura e base do triângulo y e exibe os dados
        y.setAltura(22);
        y.setBase(44);
        y.imprimiDados();

        // Define nova altura e base para o triângulo x e exibe os dados
        x.setAltura(33);
        x.setBase(11);
        x.imprimiDados();
    }
}
