/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.avaliacao_2;

/**
 *
 * @author labs
 *  Ler a idade de uma pessoa e informar a sua classe eleitoral:
    Não-eleitor (abaixo de 16 anos)
    Eleitor obrigatório (entre 18 e 65 anos)
    Eleitor facultativo (entre 16 e 18 anos e maior de 65 anos)
 */

import javax.swing.JOptionPane;

public class Ex_4 {
     public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Digite a sua idade:");
        
        int idade;
        try {
            idade = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, digite um número inteiro.");
            return;
        }
        
        String classeEleitoral;
        if (idade < 16) {
            classeEleitoral = "Não-eleitor (abaixo de 16 anos)";
        } else if (idade >= 18 && idade <= 65) {
            classeEleitoral = "Eleitor obrigatório (entre 18 e 65 anos)";
        } else {
            classeEleitoral = "Eleitor facultativo (entre 16 e 18 anos e maior de 65 anos)";
        }
        
        JOptionPane.showMessageDialog(null, classeEleitoral);
    }
}
