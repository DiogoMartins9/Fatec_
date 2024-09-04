/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package avaliacao_03;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author 
 */
public class Exercicio_03 {
/*
    Um programa capaz de imprimir todos os números primos em um intervalo de
números informado pelo usuário;
*/   
    public static void main(String[] args) {
        int valor_inicio;
        int valor_fim;

        try {
            String inicio = JOptionPane.showInputDialog("Digite o início do intervalo:");
            String fim = JOptionPane.showInputDialog("Digite o fim do intervalo:");

            valor_inicio = Integer.parseInt(inicio);
            valor_fim = Integer.parseInt(fim);

            if (valor_inicio > valor_fim) {
                JOptionPane.showMessageDialog(null, "O início do intervalo não pode ser maior que o fim do intervalo.");
                return;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, insira números inteiros.");
            return;
        }

        StringBuilder primos = new StringBuilder();
        primos.append("Números primos no intervalo de ").append(valor_inicio).append(" a ").append(valor_fim).append(":\n");
        
        
        int numero_verificacao_atual = valor_inicio;
        
        while (numero_verificacao_atual <= valor_fim) {
            
            int divisor = numero_verificacao_atual - 1;
            boolean eh_primo = true;

            while (divisor > 1) {
                if (numero_verificacao_atual % divisor == 0) {
                    eh_primo = false;
                }

                divisor = divisor - 1;
            }
        
            if (eh_primo) {
                primos.append(numero_verificacao_atual).append("\n");
            }
            
            numero_verificacao_atual++;
        }
      
        JOptionPane.showMessageDialog(null, primos.toString());
    }
}
 