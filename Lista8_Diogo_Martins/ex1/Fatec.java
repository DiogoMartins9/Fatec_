/**
 *  1) No exemplo dado em sala de aula, acrescentar botões para subtrair, dividir e 
 *  multiplicar os 2 valores, exibindo o resultado.
 */

package ex1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * @author 
 */

public class Fatec 
{
    private JFrame janela;
    private JPanel painelPrincipal;
    private Label label1, lblr, lbl3;
    private TextField t1, t2;
    
    public static void main(String[] args) 
    {
        new Fatec().montaTela();
    }
    
    private void montaTela() 
    {
        preparaJanela();
        preparaPainelPrincipal();
        preparaLabel();
        preparaText();
        preparaBotaoCarregar();
        preparaBotaoSair();
        mostraJanela();
    }
    
    private void preparaJanela() 
    {
        janela = new JFrame("Exemplo");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    private void mostraJanela() 
    {
        janela.pack();
        janela.setSize(600, 300);
        janela.setVisible(true);
    }
    
    private void preparaPainelPrincipal() 
    {
        painelPrincipal = new JPanel();
        painelPrincipal.setLayout(new BoxLayout(painelPrincipal, BoxLayout.PAGE_AXIS));
        
        janela.add(painelPrincipal);
        
        painelPrincipal.setLayout(new GridLayout(3, 2));
    }
    
    private void preparaLabel() 
    {
        label1 = new Label("Calculando dois números: ");
        painelPrincipal.add(label1);
    }
    
    private void preparaText() 
    {
        t1 = new TextField("");
        t2 = new TextField("");
        lblr = new Label("Resultado = ");
        lbl3 = new Label(" ");
        
        painelPrincipal.add(t1);
        painelPrincipal.add(t2);
        painelPrincipal.add(lblr);
        painelPrincipal.add(lbl3);
    }
    
    private void preparaBotaoCarregar() 
    {
        JButton btnSomar = new JButton("SOMA");   
        btnSomar.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                int resultado = Integer.parseInt(t1.getText()) + Integer.parseInt(t2.getText());
                String r = Integer.toString(resultado);
                
                lbl3.setText(r);
            }
        });
        painelPrincipal.add(btnSomar);

        JButton btnSubtrair = new JButton("SUBTRAIR");        
        btnSubtrair.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                int resultado = Integer.parseInt(t1.getText()) - Integer.parseInt(t2.getText());
                String r = Integer.toString(resultado);
                
                lbl3.setText(r);
            }
        });
        painelPrincipal.add(btnSubtrair);

        JButton btnMultiplicar = new JButton("MULTIPLICAR");        
        btnMultiplicar.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                int resultado = Integer.parseInt(t1.getText()) * Integer.parseInt(t2.getText());
                String r = Integer.toString(resultado);
                
                lbl3.setText(r);
            }
        });
        painelPrincipal.add(btnMultiplicar);

        JButton btnDividir = new JButton("DIVIDIR");        
        btnDividir.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                int n1 = Integer.parseInt(t1.getText());
                int n2 = Integer.parseInt(t2.getText());
                String r = "";
                
                if (n2 == 0) 
                {
                    r = "Não é possível realizar uma divisão por zero.";
                } 
                else 
                {
                    int resultado = n1 / n2;
                    r = Integer.toString(resultado);
                }
                                
                lbl3.setText(r);
            }
        });
        painelPrincipal.add(btnDividir);

        painelPrincipal.setLocation(50, 100);
    }
    
    private void preparaBotaoSair() 
    {
        JButton botaoSair = new JButton("Sair");
        
        botaoSair.addActionListener(new ActionListener() 
        {
            @Override 
            public void actionPerformed(ActionEvent e) 
            {
                System.exit(0);
            }
        });
    }
}