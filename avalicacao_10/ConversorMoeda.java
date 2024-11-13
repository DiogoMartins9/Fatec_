/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.avalicacao_10;

import javax.swing.*;
import java.awt.event.*;

public class ConversorMoeda {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Conversor de Moeda");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel labelReais = new JLabel("Valor em Reais:");
        labelReais.setBounds(30, 30, 150, 30);
        JTextField textFieldReais = new JTextField();
        textFieldReais.setBounds(180, 30, 150, 30);

        JRadioButton radioButtonDolar = new JRadioButton("Dólar");
        radioButtonDolar.setBounds(30, 70, 100, 30);
        JRadioButton radioButtonEuro = new JRadioButton("Euro");
        radioButtonEuro.setBounds(130, 70, 100, 30);
        JRadioButton radioButtonLibra = new JRadioButton("Libra");
        radioButtonLibra.setBounds(230, 70, 100, 30);

        ButtonGroup group = new ButtonGroup();
        group.add(radioButtonDolar);
        group.add(radioButtonEuro);
        group.add(radioButtonLibra);

        JButton buttonConverter = new JButton("Converter");
        buttonConverter.setBounds(30, 110, 300, 30);

        JLabel labelResultado = new JLabel("Resultado:");
        labelResultado.setBounds(30, 150, 300, 30);

        frame.add(labelReais);
        frame.add(textFieldReais);
        frame.add(radioButtonDolar);
        frame.add(radioButtonEuro);
        frame.add(radioButtonLibra);
        frame.add(buttonConverter);
        frame.add(labelResultado);

        buttonConverter.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double valorReais = Double.parseDouble(textFieldReais.getText());
                    double resultado = 0;
                    String moeda = "";

                    if (radioButtonDolar.isSelected()) {
                        resultado = valorReais * 6;  
                        moeda = "Dólares";
                    } else if (radioButtonEuro.isSelected()) {
                        resultado = valorReais * 7;  
                        moeda = "Euros";
                    } else if (radioButtonLibra.isSelected()) {
                        resultado = valorReais * 10;  
                        moeda = "Libras Esterlinas";
                    }

                    labelResultado.setText(String.format("Resultado: %.2f %s", resultado, moeda));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Por favor, insira um valor válido em Reais.");
                }
            }
        });

        frame.setVisible(true);
    }
}

