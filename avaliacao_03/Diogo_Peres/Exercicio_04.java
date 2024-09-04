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
public class Exercicio_04 {
 /*
    Um programa que calcule a média de uma aluno nos moldes da Fatec MAUÁ.
    */  
    public static void main (String [] args){
        double nota_final = 0, p1 = 0, p2 = 0, p3 = 0, trab = 0;
        String P1 = "", P2 = "", P3 = "", TRAB = "", nome = "";
        
        try {
            nome = JOptionPane.showInputDialog(null, "Digite seu nome: ");
            TRAB = JOptionPane.showInputDialog(null, "" + nome + "\nDigite sua nota em trabalho: ");
            trab = Double.parseDouble (TRAB);            
            P1 = JOptionPane.showInputDialog(null, "" + nome + "\nDigite sua nota da P1: ");
            p1 = Double.parseDouble(P1);
            P2 = JOptionPane.showInputDialog(null, "" + nome + "\nDigite sua nota da P2: "); 
            p2 = Double.parseDouble (P2);            
            
            
            if (p1 < 6 && p1 < p2){
                P3 = JOptionPane.showInputDialog(null,"Digite sua nota na P3: ");
                p3 = Double.parseDouble(P3);
                p1 = p3;

            }
            else if (p2 < 6 && p2 < p1){
                P3 = JOptionPane.showInputDialog(null,"Digite sua nota na P3: ");
                p3 = Double.parseDouble(P3);
                p2 = p3; 

            }
            else if (p1 < 6 && p1 == p2){
                P3 = JOptionPane.showInputDialog(null,"Digite sua nota na P3: ");
                p3 = Double.parseDouble(P3);
                p1 = p3;   
            }
            
            nota_final = (p1*0.35)+(p2*0.35)+(trab*0.30); 
            JOptionPane.showMessageDialog(null, "Sua nota final foi " + nota_final);
            
            if (nota_final <= 6 ){
                JOptionPane.showMessageDialog(null, "Você não foi aprovado :( ");
            }
            else {
                JOptionPane.showMessageDialog(null, "PARABÉNS \nVocê foi aprovado!");
            }
        }
        catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Digite apenas valores númericos");
        }
        System.exit(0);
    }
}
