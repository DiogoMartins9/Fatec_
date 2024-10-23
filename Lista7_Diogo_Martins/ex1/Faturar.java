/**
 *  Crie uma classe chamada Faturar que possa ser utilizado por uma loja de 
 *  suprimentos de informática para representar uma fatura de um item vendido na 
 *  loja. Uma fatura deve incluir as seguintes informações como atributos: 
 *      • o número do item faturado,
 *      • a descrição do item,
 *      • a quantidade comprada do item e 
 *      • o preço unitário do item. 
 * 
 *  Sua classe deve ter um construtor que inicialize os quatro atributos. Se a 
 *  quantidade não for positiva, ela deve ser configurada como 0. Se o preço por item 
 *  não for positivo ele deve ser configurado como 0.
 *  Forneça um método set e um método get para cada variável de instância. Além 
 *  disso, forneça um método chamado getFaturarTotal que calcula o valor da fatura 
 *  (isso é, multiplica a quantidade pelo preço por item) e depois retorna o valor como 
 *  um double.
 * 
 *  Escreva um aplicativo de teste que demonstra as capacidades da classe Faturar.
 */

package ex1;

/**
 * @author 
 */

public class Faturar {
    int numero;
    String descricao;
    int quantidade;
    double preco;
    
    public Faturar(int num, String descr, int qtd, double prec) {
        numero = num;
        descricao = descr;
        
        quantidade = qtd < 0 ? 0 : qtd;        
        preco = prec < 0 ? 0.00 : prec;
    }
    
    // Número do item faturado.
    public void setNumero(int num) {
        numero = num;
    }
    
    public int getNumero() {
        return numero;
    }
    
    // Descrição do item.
    public void setDescricao(String descr) {
        descricao = descr;
    }
    
    public String getDescricao() {
        return descricao;
    }
    
    // Quantidade comprada do item.
    public void setQuantidade(int qtd) {
        quantidade = qtd;
    }
    
    public int getQuantidade() {
        return quantidade;
    }
    
    // Preço unitário do item.
    public void setPreco(double prec) {
        preco = prec;    
    }
    
    public double getPreco() {
        return preco;
    }
    
    // Retorna o valor total.
    public double getFaturarTotal() {
        return getPreco() * getQuantidade();
    }
}