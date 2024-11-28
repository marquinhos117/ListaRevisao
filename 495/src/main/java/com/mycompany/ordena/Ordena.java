/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ordena;

/**
 *
 * @author Estudos
 */
import javax.swing.JOptionPane;

public class Ordena {

    public static void main(String[] args) {
        String[] vetor = new String[5];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = JOptionPane.showInputDialog("Digite a " + (i + 1) + "ª palavra:");
        }

        ordenar(vetor, vetor.length);

        StringBuilder resultado = new StringBuilder("Vetor ordenado:\n");
        for (String palavra : vetor) {
            resultado.append(palavra).append("\n");
        }

        JOptionPane.showMessageDialog(null, resultado.toString());
    }

    public static void ordenar(String[] vet, int tam) {
        String aux;
        for (int i = 0; i < tam - 1; i++) {
            for (int j = i + 1; j < tam; j++) {
                if (vet[i].compareTo(vet[j]) > 0) {
                    aux = vet[i];
                    vet[i] = vet[j];
                    vet[j] = aux;
                }
            }
        }
    }
}
