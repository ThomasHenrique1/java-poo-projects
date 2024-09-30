public class Produto {
    // Atributos da classe Produto
    String marca;        // Marca do produto
    String fabricante;   // Fabricante do produto
    String cod_barras;   // Código de barras do produto
    float preco;         // Preço do produto

    // Construtor padrão (vazio)
    Produto() {
        // Construtor vazio
    }

    // Construtor com parâmetros
    Produto(String m, String f, String c, float p) {
        marca = m;          // Define a marca do produto
        fabricante = f;     // Define o fabricante do produto
        cod_barras = c;     // Define o código de barras do produto
        preco = p;          // Define o preço do produto
    }
}
