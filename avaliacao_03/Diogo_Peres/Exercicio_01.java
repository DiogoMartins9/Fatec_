/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package avaliacao_03;
import javax.swing.JOptionPane;

/**
 *
 * @author 
 */
public class Exercicio_01 {
/*
    Um programa capaz de imprimir todos os números pares em um intervalo de
números informador pelo usuário;
    */
    public static void main(String [] args){  
        /*
        tem que atribuir zero para as variaveis sempre?
        */
        int num_inic = 0, num_fim = 0, numero_atual = 0;
        String valor_usuario1 = "", valor_usuario2 = "";
        try {
            valor_usuario1 = JOptionPane.showInputDialog("Digite o valor que deseja que seja o início do intervalo: ");
            num_inic = Integer.parseInt(valor_usuario1);
        
            valor_usuario2 = JOptionPane.showInputDialog("Agora digite o fim para este intervalo: ");
            num_fim = Integer.parseInt(valor_usuario2);
              
            while (num_inic > num_fim){
              JOptionPane.showMessageDialog(null, "\nNúmero digitado para o final do intervalo menor que o valor inicial\n");
              valor_usuario2 = JOptionPane.showInputDialog("Agora digite o fim para este intervalo: ");
              num_fim = Integer.parseInt(valor_usuario2);
              } 
               
            
            StringBuilder lista_intervalo =  new StringBuilder();
            for (int i = num_inic; i <= num_fim; i++) {
                if (i % 2 == 0) {
                    lista_intervalo.append(i).append(" ");
                }
            }
            JOptionPane.showMessageDialog(null, "Números pares no intervalo de " + num_inic + " a " + num_fim + ": \n"+lista_intervalo );
        }
        
        catch (Exception excecao){
            JOptionPane.showMessageDialog(null,"Entrada inválida. Por favor, insira números inteiros.");
            return;
        } 
        }
}

