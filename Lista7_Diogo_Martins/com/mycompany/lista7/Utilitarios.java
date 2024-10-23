/**
 *  Classe criada apenas para o método de exibição de mensagens, a fim de evitar
 *  repetições em outras classes dentro do mesmo pacote.
 */

package com.mycompany.lista7;
import javax.swing.JOptionPane;

/**
 * @author 
 */

public class Utilitarios {
    public static void exibirMsg(String mensagem) {
        JOptionPane.showMessageDialog(
            null,
            mensagem,
            "Lista 5 - TPI",
            JOptionPane.INFORMATION_MESSAGE
        );
    }
    
    public static double inputDouble(String mensagem) {
        String str_valor = JOptionPane.showInputDialog(null, mensagem);        
        if (str_valor != null) {
            return Double.parseDouble(str_valor);
        }
        
        System.exit(0);
        return 0;
    }
        
    public static int inputInt(String mensagem) {
        String str_valor = JOptionPane.showInputDialog(null, mensagem);        
        if (str_valor != null) {
            return Integer.parseInt(str_valor);
        }
        
        System.exit(0);
        return 0;
    }
                
    public static String inputString(String mensagem) {
        String str_valor = JOptionPane.showInputDialog(null, mensagem);        
        if (str_valor != null) {
            return str_valor;
        }
        
        System.exit(0);
        return null;
    }
}