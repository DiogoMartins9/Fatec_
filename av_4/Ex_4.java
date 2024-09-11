/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.av_4;

/**
 *
 * @author labs
 * Calcule o peso ideal de uma pessoa através de uma função que não retorne valor. Dados de entrada: altura e sexo. 
 * Fórmulas para cálculo do peso:
 * peso ideal de homem = (72,7 x altura) - 58
 * peso ideal da mulher = (62,1 x altura) - 44,7
 */

import javax.swing.JOptionPane;

public class Ex_4 {
    private static double pesoIdeal;

    public static void main(String[] args) {
        String altura = JOptionPane.showInputDialog("Digite a sua altura: ");
        String sexo = JOptionPane.showInputDialog("Digite o seu sexo\n [M] ou [F]:\n ");
        
        double numAltura = Double.parseDouble(altura);
        
        calculaPesoIdeal(numAltura, sexo);
        
        JOptionPane.showMessageDialog(null, "O peso ideal é: " + pesoIdeal);
    }
    
    public static void calculaPesoIdeal(double altura, String sexo) {
        if ("M".equals(sexo)) {
            pesoIdeal = (72.7 * altura) - 58;
        } else {
            pesoIdeal = (62.1 * altura) - 44.7;
        }
    }
}

