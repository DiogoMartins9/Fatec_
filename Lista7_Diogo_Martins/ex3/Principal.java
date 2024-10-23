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
import static com.mycompany.lista7.Utilitarios.*;

/**
 * @author 
 */

public class Principal {
    public static void main(String[] args) {
        exibirMsg("Lista 7 - Exercício 3 - Calculadora"
            + "\n\nNOME: Diogo Peres Martins"
            + "\nCURSO: Desenvolvimento de Software Multiplataforma - 2º Semestre - Noite   "
            + "\nDISCIPLINA: Técnicas de Programação I"
            + "\nProfª Ma. Luciana Zapparolli");
        
        entradaDados();
    }
    
    public static void entradaDados() {
        try 
        {   
            int opcao = 1;
            do {
                Calcular();

                opcao = inputInt("Deseja realizar outro cálculo? Digite 1 para 'SIM' e 0 para 'NÃO'.");

                while (opcao != 1 && opcao != 0) {
                    opcao = inputInt("OPÇÃO INVÁLIDA. Digite 1 para 'SIM' e 0 para 'NÃO'.");
                }

            } while (opcao == 1);
        }
        catch (NumberFormatException ex)
        {
            exibirMsg("Digite apenas números.");
            entradaDados();
        }
        catch (Exception ex) 
        {
            exibirMsg("Ocorreu um erro durante a execução do programa.\n\nMENSAGEM DE ERRO: \n" + ex.getMessage());
            entradaDados();
        }
        
        System.exit(0);
    }
    
    public static void Calcular() {
        // Dado que o retorno de um JOptionPane é do tipo String, não foi possível utilizar o tipo char, pois a conversão não é possível.
        String operacao = inputString("Digite um dos símbolos das operações básica, para realizar o cálculo (+, -, *, /): ");

        while (!operacao.equals("+") && !operacao.equals("-") && !operacao.equals("*") && !operacao.equals("/")) {
            operacao = inputString("OPERAÇÃO INVÁLIDA. Digite apenas o símbolo de uma das operações básicas (+, -, *, /): ");
        }

        double num1 = inputDouble("PRIMEIRO NÚMERO: "); 
        double num2 = inputDouble("SEGUNDO: "); 

        Calculadora calculadora = new Calculadora(operacao, num1, num2);

        switch (calculadora.operacao) {
            case "+":
                calculadora.somar();
                break;
            case "-":
                calculadora.subtrair();
                break;
            case "*":
                calculadora.multiplicar();
                break;
            case "/":
                if (calculadora.numero2 == 0) {
                    exibirMsg("Não é possível realizar uma divisão por zero.");
                    return;
                }

                calculadora.dividir();

                break;
            default:
                exibirMsg("Operação inválida.");
                break;
        }

        exibirMsg("Operação escolhida: '" + calculadora.operacao + "'\nRESULTADO: " + calculadora.imprimirResultado());
    }
}