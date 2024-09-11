/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.av_4;

import javax.swing.JOptionPane;
/**
 *
 * @author
 */



public class Ex_1 {
/*
    1) Ler o nome de um produto, o preço e a quantidade comprada. Escreva o nome do
produto comprado e o valor total a ser pago, considerando que são oferecidos descontos
pelo número de unidades compradas, segundo a tabela abaixo:
a) Até 10 unidades: valor total
b) De 11 a 20 unidades: 10% de desconto
c) De 21 a 50 unidades: 20% de desconto
d) Acima de 50 unidades: 25% de desconto
Calcular o valor total a ser pago através de uma função que retorna valor.
*/
    public static double calculofinal(double preco, double quant)
        {
            double valor_final = preco * quant;
        if (quant <= 10) {
            return valor_final; // valor sem desconto
        } else if (quant > 10 && quant <= 20) {
            return valor_final * 0.9; // 10% de desconto
        } else if (quant > 20 && quant <= 50) {
            return valor_final * 0.8; // 20% de desconto
        } else {
            return valor_final * 0.75; // 25% de desconto
        }            
        }
    
    public static void main(String[] args)
    {
        String nome_prod = JOptionPane.showInputDialog(null, "Digite o nome do produto:");
        
        try{
            String precoStr = JOptionPane.showInputDialog(null, "Digite o preço dele:");
            double preco = Double.parseDouble(precoStr);
            if(preco <=0){
                throw new Exception("Preço e/ou Quantidade não podem ser iguais ou menores que zero");
            }            
            String quantStr = JOptionPane.showInputDialog(null, "E a quantidade que comprou:");          
            double quantidade = Double.parseDouble(quantStr);
            if(quantidade <=0){
                throw new Exception("Preço e/ou Quantidade não podem ser iguais ou menores que zero");
            }          

            
            double valor_total = preco * quantidade;
            double valor = calculofinal(preco, quantidade);
            double desconto = valor_total - valor;

            JOptionPane.showMessageDialog(null, "Produto: " + nome_prod + "\nSubtotal: R$ " + valor_total + "\nValor do desconto: R$" + desconto + "\nValor final: R$" + valor, "Resultado", JOptionPane.INFORMATION_MESSAGE);
    
        }
        catch (NumberFormatException e){
           JOptionPane.showMessageDialog(null, "Digite apenas valores númericos.");
        }
        catch (Exception ex){
           JOptionPane.showMessageDialog(null, ex.getMessage());            
        }
    }
}