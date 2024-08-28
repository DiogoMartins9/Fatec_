/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.avaliacao_2;

/**
 *
 * @author labs
 *  Um comerciante comprou um produto e quer vendê-lo com um lucro de 45% se o 
    valor da compra for menor que R$20,00; caso contrário, o lucro será de 30%. Entrar 
    com o valor do produto e imprimir o valor da venda.
 */
import javax.swing.JOptionPane;

public class Ex_3 {
        public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Digite o valor de compra do produto:");
        
        double valorCompra;
        try {
            valorCompra = Double.parseDouble(input);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, digite um valor numérico.");
            return;
        }
        
        double valorVenda;
        if (valorCompra < 20.00) {
            valorVenda = valorCompra * 1.45;
        } else {
            valorVenda = valorCompra * 1.30;
        }
        
        JOptionPane.showMessageDialog(null, "O valor de venda do produto é: R$ " + String.format("%.2f", valorVenda));
    }
}
