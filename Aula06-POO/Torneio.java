import javax.swing.JOptionPane;

public class Torneio {
    String nome;    // Nome do participante
    int idade;      // Idade do participante

    // Construtor padrão
    Torneio() {
    }

    // Construtor com parâmetros
    Torneio(String nome, int idade) {
        setIdade(idade);  // Define a idade
        setNome(nome);    // Define o nome
    }

    // Verifica a categoria do participante com base na idade
    String verificaCategoria() {
        String categoria = "";
        if (idade >= 5 && idade <= 7)
            categoria = "Infantil";
        else if (idade >= 8 && idade <= 10)
            categoria = "Juvenil";
        else if (idade >= 11 && idade <= 15)
            categoria = "Adolescente";
        else if (idade >= 16 && idade <= 30)
            categoria = "Adulto";
        else
            categoria = "Sênior";

        return categoria;
    }

    // Exibe os dados do participante em uma caixa de mensagem
    void ImprimiDados() {
        JOptionPane.showMessageDialog(null, "Seu nome é: " + getNome()
                + "\nVocê tem: " + getIdade() + " anos" 
                + "\nVocê pertence à categoria: " + verificaCategoria());
    }

    // Getter para a idade
    public int getIdade() {
        return idade;
    }

    // Setter para a idade
    public void setIdade(int idade) {
        this.idade = idade;
    }

    // Getter para o nome
    public String getNome() {
        return nome;
    }

    // Setter para o nome
    public void setNome(String nome) {
        this.nome = nome;
    }
}
