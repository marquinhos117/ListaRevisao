/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vetoresmenu;

/**
 *
 * @author Estudos
 */
import javax.swing.JOptionPane;

public class VetoresMenu {

    public static void main(String[] args) {
        int[] vetorA = new int[5];
        int[] vetorB = new int[5];
        int op, flagA = 0, flagB = 0;

        while (true) {
            op = Integer.parseInt(JOptionPane.showInputDialog(
                    "\n\nVETORES\n" +
                    "1. Dados do VETOR A\n" +
                    "2. Dados do VETOR B\n" +
                    "3. Imprime VETORES\n" +
                    "4. Soma VETORES\n" +
                    "5. Subtrai VETORES\n" +
                    "6. Sai do programa\n" +
                    "OPCAO:"));

            switch (op) {
                case 1:
                    entrada(vetorA, "A");
                    flagA = 1;
                    break;
                case 2:
                    entrada(vetorB, "B");
                    flagB = 1;
                    break;
                case 3:
                    if (flagA > 0 && flagB > 0) {
                        imprime(vetorA, "A");
                        imprime(vetorB, "B");
                    } else {
                        JOptionPane.showMessageDialog(null, "Escolha primeiro as opções 1 e 2.");
                    }
                    break;
                case 4:
                    if (flagA > 0 && flagB > 0) {
                        soma(vetorA, vetorB);
                    } else {
                        JOptionPane.showMessageDialog(null, "Escolha primeiro as opções 1 e 2.");
                    }
                    break;
                case 5:
                    if (flagA > 0 && flagB > 0) {
                        subtrai(vetorA, vetorB);
                    } else {
                        JOptionPane.showMessageDialog(null, "Escolha primeiro as opções 1 e 2.");
                    }
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, "Saindo do algoritmo.");
                    return;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida.");
            }
        }
    }

    public static void entrada(int[] vetor, String nome) {
        for (int i = 0; i < 5; i++) {
            vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite numero " + (i + 1) + " do VETOR " + nome + ":"));
        }
    }

    public static void imprime(int[] vetor, String nome) {
        StringBuilder sb = new StringBuilder("\nVETOR " + nome + "\n");
        for (int i = 0; i < 5; i++) {
            sb.append(i + 1).append(" - ").append(vetor[i]).append("\n");
        }
        JOptionPane.showMessageDialog(null, sb.toString());
    }

    public static void soma(int[] vetorA, int[] vetorB) {
        StringBuilder sb = new StringBuilder("\nSOMA\n");
        for (int i = 0; i < 5; i++) {
            sb.append(vetorA[i] + vetorB[i]).append("\n");
        }
        JOptionPane.showMessageDialog(null, sb.toString());
    }

    public static void subtrai(int[] vetorA, int[] vetorB) {
        StringBuilder sb = new StringBuilder("\nDIFERENCA\n");
        for (int i = 0; i < 5; i++) {
            sb.append(vetorA[i] - vetorB[i]).append("\n");
        }
        JOptionPane.showMessageDialog(null, sb.toString());
    }
}
