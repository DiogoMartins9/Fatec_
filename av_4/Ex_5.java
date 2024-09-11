/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.av_4;

import javax.swing.JOptionPane;

/**
 *
 * @author labs
 * Num determinado Estado, para transferências de veículos, o DETRAN cobra uma taxa de 1% para carros fabricados antes de 1990 
 * e uma taxa de 1.5% para os fabricados de 1990 em diante, 
 * taxa esta incidindo sobre o valor de tabela do carro. 
 * O projeto deve ler o ano e o preço do carro e a seguir calcular e exibir o imposto a ser pago, 
 * através de uma função que retorne valor.
 */

public class Ex_5 {
    public static void main(String[] args) {
        String anoCarro = JOptionPane.showInputDialog("Digite o ano do carro: ");
        String valorCarro = JOptionPane.showInputDialog("Digite o valor do carro: ");
        
        int numAno = Integer.parseInt(anoCarro);
        double numValor = Double.parseDouble(valorCarro);
        
        
        
        double valorComImpostoCarro = calculaImposto(numAno, numValor);
        
        JOptionPane.showMessageDialog(null, "O valor com imposto é: R$ " + String.format("%.2f", valorComImpostoCarro));
    }
    
    public static double calculaImposto(int ano, double valor) {
        double novoValor;
        
        if (ano < 1990) {
            novoValor = valor * 1.01;
        } else {
            novoValor = valor * 1.015;
        }
        
        return novoValor;
    }
}
