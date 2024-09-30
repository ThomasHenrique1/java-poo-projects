import javax.swing.*;

public class UsaVendedor {
    public static void main(String[] args) {
        // Cria uma instância do vendedor e define seus atributos através da entrada do usuário
        Vendedor x = new Vendedor();
        x.setNome(JOptionPane.showInputDialog(null, "Digite seu nome: "));
        x.setFalta(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de faltas que você possui: ")));
        x.setSalario(Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a quantia do seu salario: ")));
        x.setVendas(Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o total de vendas realizadas: ")));
        x.calcularSalario(); // Calcula o salário baseado nas vendas e faltas
        x.imprimirDados();  // Imprime os dados do vendedor

        // Cria uma segunda instância do vendedor com valores predefinidos
        Vendedor y = new Vendedor();
        y.setSalario(1000);
        y.setVendas(2500);
        y.setFalta(2);
        y.setNome("Vanderlei");
        y.calcularSalario(); // Calcula o salário baseado nas vendas e faltas
        y.imprimirDados();  // Imprime os dados do vendedor
    }
}
