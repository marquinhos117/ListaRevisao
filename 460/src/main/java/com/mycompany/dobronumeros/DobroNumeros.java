/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dobronumeros;

/**
 *
 * @author Estudos
 */
import javax.swing.JOptionPane;

public class DobroNumeros {

    public static void main(String[] args) {
        StringBuilder resultado = new StringBuilder("Resultados:\n");

        for (int i = 1; i <= 3; i++) {
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o número " + i + ":"));
            resultado.append("Número: ").append(numero).append(" - Dobro: ").append(Resultados.calcularDobro(numero)).append("\n");
        }

        JOptionPane.showMessageDialog(null, resultado.toString());
    }
}

class Resultados {
    public static int calcularDobro(int x) {
        return x * 2;
    }
}
