/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade5;
import javax.swing.JOptionPane;
import java.time.LocalDate;
import java.time.Period;

/**
 *3ª) Criar uma classe Pessoa com as seguintes características:
• atributos: idade e dia, mês e ano de nascimento, nome da pessoa
• métodos:
o calculaIdade(), que recebe a data atual em dias, mês e anos e calcula e armazena no atributo idade a idade atual da pessoa;
o informaIdade(), que retorna o valor da idade
o informaNome(), que retorna o nome da pessoa
o ajustaDataDeNascimento(), que recebe dia, mês e ano de nascimento como parâmetros e preenche nos atributos correspondentes do objeto.
• Criar dois objetos da classe Pessoa, um representando Albert Einstein (nascido em 14/3/1879) e o outro representando Isaac Newton (nascido em 4/1/1643)
• Fazer uma classe principal que instancie os objetos, inicialize e mostre quais seriam as idades de Einstein e Newton caso estivessem vivos.
TPI-5
 * @author labs
 */

public class Pessoa {

    private String nome;
    private int diaNascimento;
    private int mesNascimento;
    private int anoNascimento;
    private int idade;

    public Pessoa(String nome) {
        this.nome = nome;
        this.diaNascimento = 0;
        this.mesNascimento = 0;
        this.anoNascimento = 0;
        this.idade = 0;
    }

    public void ajustaDataDeNascimento(int dia, int mes, int ano) {
        this.diaNascimento = dia;
        this.mesNascimento = mes;
        this.anoNascimento = ano;
    }

    public void calculaIdade(int diaAtual, int mesAtual, int anoAtual) {
        LocalDate dataNascimento = LocalDate.of(anoNascimento, mesNascimento, diaNascimento);
        LocalDate dataAtual = LocalDate.of(anoAtual, mesAtual, diaAtual);
        this.idade = Period.between(dataNascimento, dataAtual).getYears();
    }

    public int informaIdade() {
        return this.idade;
    }

    public String informaNome() {
        return this.nome;
    }

    public static void main(String[] args) {
        Pessoa einstein = new Pessoa("Albert Einstein");
        einstein.ajustaDataDeNascimento(14, 3, 1879);
        einstein.calculaIdade(18, 9, 2024);

        Pessoa newton = new Pessoa("Isaac Newton");
        newton.ajustaDataDeNascimento(4, 1, 1643);
        newton.calculaIdade(18, 9, 2024);

        JOptionPane.showMessageDialog(null, einstein.informaNome() + " teria " + einstein.informaIdade() + " anos hoje.");
        JOptionPane.showMessageDialog(null, newton.informaNome() + " teria " + newton.informaIdade() + " anos hoje.");
    }
}



