/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.avaliacao_2;

/**
 *
 * @author labs
 * Depois da liberação do governo para as mensalidades dos planos de saúde, as 
    pessoas começaram a fazer pesquisas para descobrir um bom plano, não muito caro. 
    Um vendedor de um plano de saúde apresentou a tabela a seguir. Criar um programa 
    que entre com o nome e a idade de uma pessoa e mostre o valor que ela deverá pagar.
    Até 10 anos – R$ 30,00
    Acima de 10 até 29 anos – R$ 60,00
    Acima de 29 até 45 anos – R$ 120,00
    Acima de 45 até 59 anos – R$ 150,00
    Acima de 59 até 65 anos – R$ 250,00
    Maior que 65 anos – R$ 400,00
 */

import javax.swing.JOptionPane;

public class Ex_5 {
     public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite seu nome:");
        
        String inputIdade = JOptionPane.showInputDialog("Digite sua idade:");
        
        int idade;
        try {
            idade = Integer.parseInt(inputIdade);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, digite um número inteiro para a idade.");
            return;
        }
        
        double valor;
        
        if (idade <= 10) {
            valor = 30.00;
        } else if (idade <= 29) {
            valor = 60.00;
        } else if (idade <= 45) {
            valor = 120.00;
        } else if (idade <= 59) {
            valor = 150.00;
        } else if (idade <= 65) {
            valor = 250.00;
        } else {
            valor = 400.00;
        }
        
        JOptionPane.showMessageDialog(null, "Olá, " + nome + "! O valor do seu plano de saúde é: R$ " + String.format("%.2f", valor));
    }
}
