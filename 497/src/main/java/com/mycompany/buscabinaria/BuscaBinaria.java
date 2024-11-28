/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.buscabinaria;

/**
 *
 * @author Estudos
 */
import javax.swing.JOptionPane;

public class BuscaBinaria {

    public static void main(String[] args) {
        int[] numeros = new int[10];
        int chave, posicao;

        for (int i = 0; i < 10; i++) {
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite numero " + (i + 1) + ":"));
        }

        chave = Integer.parseInt(JOptionPane.showInputDialog("Digite numero de busca:"));
        
        ordena(numeros, 10);

        posicao = busca(numeros, 10, chave);

        StringBuilder resultado = new StringBuilder("VETOR\n");
        for (int i = 0; i < 10; i++) {
            resultado.append(i + 1).append(" - ").append(numeros[i]).append("\n");
        }

        if (posicao != -1) {
            resultado.append("\nPosicao no vetor: ").append(posicao + 1);
        } else {
            resultado.append("\nNao ENCONTRADO");
        }

        JOptionPane.showMessageDialog(null, resultado.toString());
    }

    public static int busca(int[] vet, int tam, int chave) {
        int inicio = 0, fim = tam - 1, meio;

        while (inicio <= fim) {
            meio = (inicio + fim) / 2;
            if (vet[meio] == chave) {
                return meio;
            } else if (vet[meio] > chave) {
                fim = meio - 1;
            } else {
                inicio = meio + 1;
            }
        }
        return -1;
    }

    public static void ordena(int[] vet, int tam) {
        int aux;
        for (int i = 0; i < tam - 1; i++) {
            for (int j = i + 1; j < tam; j++) {
                if (vet[i] > vet[j]) {
                    aux = vet[i];
                    vet[i] = vet[j];
                    vet[j] = aux;
                }
            }
        }
    }
}
