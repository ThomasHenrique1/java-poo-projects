package Exercicios;

import javax.swing.*;
import java.util.Scanner;

public class UsarExercicio2 {
    public static void main(String[] args) {

        // Criação e configuração do objeto Programador
        Programador pg = new Programador();
        pg.setNome(JOptionPane.showInputDialog(null, "Digite o seu nome: "));
        pg.setMatricula(JOptionPane.showInputDialog(null, "Digite a sua matrícula: "));
        pg.setQtdeHoras(Float.parseFloat(JOptionPane.showInputDialog(null, "Digite quantas horas você trabalhou: ")));
        pg.setValorHora(Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o valor da sua hora: ")));
        pg.calculaSalario(); // Calcula e exibe o salário do Programador

        // Criação e configuração do objeto Analista
        try (Scanner ler = new Scanner(System.in)) {
            System.out.println("Digite o seu Nome:");
            String nome = ler.next();

            System.out.println("Digite a sua Matrícula:");
            String matricula = ler.next();

            System.out.println("Digite a quantidade de projetos realizados:");
            int cont = ler.nextInt();

            float[] valor = new float[cont];
            for (int i = 0; i < cont; i++) {
                System.out.println("Digite o valor do " + (i + 1) + "º projeto");
                valor[i] = ler.nextFloat();
            }

            Analista an = new Analista(nome, matricula, valor);
            float totalSalario = an.calculaSalario(); // Calcula o salário total do Analista
            System.out.println("-------------------------------------------------------"
                    + "\nNome: " + nome
                    + "\nMatrícula: " + matricula
                    + "\nSalário Total: " + totalSalario);
        }
    }
}
