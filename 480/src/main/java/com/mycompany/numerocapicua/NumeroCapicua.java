/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numerocapicua;

/**
 *
 * @author Estudos
 */
import javax.swing.JOptionPane;

public class NumeroCapicua {

    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite numero:"));
        int reverso = Resultados.reverso(numero);
        String mensagem = numero == reverso ? numero + " - " + reverso + "\nE um numero capicua" : numero + " - " + reverso + "\nNao e um numero capicua";
        JOptionPane.showMessageDialog(null, mensagem);
    }
}

class Resultados {
    public static int reverso(int num) {
        int soma = 0;
        while (num > 0) {
            int r = num % 10;
            soma = soma * 10+ r;
            num = num / 10;
        }
        return soma;
    }
}
