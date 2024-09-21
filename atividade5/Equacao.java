/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade5;
import javax.swing.JOptionPane;

/**
 *2ª) Criar uma Classe chamada Equacao que contenha como atributos 3 valores inteiros, A, B e C. 
 * Na classe definir um método para leitura dos valores, um método construtor e um método para calcular as raízes da equação.
R1 = (-b+ (raiz de delta)) / (2*a)
R2 = (-b-(raiz de delta)) / (2*a)
Considerar que:
- Se delta = 0, as raízes são iguais;
- Se delta <0, não existem raízes reais;
- Se delta >0, existem 2 raízes diferentes
No método principal do programa (main) , criar um objeto a partir da classe criada,
* solicitar e atribuir os valores e invocar o método que calcula as raízes a partir do objeto criado.
 * @author labs
 */

public class Equacao {

    private int a;
    private int b;
    private int c;

    public Equacao() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
    }

    public void lerDados() {
        boolean dadosValidos = false;

        while (!dadosValidos) {
            try {
                String aStr = JOptionPane.showInputDialog(null, "Digite o valor de A:");
                this.a = Integer.parseInt(aStr);

                String bStr = JOptionPane.showInputDialog(null, "Digite o valor de B:");
                this.b = Integer.parseInt(bStr);

                String cStr = JOptionPane.showInputDialog(null, "Digite o valor de C:");
                this.c = Integer.parseInt(cStr);

                if (this.a == 0) {
                    JOptionPane.showMessageDialog(null, "O valor de A não pode ser zero.", "Erro", JOptionPane.ERROR_MESSAGE);
                } else {
                    dadosValidos = true;
                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, insira números inteiros.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public void calcularRaizes() {
        double delta = (b * b) - (4 * a * c);

        if (delta > 0) {
            double r1 = (-b + Math.sqrt(delta)) / (2 * a);
            double r2 = (-b - Math.sqrt(delta)) / (2 * a);
            JOptionPane.showMessageDialog(null, "Delta positivo. As raízes são:\nR1 = " + r1 + "\nR2 = " + r2, "Resultado", JOptionPane.INFORMATION_MESSAGE);
        } else if (delta == 0) {
            double r = -b / (2 * a);
            JOptionPane.showMessageDialog(null, "Delta zero. A única raiz é: R = " + r, "Resultado", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Delta negativo. Não existem raízes reais.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static void main(String[] args) {
        Equacao equacao = new Equacao();
        equacao.lerDados();
        equacao.calcularRaizes();
    }
}


