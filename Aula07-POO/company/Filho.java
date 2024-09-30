
// A classe Filho estende a classe pai
public class Filho extends pai {

    // Método para imprimir os valores dos atributos herdados
    public void imprimiFilho() {
        System.out.println("Valor de a: " + a); // Acessa e imprime o atributo protegido 'a' da classe pai
        System.out.println("Valor de b: " + b); // Acessa e imprime o atributo protegido 'b' da classe pai
        // System.out.println("Valor de c: " + c); // Erro de compilação: 'c' é um atributo privado da classe pai e não pode ser acessado
    }
}
