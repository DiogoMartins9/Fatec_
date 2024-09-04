/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package avaliacao_03;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author 
 */
public class Exercicio_05 {
/*
    Criar um programa que leia um número que será o limite superior de um intervalo e
o incremento. Exibir todos os números naturais no intervalo de 0 até esse número.
Suponha que os dois números lidos são maiores que zero. Exemplo:
Limite superior: 20
Incremento: 5
Saída: 0 5 10 15 20

    */
    public static void main (String []args){
        int num_lim = 0, num_inc = 0;
        String limite = "", incremento = "";
        
        try {
            JOptionPane.showMessageDialog(null, "Vamos descobrir os números naturais em diferentes sequências?");
            limite = JOptionPane.showInputDialog("Digite o nº limite para a sua sequência: ");
            num_lim = Integer.parseInt(limite);
            incremento = JOptionPane.showInputDialog(null, "Digite de quanto em quanto você quer a sequência pule: ");
            num_inc = Integer.parseInt(incremento);
            while (num_inc == 0){
                JOptionPane.showMessageDialog(null, "Número inválido");
                incremento = JOptionPane.showInputDialog(null, "Digite de quanto em quanto você quer a sequência pule: ");
                num_inc = Integer.parseInt(incremento);
            }
            StringBuilder lista_result = new StringBuilder();
            for (int i = 0; i < num_lim ; i += num_inc) {
                lista_result.append(i).append(" ");
            }
            JOptionPane.showMessageDialog(null, "Saída: " +lista_result.toString()); 
        }
        catch (NumberFormatException excecao1){
            JOptionPane.showMessageDialog(null, "Digite apenas valores númericos");
        }
        System.exit(0);
    }
}
