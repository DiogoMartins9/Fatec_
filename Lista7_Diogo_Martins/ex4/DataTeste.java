/**
 *  Crie uma classe em Java chamada Data que inclui três informações como
 *  variáveis de instância: 
 *      • mês (int), 
 *      • dia (int), 
 *      • e ano (int).
 * 
 *  A classe deve ter métodos get e set para cada variável e um construtor que 
 *  inicializa as variáveis e assume que os valores fornecidos são corretos. Forneça 
 *  um método displayData que exibe o dia, o mês e o ano separados por barras 
 *  normais ( / ).
 *  
 *  Escreva um aplicativo de teste chamado DataTeste que demonstra as capacidades da classe Data.
 */

package ex4;
import static com.mycompany.lista7.Utilitarios.*;

/**
 * @author 
 */

public class DataTeste {
    public static void main(String[] args) {
        exibirMsg("Lista 7 - Exercício 4 - DataTeste"
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
                dataTeste();

                opcao = inputInt("Deseja informar outra data? Digite 1 para 'SIM' e 0 para 'NÃO'.");

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
    
    public static void dataTeste() {
        exibirMsg("Para verificar a data, informe: ");
        
        int dia = inputInt("DIA: ");            
        while (dia > 31 || dia < 1) {
            dia = inputInt("INFORME O DIA CORRETAMENTE: ");
        }

        int mes = inputInt("MÊS: ");
        while (mes > 12 || mes < 1) {
            mes = inputInt("INFORME O MÊS CORRETAMENTE: ");
        }

        int ano = inputInt("ANO: ");
        while (ano < 1) {
            ano = inputInt("INFORME O ANO CORRETAMENTE: ");
        }

        Data data = new Data(dia, mes, ano);
        
        exibirMsg("DATA INFORMADA: " + data.displayData());
    }
}