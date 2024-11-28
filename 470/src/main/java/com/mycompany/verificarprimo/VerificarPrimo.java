/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.verificarprimo;

/**
 *
 * @author Estudos
 */
import javax.swing.JOptionPane;

public class VerificarPrimo {

    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero maior que 0:"));
        boolean ehPrimo = Resultados.verificarPrimo(numero);
        String mensagem = ehPrimo ? "O numero " + numero + " e primo." : "O numero " + numero + " nao e primo.";
        JOptionPane.showMessageDialog(null, mensagem);
    }
}

class Resultados {
    public static boolean verificarPrimo(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
