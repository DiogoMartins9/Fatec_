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

public class Pessoa {
    String nome;
    int idade;
    double altura;
    String sexo;
    
    public Pessoa(String nomePessoa, int idad, double alt, String sex) {
        nome = nomePessoa;
        idade = idad;
        altura = alt;
        sexo = sex;
    }
    
    // Nome
    public void setNome(String nomePessoa) {
        nome = nomePessoa;
    }
    
    public String getNome() {
        return nome;
    }
    
    // Idade
    public void setIdade(int idad) {
        idade = idad;
    }
    
    public int getIdade() {
        return idade;
    }
    
    // Altura
    public void setAltura(double alt) {
        altura = alt;
    }
    
    public double getAltura() {
        return altura;
    }
    
    // Sexo
    public void setSexo(String sex) {
        sexo = sex;
    }
    
    public String getSexo() {
        return sexo;
    }
}