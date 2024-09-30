package Exemplo2;

public class Calcado extends Vestuario {
    private String materialsola; // Material da sola do calçado
    private String materialpartesupeerior; // Material das partes superiores do calçado
    private String materialinterno; // Material interno do calçado

    // Construtor padrão
    Calcado() {
        // Inicializa o objeto sem valores específicos
    }

    // Construtor com parâmetros
    Calcado(int c, String d, float v, String co, String t, String ms, String mps, String mi) {
        // Inicializa os atributos com valores fornecidos
    }

    // Método para imprimir detalhes do calçado
    @Override
    public void print() {
        // Implementação do método print() para a classe Calcado
    }

    // Getter para materialsola
    public String getMaterialsola() {
        return materialsola;
    }

    // Setter para materialsola
    public void setMaterialsola(String materialsola) {
        this.materialsola = materialsola;
    }

    // Getter para materialpartesupeerior
    public String getMaterialpartesupeerior() {
        return materialpartesupeerior;
    }

    // Setter para materialpartesupeerior
    public void setMaterialpartesupeerior(String materialpartesupeerior) {
        this.materialpartesupeerior = materialpartesupeerior;
    }

    // Getter para materialinterno
    public String getMaterialinterno() {
        return materialinterno;
    }

    // Setter para materialinterno
    public void setMaterialinterno(String materialinterno) {
        this.materialinterno = materialinterno;
    }
}
