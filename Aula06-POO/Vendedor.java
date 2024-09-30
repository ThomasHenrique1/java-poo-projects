import javax.swing.*;

public class Vendedor {
    private float vendas;
    private float salario;
    private String nome;
    private int falta;

    // Construtor vazio
    Vendedor() {}

    // Construtor com parâmetros para inicializar o vendedor
    Vendedor(float v, float s, String n, int f) {
        setFalta(f);
        setNome(n);
        setVendas(v);
        setSalario(s);
    }

    // Exibe os dados do vendedor em uma caixa de diálogo
    void imprimirDados() {
        JOptionPane.showMessageDialog(null,
                "Seu nome é: " + getNome() +
                        "\nVocê faltou: " + getFalta() +
                        "\nVocê conseguiu vender mais de: " + getVendas() +
                        "\nSeu salario é de: " + getSalario() +
                        "\nSeu salario irá vir com uma comissão de: " + calcularComissao() +
                        "\nSerá descontado: " + descontoFalta() + " pelo tanto de vezes que você faltou!");
    }

    // Calcula o salário final do vendedor considerando a comissão e o desconto por faltas
    public void calcularSalario() {
        salario = (getSalario() + calcularComissao() - descontoFalta());
    }

    // Calcula a comissão com base nas vendas
    public float calcularComissao() {
        double comissao;
        if (getVendas() >= 1000 && getVendas() <= 2000)
            comissao = getVendas() * 0.1;
        else
            comissao = getVendas() * 0.15;

        return (float) comissao;
    }

    // Calcula o desconto no salário por faltas
    public float descontoFalta() {
        float desconto;
        desconto = (getSalario() / 30) * getFalta();
        return desconto;
    }

    // Métodos getter e setter para os atributos
    public void setNome(String n) {
        this.nome = n;
    }

    public String getNome() {
        return nome;
    }

    public void setSalario(float s) {
        this.salario = s;
    }

    public float getSalario() {
        return salario;
    }

    public float getVendas() {
        return vendas;
    }

    public void setVendas(float v) {
        this.vendas = v;
    }

    public int getFalta() {
        return falta;
    }

    public void setFalta(int f) {
        this.falta = f;
    }
}
