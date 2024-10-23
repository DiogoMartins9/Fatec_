/**
 *  Escreva uma classe em Java que simule uma calculadora bem simples. Essa 
 *  classe deve ter como atributos duas variáveis double e um char. Deve possuir um 
 *  construtor que recebe como parâmetro dois números e um caracter, 
 *  correspondente a uma das operações básicas (+, -, *, /). Deve ter um método para 
 *  calcular a operação desejada e um para imprimir o resultado. O programa deve 
 *  considerar divisões por zero como sendo erros, e imprimir uma mensagem 
 *  adequada. 
 */

package ex3;

/**
 * @author 
 */

public class Calculadora {
    String operacao; // Ao desenvolver o restante do algoritmo, não foi possível utilizar char.
    double numero1;
    double numero2;
    double resultado;
    
    public Calculadora(String oper, double num1, double num2) {
        operacao = oper;
        numero1 = num1;
        numero2 = num2;        
    }
    
    public void somar() {
        resultado = numero1 + numero2;
    }
    
    public void subtrair() {
        resultado = numero1 - numero2;
    }
    
    public void multiplicar() {
        resultado = numero1 * numero2;
    }
    
    public void dividir() {
        resultado = numero1 / numero2;
    }
        
    public double imprimirResultado() {
        return resultado;
    }
}