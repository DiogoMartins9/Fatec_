/**
 * Implemente a classe Pessoa possuindo nome, idade, altura e sexo como 
 * variáveis de instância. Construa os métodos set e get para cada variável de instância 
 * e um construtor para a classe para inicializar as variáveis de instância. Construa 
 * depois uma classe Empregado que deve ser uma subclasse da classe Pessoa
 * (herança), adicionando um novo construtor e uma variável de instância salário e os 
 * métodos set e get para o novo atributo.
 * 
 * Construa um método obterLucros que devolva o lucro (salário) do empregado. 
 * Escreva um programa de teste (classe EmpregadoTeste) adequado para esta classe 
 * testando os métodos da classe e os métodos herdados. Utilize para entrada e saída 
 * de dados a classe JOptionPane. 
 */

package ex5;

/**
 * @author 
 */

public class Empregado extends Pessoa {
    double salario;
    
    public Empregado(String nome, int idade, double altura, String sexo, double salarioMensal) {
        super(nome, idade, altura, sexo); // Chama o construtor de Pessoa
        salario = salarioMensal;
    }
    
    public void setSalario(double salarioMensal) {
        salario = salarioMensal;
    }
    
    public double getSalario() {
        return salario;
    }
    
    public double obterLucros() { 
        return getSalario();
    }
}