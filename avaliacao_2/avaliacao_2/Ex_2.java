/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.avaliacao_2;

/**
 *
 * @author labs
 * Ler três números e mostrá-los em ordem crescente.
 */

import javax.swing.JOptionPane;

public class Ex_2 {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Digite um número: ");
        String sla = JOptionPane.showInputDialog("Digite um número: ");
        String hum = JOptionPane.showInputDialog("Digite um número: ");
        
  int valor1, valor2, valor3;
        try {
            valor1 = Integer.parseInt(input);
            valor2 = Integer.parseInt(sla);
            valor3 = Integer.parseInt(hum);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, digite apenas números inteiros.");
            return;
        }
        
        int menor, meio, maior;
        
        if (valor1 <= valor2 && valor1 <= valor3) {
            menor = valor1;
            if (valor2 <= valor3) {
                meio = valor2;
                maior = valor3;
            } else {
                meio = valor3;
                maior = valor2;
            }
        } else if (valor2 <= valor1 && valor2 <= valor3) {
            menor = valor2;
            if (valor1 <= valor3) {
                meio = valor1;
                maior = valor3;
            } else {
                meio = valor3;
                maior = valor1;
            }
        } else {
            menor = valor3;
            if (valor1 <= valor2) {
                meio = valor1;
                maior = valor2;
            } else {
                meio = valor2;
                maior = valor1;
            }
        }
        
        JOptionPane.showMessageDialog(null, "Valores em ordem crescente: " + menor + ", " + meio + ", " + maior);
    }
}