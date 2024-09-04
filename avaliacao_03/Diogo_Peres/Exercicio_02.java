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
public class Exercicio_02 {
/*
    Um programa que imprima até o “n” termo a seqüência de Fibonacci. Série:
1,1,2,3,5,8,13,21.......
Por exemplo, imprimir até o 6º termo: 1, 1, 2, 3, 5, 8
    */ 
    public static void main(String[] args) {
        int termo_fibonacci;

        try {
            String termo_digitado = JOptionPane.showInputDialog("Digite o termo da sequência de Fibonacci:");

            termo_fibonacci = Integer.parseInt(termo_digitado);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, insira números inteiros.");
            return;
        }

        StringBuilder numeros_fibonacci = new StringBuilder();
        numeros_fibonacci.append("Números de fibonacci até").append(termo_fibonacci).append("\n");

        int primeiro_numero = 1;
        int segundo_numero = 1;
        int soma_atual = 0;
        int i = 3;
        
        numeros_fibonacci.append(primeiro_numero).append(",").append(segundo_numero);
        
        while (i <= termo_fibonacci) {
            soma_atual = primeiro_numero + segundo_numero;
            
            primeiro_numero = segundo_numero;
            segundo_numero = soma_atual;
            numeros_fibonacci.append(",").append(soma_atual);
            i++;
                          
        }

        JOptionPane.showMessageDialog(null, numeros_fibonacci.toString());
    }
}
