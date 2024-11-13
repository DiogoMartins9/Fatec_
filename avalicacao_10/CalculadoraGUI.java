/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.avalicacao_10;

/**
 *
 * @author labs
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraGUI {
    private JFrame frame;
    private JTextField display;
    private StringBuilder input;

    public CalculadoraGUI() {
        frame = new JFrame("Calculadora");
        frame.setSize(400, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);  // Centraliza a janela

        input = new StringBuilder();

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 4, 10, 10));

        display = new JTextField();
        display.setEditable(false);
        display.setFont(new Font("Arial", Font.PLAIN, 24));
        frame.add(display, BorderLayout.NORTH);

        String[] botoes = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", ".", "=", "+"
        };

        for (String texto : botoes) {
            JButton botao = new JButton(texto);
            botao.setFont(new Font("Arial", Font.PLAIN, 24));
            botao.addActionListener(new BotaoListener());
            panel.add(botao);
        }

        JButton limparButton = new JButton("C");
        limparButton.setFont(new Font("Arial", Font.PLAIN, 24));
        limparButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input.setLength(0);
                display.setText("");
            }
        });

        frame.add(limparButton, BorderLayout.SOUTH);
        frame.add(panel, BorderLayout.CENTER);

        frame.setVisible(true);
    }

    private class BotaoListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String texto = e.getActionCommand();

            if (texto.equals("=")) {
                try {
                    String resultado = calcularExpressao(input.toString());
                    display.setText(resultado);
                    input.setLength(0);
                } catch (Exception ex) {
                    display.setText("Erro");
                    input.setLength(0);
                }
            } else {
                input.append(texto);
                display.setText(input.toString());
            }
        }
    }

    private String calcularExpressao(String expressao) throws Exception {
        try {
            double resultado = eval(expressao);
            return String.valueOf(resultado);
        } catch (Exception e) {
            throw new Exception("Erro na expressão");
        }
    }

    private double eval(String expressao) throws Exception {
        expressao = expressao.replaceAll("\\s", "");

        double resultado = 0;
        String[] tokens = expressao.split("(?<=\\d)(?=[+-/*])|(?<=[+-/*])(?=\\d)");

        if (tokens.length < 3) {
            return Double.parseDouble(tokens[0]);
        }

        resultado = Double.parseDouble(tokens[0]);

        for (int i = 1; i < tokens.length; i += 2) {
            String operador = tokens[i];
            double numero = Double.parseDouble(tokens[i + 1]);

            switch (operador) {
                case "+":
                    resultado += numero;
                    break;
                case "-":
                    resultado -= numero;
                    break;
                case "*":
                    resultado *= numero;
                    break;
                case "/":
                    if (numero == 0) throw new ArithmeticException("Divisão por zero");
                    resultado /= numero;
                    break;
                default:
                    throw new Exception("Operação inválida");
            }
        }

        return resultado;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CalculadoraGUI();
            }
        });
    }
}
