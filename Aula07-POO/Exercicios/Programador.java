package Exercicios;

import javax.swing.*;

public class Programador extends Empregado {
    private float qtdeHoras;  // Quantidade de horas trabalhadas
    private float valorHora;  // Valor por hora trabalhada

    // Calcula o salário com base na quantidade de horas e valor por hora
    public float calculaSalario() {
        Float valores;
        valores = getValorHora() * getQtdeHoras();

        // Exibe uma mensagem com o nome, matrícula e salário calculado
        JOptionPane.showMessageDialog(null, "Seu nome é: " + getNome() + "\n" +
                "Sua matrícula é: " + getMatricula() + "\n" +
                "O valor do seu salário será de: " + valores);

        return valores;
    }

    // Construtor padrão
    Programador() {
    }

    // Construtor com parâmetros
    Programador(String nome, String matricula, float qtdeHoras, float valorHora) {
        super(nome, matricula);
        this.qtdeHoras = qtdeHoras;
        this.valorHora = valorHora;
    }

    public float getQtdeHoras() {
        return qtdeHoras;
    }

    public void setQtdeHoras(float qtdeHoras) {
        this.qtdeHoras = qtdeHoras;
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }
}
