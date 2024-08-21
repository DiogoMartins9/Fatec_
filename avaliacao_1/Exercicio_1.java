/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.avaliacao_1;

/**Em época de pouco dinheiro, os comerciantes estão procurando aumentar suas 
vendas oferecendo desconto. Faça um programa que possa entrar com o nome 
de um produto e seu valor unitário e calcular e exibir um novo valor com um 
desconto de 9%.
 *
 * @author labs
 */
import java.util.Scanner;

public class Exercicio_1 {
     public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("Digite o nome do produto");
    String nome_produto = input.nextLine();
    
    System.out.println("Digite o valor do produto");
    double valor_produto = input.nextDouble();
    
    double taxa_desconto = 0.91;
    
    double valor_desconto = valor_produto * taxa_desconto;
    
    System.out.printf("Produto: %s%n", nome_produto);
    System.out.printf("Valor original: R$ %.2f%n", valor_produto);
    System.out.printf("Valor com desconto de 9%%: R$ %.2f%n", valor_desconto);
    
    
            
            }
    
}
