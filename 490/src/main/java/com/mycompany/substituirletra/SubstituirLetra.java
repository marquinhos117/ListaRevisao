/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.substituirletra;

/**
 *
 * @author Estudos
 */
import javax.swing.JOptionPane;

public class SubstituirLetra {

    public static void main(String[] args) {
        String[] nome = new String[10];
        String caractereSubstituir = JOptionPane.showInputDialog("Digite o caractere que deseja substituir:");

        StringBuilder resultado = new StringBuilder();

        // Recebe as 10 palavras e substitui a letra
        for (int L = 0; L < 10; L++) {
            nome[L] = JOptionPane.showInputDialog("Digite palavra em letras minusculas " + (L + 1) + ":");
            String palavraModificada = Resultados.substituirLetra(nome[L], caractereSubstituir);
            resultado.append((L + 1) + " - " + palavraModificada + "\n");
        }

        // Exibe o resultado final com as palavras modificadas
        JOptionPane.showMessageDialog(null, resultado.toString());
    }
}

class Resultados {
    public static String substituirLetra(String palavra, String letra) {
        // Converte a palavra em um array de caracteres
        char[] chars = palavra.toCharArray();

        // Substitui as ocorrências da letra pelo caractere '*'
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == letra.charAt(0)) {
                chars[i] = '*';  // Substitui o caractere por '*'
            }
        }

        // Retorna a palavra modificada
        return new String(chars);
    }
}
