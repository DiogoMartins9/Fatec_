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
import static com.mycompany.lista7.Utilitarios.*;

/**
 * @author 
 */

public class Principal {
    public static void main(String[] args) {
        exibirMsg("Lista 7 - Exercício 1 - Faturamento"
            + "\n\nNOME: Diogo Peres Martins"
            + "\nCURSO: Desenvolvimento de Software Multiplataforma - 2º Semestre - Noite   "
            + "\nDISCIPLINA: Técnicas de Programação I"
            + "\nProfª Ma. Luciana Zapparolli");
        
        entradaDados();
    }
    
    public static void entradaDados() {
        try 
        {
            exibirMsg("Por favor, informe os dados do item a seguir.");
            
            int numero = inputInt("NÚMERO: ");
            String descricao = inputString("DESCRIÇÃO: ");
            int quantidade = inputInt("QUANTIDADE: ");
            double preco = inputDouble("PREÇO: "); 
            
            Faturar faturamento = new Faturar(numero, descricao, quantidade, preco);

            int opcao = inputInt("Você confirma essas informações? Digite 1 para 'SIM' e 0 para 'NÃO'.");
            while (opcao != 1 && opcao != 0) {
                opcao = inputInt("OPÇÃO INVÁLIDA. Digite 1 para 'SIM' e 0 para 'NÃO'.");
            }
            
            if (opcao == 0) {
                int alterarOutraInfo;

                do {
                    alterarAtributo(faturamento);
                    alterarOutraInfo = inputInt("Deseja alterar mais alguma informação? Digite 1 para 'SIM' e 0 para 'NÃO'.");
                } while (alterarOutraInfo == 1);
            }
            
            exibirMsg("O valor total para " + faturamento.getQuantidade() + 
                " item(ns) (PREÇO UNITÁRIO DE R$ " + faturamento.getPreco() + ") '" + faturamento.getNumero() + "'"
                + ", de descrição '" + faturamento.getDescricao() + "' é de R$ " + faturamento.getFaturarTotal() + "");
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
    
    public static void alterarAtributo(Faturar faturamento) {
        int atributo = inputInt("Qual informação você deseja alterar? Informe um dos números abaixo:"
            + "\n1 - Número\n2 - Descrição\n3 - Quantidade\n4 - Preço.");

        switch (atributo) {
            case 1:
                faturamento.setNumero(inputInt("Informe o novo número: "));
                break;
            case 2:
                faturamento.setDescricao(inputString("Informe a nova descrição: "));
                break;
            case 3:
                faturamento.setQuantidade(inputInt("Informe a nova quantidade: "));
                break;
            case 4:
                faturamento.setPreco(inputInt("Informe o novo preço do item: "));
                break;
            default:
                exibirMsg("Opção inválida.");
                break;
        }   
    }
}