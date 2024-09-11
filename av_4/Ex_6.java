/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.av_4;

import javax.swing.JOptionPane;

/**
 *
 * @author labs
 * Escreva um programa para ler um valor e escrever a soma da sua tabuada de 1 até 10
 */
public class Ex_6 {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Digite o numero: ");
        
        int intNumero = Integer.parseInt(input);
                
        int resultadoSoma = somaTabuada(intNumero);
       
        JOptionPane.showMessageDialog(null, "A soma é: " + resultadoSoma);
    }
    
    public static int somaTabuada(int numero) {
        int soma = 0;
        
        for (int i = 1; i < 11; i++) {
            int tabuada = numero * i;
            soma = soma + tabuada;
        }
        
        return soma;
    }
            
}
