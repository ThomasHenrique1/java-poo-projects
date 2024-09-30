public class Funcionario {
    private int cracha;        // Número do crachá do funcionário
    private float salario;     // Salário do funcionário
    private String cargo;      // Cargo do funcionário

    // Construtor padrão
    Funcionario(){
        setCargo("Assistente"); // Define o cargo padrão como "Assistente"
    }

    // Construtor com parâmetros
    Funcionario(int c, float s, String car){
       setCargo(car);          // Define o cargo do funcionário
       setSalario(s);         // Define o salário do funcionário
       setCracha(c);          // Define o número do crachá
    }

    // Calcula o aumento salarial com base em porcentagem
    public float calculaAumento(float porcentagem){
        return getSalario();   // Retorna o salário atual, não aplica o aumento
    }

    // Calcula o aumento com base no tempo de serviço (não implementado)
    public void calculaAumento(int tempo){
        // Implementação futura
    }

    // Getter para o número do crachá
    public int getCracha() {
        return cracha;
    }

    // Setter para o número do crachá
    public void setCracha(int cracha) {
        this.cracha = cracha;
    }

    // Getter para o salário
    public float getSalario() {
        return salario;
    }

    // Setter para o salário
    public void setSalario(float salario) {
        this.salario = salario;
    }

    // Getter para o cargo
    public String getCargo() {
        return cargo;
    }

    // Setter para o cargo
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
