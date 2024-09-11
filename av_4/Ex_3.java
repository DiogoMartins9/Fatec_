/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.av_4;
import javax.swing.JOptionPane;

/**
 *3) Dados três valores X, Y e Z, verificar se eles podem ser os comprimentos dos lados de 
um triângulo , através de uma função que retorne valor, e, se forem verificar se é um 
triângulo equilátero, isósceles ou escalenos. Se eles não formarem um triângulo, escrever 
a mensagem. Considere as seguintes propriedades:
• O comprimento de cada lado em um triângulo é menor que a soma dos outros dois 
lados;
• Equiláteros: tem os comprimentos dos três lados iguais;
• Isósceles: tem os comprimentos de dois lados iguais;
• escaleno: tem os comprimentos dos três lados diferentes.
* 
 * @author
 */
public class Ex_3 {
    public static String examinar (String nome, float x, float y, float z){
     String resultado = null;
     if (x < (y + z) && y < (x + z) && z < (x +y)){
         if(x == z && z == y){
             resultado = nome + ", as medidas que você digitou formam um triângulo equilátero!";
         } else if (x == y || y == z || x == z){
             resultado = nome + ", as medidas que você digitou formam um triângulo isóceles!";
         } else if (x != z && z != y && x != y){
             resultado = nome + ", as medidas que você digitou formam um triângulo escaleno!";
         }
     } else {
         resultado = nome + ", os valores fornecidos não formam um triângulo!";
     }   
     return resultado;
    }
    public static void main(String[]args){
        String nome = JOptionPane.showInputDialog("Digite o seu nome: ");
        try{
            String x_str = JOptionPane.showInputDialog("Digite o valor do primeiro lado do triângulo: ");
            float x = Float.parseFloat(x_str);
            if(x <=0){
                throw new Exception(nome +", o valor precisa ser maior que 0!");
            }

            String y_str = JOptionPane.showInputDialog("Digite o valor do segundo lado do triângulo: ");
            float y = Float.parseFloat(y_str);
            if(x <=0){
                throw new Exception(nome +", o valor precisa ser maior que 0!");
            }

            String z_str = JOptionPane.showInputDialog("Digite o valor do terceiro lado do triângulo: ");
            float z = Float.parseFloat(z_str);
            if(x <=0){
                throw new Exception(nome +", o valor precisa ser maior que 0!");
            }

            String r = examinar(nome, x, y, z);

            JOptionPane.showMessageDialog(null, r);
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Digite apenas números.");
        } catch (Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
}