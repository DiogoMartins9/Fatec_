/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.avaliacao_1;

/**Para vários tributos, a base de cálculo é o salário mínimo. Fazer um programa 
que leia o valor do salário mínimo e o valor do salário de uma pessoa. Calcular 
e mostrar quantos salários mínimos ela ganha.
 * @author labs
 */
import java.util.Scanner;

public class Exercicio_2 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
   double salario_minimo = 1412;
   
   System.out.println("Digite o seu salário");
   double salario = input.nextDouble();
   
   double calculo_salario = salario / salario_minimo;
   
    System.out.printf("A pessoa ganha %.2f salários mínimos.%n", calculo_salario);
    
    }
}
