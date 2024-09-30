public class Trabalhador {
    // Atributos da classe
    private String nome;
    private float salario;

    // Construtor padrão
    public Trabalhador() {
        setNome(new String("Sem-nome"));  // Define nome padrão
        setSalario(0);  // Define salário padrão
    }

    // Construtor com parâmetros
    public Trabalhador(String inNome, float inSalario) {
        setNome(inNome);  // Define nome informado
        setSalario(inSalario);  // Define salário informado
    }

    // Exibe informações do trabalhador
    public void mostra() {
        System.out.print(getNome());
        System.out.print(", mensal: R$" + getSalario());
        System.out.print(", anual: R$ " + calculaSalarioAnual());
    }

    // Calcula o salário anual
    public float calculaSalarioAnual() {
        return (getSalario() * 13 + getSalario() / 3);  // Inclui décimo terceiro e 1/3 de férias
    }

    // Getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
