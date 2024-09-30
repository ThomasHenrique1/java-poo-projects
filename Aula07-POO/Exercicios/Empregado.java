package Exercicios;

public abstract class Empregado {
    private String nome;        // Nome do empregado
    private String matricula;   // Matrícula do empregado

    // Construtor padrão
    Empregado() {
        // Inicializa o objeto sem valores específicos
    }

    // Construtor com parâmetros para inicializar nome e matrícula
    Empregado(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    // Método abstrato que deve ser implementado pelas subclasses para calcular o salário
    public abstract float calculaSalario();

    // Getter para nome
    public String getNome() {
        return nome;
    }

    // Setter para nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter para matrícula
    public String getMatricula() {
        return matricula;
    }

    // Setter para matrícula
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
