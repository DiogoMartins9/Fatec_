/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade5;

import javax.swing.JOptionPane;

/**
 *
 * @author labs
 */
public class Triangulo {

    private double base;
    private double altura;

    public Triangulo() {
        this.base = 0;
        this.altura = 0;
    }

    public void lerDados() {
        boolean dadosValidos = false;
        while (!dadosValidos) {
            try {
                String baseStr = JOptionPane.showInputDialog(null, "Digite a base do triângulo:");
                this.base = Double.parseDouble(baseStr);

                String alturaStr = JOptionPane.showInputDialog(null, "Digite a altura do triângulo:");
                this.altura = Double.parseDouble(alturaStr);

                dadosValidos = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, insira números válidos.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public double calcularArea() {
        return (base * altura) / 2;
    }

    public static void main(String[] args) {
      
        Triangulo triangulo = new Triangulo();

        triangulo.lerDados();

        double area = triangulo.calcularArea();

        JOptionPane.showMessageDialog(null, "A área do triângulo é: " + area, "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
}
