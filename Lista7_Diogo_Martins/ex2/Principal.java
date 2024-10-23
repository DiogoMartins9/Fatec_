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
import static com.mycompany.lista7.Utilitarios.*;

/**
 * @author 
 */

public class Principal {
    public static void main(String[] args) {
        exibirMsg("Lista 7 - Exercício 2 - Empregados"
            + "\n\nNOME: Diogo Peres Martins"
            + "\nCURSO: Desenvolvimento de Software Multiplataforma - 2º Semestre - Noite   "
            + "\nDISCIPLINA: Técnicas de Programação I"
            + "\nProfª Ma. Luciana Zapparolli");
        
        entradaDados();
    }
    
    public static void entradaDados() {
        try 
        {
            exibirMsg("Por favor, informe os dados dos 2 empregados a seguir.");
                        
            Empregado empregado1 = criarInstancia();            
            Empregado empregado2 = criarInstancia();
                        
            exibirMsg(montarInformacoes(empregado1) + montarInformacoes(empregado2));
            
            int opcao = inputInt("Deseja fornecer um aumento de 10% para ambos os empregados? Digite 1 para 'SIM' e 0 para 'NÃO'.");
            while (opcao != 1 && opcao != 0) {
                opcao = inputInt("OPÇÃO INVÁLIDA. Digite 1 para 'SIM' e 0 para 'NÃO'.");
            }

            if (opcao == 1) {
                empregado1.aumentarSalario(10);
                empregado2.aumentarSalario(10);
                
                exibirMsg("INFORMAÇÕES ATUALIZADAS APÓS O AUMENTO DE SALÁRIO:\n\n" + montarInformacoes(empregado1) + montarInformacoes(empregado2));
            }
        }
        catch (NumberFormatException ex)
        {
            exibirMsg("Digite apenas números.");
            entradaDados();
        }
        catch (Exception ex) 
        {
            exibirMsg("Ocorreu um erro durante a execução do programa.\n\nMENSAGEM DE ERRO: \n" + ex.getMessage());            
        }
        
        System.exit(0);
    }
    
    public static void alterarAtributo(Empregado empregado) {
        int atributo = inputInt("Qual informação você deseja alterar? Informe um dos números abaixo:"
            + "\n1 - Nome\n2 - Sobrenome\n3 - Salário Mensal.");

        switch (atributo) {
            case 1:
                empregado.setPrimeiroNome(inputString("Informe o novo nome: "));
                break;
            case 2:
                empregado.setSobrenome(inputString("Informe o novo sobrenome: "));
                break;
            case 3:
                empregado.setSalarioMensal(inputDouble("Informe o novo salário: "));
                break;
            default:
                exibirMsg("Opção inválida.");
                break;
        }   
    }
    
    public static Empregado criarInstancia() {
        String nome = inputString("PRIMEIRO NOME: ");
        String sobrenome = inputString("SOBRENOME: ");
        double salario = inputDouble("SALÁRIO MENSAL: "); 

        Empregado empregado = new Empregado(nome, sobrenome, salario);

        int opcao = inputInt("Você confirma essas informações? Digite 1 para 'SIM' e 0 para 'NÃO'.");
        while (opcao != 1 && opcao != 0) {
            opcao = inputInt("OPÇÃO INVÁLIDA. Digite 1 para 'SIM' e 0 para 'NÃO'.");
        }

        if (opcao == 0) {
            int alterarOutroDado;

            do {
                alterarAtributo(empregado);
                alterarOutroDado = inputInt("Deseja alterar mais alguma informação? Digite 1 para 'SIM' e 0 para 'NÃO'.");
            } while (alterarOutroDado == 1);
        }
        
        exibirMsg("EMPREGADO CADASTRADO COM SUCESSO.");
        
        return empregado;
    }
    
    public static String montarInformacoes(Empregado empregado) {
        return
            "EMPREGADO: " + empregado.getPrimeiroNome() + " " + empregado.getSobrenome() + 
            "\nSALÁRIO MENSAL: R$ " + empregado.getSalarioMensal() + 
            "\nSALÁRIO ANUAL: R$ " + empregado.getSalarioAnual() + ")\n\n";
    }
}