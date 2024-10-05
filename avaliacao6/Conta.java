/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.avaliacao6;

/**
 *
 * @author labs
 */
public class Conta {
    private double saldo = 0; 

    public double getSaldo() {
        return saldo;
    }
    
    public void deposita(double valorDeposito) {
        if (valorDeposito > 0) { 
            saldo += valorDeposito; 
        }
    }
    
    public boolean saca(double valorSaque) {
        if (valorSaque > 0 && valorSaque <= saldo) { 
            saldo -= valorSaque; 
            return true; 
        }
        return false; 
    }
    
    public void atualizar(double taxa) {
        if (taxa > 0) {
            saldo -= saldo * (taxa / 100); 
        }
    }
}
