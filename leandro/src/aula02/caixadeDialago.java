/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula02;

import javax.swing.JOptionPane;

/**
 *
 * @author CAMARGO
 */
public class caixadeDialago {

    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite seu nome");

        JOptionPane.showMessageDialog(null, "Eu amo você: " + nome);

    }

}
