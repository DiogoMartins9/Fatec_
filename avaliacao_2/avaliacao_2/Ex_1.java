/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.avaliacao_2;

/**Ler um valor e informar se ele é ou não múltiplo de 3.

 *
 * @author labs
 */

import javax.swing.JOptionPane;

public class Ex_1 {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Digite um valor:");
        
        int valor;
        try {
            valor = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, digite um número inteiro.");
            return;
        }
        
        if (valor % 3 == 0) {
            JOptionPane.showMessageDialog(null, valor + " é múltiplo de 3.");
        } else {
            JOptionPane.showMessageDialog(null, valor + " não é múltiplo de 3.");
        }
    }
}
