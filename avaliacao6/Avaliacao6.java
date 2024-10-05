/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.avaliacao6;
import java.util.Scanner;
/**
 *
 * @author labs
 */

public class Avaliacao6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Conta  minhaConta= new Conta();
        
        System.out.print("Digite o valor a ser depositado: ");
        double valorDeposito = scanner.nextDouble();
        minhaConta.deposita(valorDeposito);
        
        System.out.println("Saldo após depósito: " + minhaConta.getSaldo());
        
        System.out.print("Digite o valor a ser sacado: ");
        double valorSaque = scanner.nextDouble();
        boolean saqueRealizado = minhaConta.saca(valorSaque);
        
        if (saqueRealizado) {
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Saque não realizado. Saldo insuficiente.");
        }
        
        System.out.println("Saldo após saque: " + minhaConta.getSaldo());
        
        System.out.print("Digite a taxa percentual para atualizar o saldo: ");
        double taxa = scanner.nextDouble();
        minhaConta.atualizar(taxa);
       
        System.out.println("Saldo após atualização com a taxa: " + minhaConta.getSaldo());
        
        scanner.close();
    }
}

