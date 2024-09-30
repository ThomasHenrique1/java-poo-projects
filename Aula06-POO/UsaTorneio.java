import javax.swing.*;

public class UsaTorneio {
    public static void main(String[] args) {
        // Cria uma instância de Torneio
        Torneio x = new Torneio();

        // Solicita e define o nome do usuário
        x.setNome(JOptionPane.showInputDialog(null, "Digite seu nome: "));

        // Solicita e define a idade do usuário
        x.setIdade(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a sua idade: ")));

        // Exibe os dados do torneio
        x.ImprimiDados();
    }
}
