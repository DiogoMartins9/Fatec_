/**
 *  A fim de representar empregados em uma firma, crie uma classe chamada 
 *  Empregado que inclui as três informações a seguir como atributos:
 *      • um primeiro nome,
 *      • um sobrenome, e
 *      • um salário mensal.
 * 
 *  Sua classe deve ter um construtor que inicializa os três atributos. Forneça um 
 *  método set e get para cada atributo. Se o salário mensal não for positivo, 
 *  configure-o como 0.
 * 
 *  Escreva um aplicativo de teste que demonstra as capacidades da classe. Crie 
 *  duas instâncias da classe e exiba o salário anual de cada instância.
 *  Então dê a cada empregado um aumento de 10% e exiba novamente o salário 
 *  anual de cada empregado.
 */

package ex2;

/**
 * @author 
 */

public class Empregado {
    String primeiroNome;
    String sobrenome;
    double salarioMensal;
   
    public Empregado(String nome, String sobrNome, double salario) {
        primeiroNome = nome;
        sobrenome = sobrNome;
        
        salarioMensal = salario < 0 ? 0 : salario;        
    }
    
    // Primeiro nome.
    public void setPrimeiroNome(String nome) {
        primeiroNome = nome;
    }
    
    public String getPrimeiroNome() {
        return primeiroNome;
    }
    
    // Sobrenome.
    public void setSobrenome(String sobrNome) {
        sobrenome = sobrNome;
    }
    
    public String getSobrenome() {
        return sobrenome;
    }
    
    // Salario.
    public void setSalarioMensal(double salario) {
        salarioMensal = salario;
    }
    
    public double getSalarioMensal() {
        return salarioMensal;
    }
    
    // Retorna o salário anual.
    public double getSalarioAnual() {
        return getSalarioMensal() * 12;
    }
    
    public void aumentarSalario(double porcentagemAumento) {
        salarioMensal = getSalarioMensal() + (getSalarioMensal() * (porcentagemAumento/100));
    }
}