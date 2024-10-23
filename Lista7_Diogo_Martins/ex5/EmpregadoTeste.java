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
import static com.mycompany.lista7.Utilitarios.*;

/**
 * @author 
 */

public class EmpregadoTeste {
    public static void main(String[] args) {
        exibirMsg("Lista 7 - Exercício 5 - EmpregadoTeste"
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
                empregadoTeste();

                opcao = inputInt("Deseja informar os dados de outro empregado? Digite 1 para 'SIM' e 0 para 'NÃO'.");

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
    
    public static void empregadoTeste() {
        exibirMsg("Informe os seguintes dados do empregado: ");
        
        String nome = inputString("NOME: ");
        int idade = inputInt("IDADE: ");
        double altura = inputDouble("ALTURA: ");

        String sexo = inputString("SEXO ('M' PARA MASCULINO ou 'F' PARA FEMININO): ");
        while (!sexo.equalsIgnoreCase("M") && !sexo.equalsIgnoreCase("F")) {
            sexo = inputString("SEXO INVÁLIDO (DIGITE 'M' PARA MASCULINO ou 'F' PARA FEMININO): ");
        }

        double salario = inputDouble("SALÁRIO: "); 
        
        Empregado empregado = new Empregado(nome, idade, altura, sexo, salario);

        int opcao = inputInt("Você confirma essas informações? Digite 1 para 'SIM' e 0 para 'NÃO'.");
        while (opcao != 1 && opcao != 0) {
            opcao = inputInt("OPÇÃO INVÁLIDA. Digite 1 para 'SIM' e 0 para 'NÃO'.");
        }

        if (opcao == 0) {
            int alterarOutraInfo;

            do {
                alterarAtributo(empregado);
                alterarOutraInfo = inputInt("Deseja alterar mais alguma informação? Digite 1 para 'SIM' e 0 para 'NÃO'.");
            } while (alterarOutraInfo == 1);
        }
               
        exibirMsg("O empregado '" + empregado.getNome() + "' foi cadastrado com sucesso."
            + "\n\nDados informados:\n"
            + "\nIDADE: " + empregado.getIdade() 
            + "\nALTURA: " + empregado.getAltura()
            + "\nSEXO: " + empregado.getSexo()
            + "\nLUCRO (SALÁRIO): " + empregado.obterLucros());
    }
    
    public static void alterarAtributo(Empregado empregado) {
        int atributo = inputInt("Qual informação você deseja alterar? Informe um dos números abaixo:"
            + "\n1 - Nome\n2 - Idade\n3 - Altura\n4 - Sexo\n5 - Salário");

        switch (atributo) {
            case 1:
                empregado.setNome(inputString("Informe o novo nome: "));
                break;
            case 2:
                empregado.setIdade(inputInt("Informe a nova idade: "));
                break;
            case 3:
                empregado.setAltura(inputDouble("Informe a nova altura: "));
                break;
            case 4:
                String sexo = inputString("Informe o sexo ('M' PARA MASCULINO ou 'F' PARA FEMININO): ");
                while (!sexo.equalsIgnoreCase("M") && !sexo.equalsIgnoreCase("F")) {
                    sexo = inputString("SEXO INVÁLIDO (DIGITE 'M' PARA MASCULINO ou 'F' PARA FEMININO): ");
                }
                
                empregado.setSexo(sexo);
                break;
            case 5:
                empregado.setSalario(inputDouble("Informe o novo salário: "));
                break;
            default:
                exibirMsg("Opção inválida.");
                break;
        }   
    }
}