public class Fatura {
    float valor;      // Valor da fatura
    int pontuacao;    // Pontuação associada à fatura

    // Método para somar uma pontuação à fatura atual
    public Fatura somaCom(int pont) {
        // Cria uma nova instância de Fatura
        Fatura x = new Fatura();
        
        // Define a pontuação da nova fatura com o valor fornecido
        x.pontuacao = pont;
        
        // Retorna a nova fatura com a pontuação ajustada
        return x;
    }

    // Método para somar uma pontuação e um valor à fatura atual
    public Fatura somaCom(int pont, float val) {
        // Cria uma nova instância de Fatura
        Fatura x = new Fatura();
        
        // Define o valor e a pontuação da nova fatura com os valores fornecidos
        x.valor = val;
        x.pontuacao = pont;
        
        // Retorna a nova fatura com o valor e a pontuação ajustados
        return x;
    }

    // Método para somar os valores e a pontuação de uma fatura fornecida
    public Fatura somaCom(Fatura fat) {
        // Define a pontuação e o valor da fatura fornecida com valores fixos
        fat.pontuacao = 100;
        fat.valor = 1000;
        
        // Retorna a fatura fornecida com os valores ajustados
        return fat;
    }
}
