public class Triangulo {
    float base;   // Atributo para armazenar a base do triângulo
    float altura; // Atributo para armazenar a altura do triângulo

    // Construtor vazio, inicializa um triângulo sem valores
    Triangulo() {
        // Construtor padrão sem parâmetros
    }

    // Construtor que recebe base e altura como parâmetros
    Triangulo(float b, float a) {
        base = b;      // Atribui o valor de b para a base
        altura = a;    // Atribui o valor de a para a altura
    }

    // Método para calcular a área do triângulo
    float calculaArea() {
        return (base * altura / 2);  // Fórmula da área do triângulo: (base * altura) / 2
    }

    // Método que retorna os dados do triângulo em formato de texto
    String imprimeDados() {
        String relatorio = "";

        // Adiciona a base, altura e área no relatório
        relatorio = relatorio + "A base é igual a: " + base;
        relatorio = relatorio + "\nA altura é igual a: " + altura;
        relatorio = relatorio + "\nA área é igual a: " + calculaArea();
        return relatorio;  // Retorna o relatório contendo as informações do triângulo
    }
}
