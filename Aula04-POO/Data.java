import java.util.Date;
import java.util.Scanner;

public class Data {
    // Atributos da classe Data
    int dia;  // Armazena o dia
    int mes;  // Armazena o mês
    int ano;  // Armazena o ano

    // Construtor padrão que inicializa com a data atual
    @SuppressWarnings("deprecation")
    Data() {
        Date x = new Date();  // Pega a data atual do sistema
        dia = x.getDate();    // Define o dia atual
        mes = x.getMonth() + 1; // Define o mês atual (de 0 a 11, por isso soma-se 1)
        ano = x.getYear() + 1900; // Define o ano atual (inicia em 1900)
    }

    // Construtor com parâmetros para definir a data
    Data(int d, int m, int a) {
        dia = d;   // Define o dia
        mes = m;   // Define o mês
        ano = a;   // Define o ano
    }

    // Método para cadastrar uma data manualmente via entrada do usuário
    void cadastra_Data() {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o dia: ");
        dia = scanner.nextInt();  // Entrada do dia
        System.out.print("Digite o mês: ");
        mes = scanner.nextInt();  // Entrada do mês
        System.out.print("Digite o ano completo sem abreviar!: ");
        ano = scanner.nextInt();  // Entrada do ano
    }

    // Método para imprimir os dados da data
    String imprimeDados() {
        String relatorio = "";
        relatorio = relatorio + "Dia igual: " + dia;
        relatorio = relatorio + "\nMês é igual a: " + mes;
        relatorio = relatorio + "\nAno é igual a: " + ano;
        relatorio = relatorio + "\n" + dia + "/" + mes + "/" + ano; // Imprime a data no formato dd/mm/aaaa
        relatorio += "\nDia " + dia + " de " + mes_Por_Extenso() + " de " + ano; // Data por extenso
        return relatorio;
    }

    // Método que retorna o mês por extenso
    String mes_Por_Extenso() {
        String mes_por_extenso = "";
        // Switch para converter o número do mês no nome correspondente
        switch (mes) {
            case 1: mes_por_extenso = "Janeiro"; break;
            case 2: mes_por_extenso = "Fevereiro"; break;
            case 3: mes_por_extenso = "Março"; break;
            case 4: mes_por_extenso = "Abril"; break;
            case 5: mes_por_extenso = "Maio"; break;
            case 6: mes_por_extenso = "Junho"; break;
            case 7: mes_por_extenso = "Julho"; break;
            case 8: mes_por_extenso = "Agosto"; break;
            case 9: mes_por_extenso = "Setembro"; break;
            case 10: mes_por_extenso = "Outubro"; break;
            case 11: mes_por_extenso = "Novembro"; break;
            case 12: mes_por_extenso = "Dezembro"; break;
        }
        return mes_por_extenso; // Retorna o nome do mês
    }
}
