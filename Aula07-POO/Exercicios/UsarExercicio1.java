package Exercicios;

import javax.swing.*;

public class UsarExercicio1 {
    public static void main(String[] args) {
        // Criação dos objetos das classes
        Triangulo t = new Triangulo();
        Circuferencia Cf = new Circuferencia();
        Retangulo Rt = new Retangulo();

        // Solicita e define o raio da circunferência
        Cf.setRaio(Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o Raio da circunferência: ")));
        Cf.mostra(); // Exibe os dados da circunferência

        // Solicita e define a altura e a base do retângulo
        Rt.setAltura(Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a altura do retângulo: ")));
        Rt.setBase(Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a base do retângulo: ")));
        Rt.mostra(); // Exibe os dados do retângulo

        // Solicita e define a altura e a base do triângulo
        t.setAltura(Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a altura do triângulo: ")));
        t.setBase(Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a base do triângulo: ")));
        t.mostra(); // Exibe os dados do triângulo
    }
}
