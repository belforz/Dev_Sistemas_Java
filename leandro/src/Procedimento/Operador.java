/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Procedimento;

import javax.swing.JOptionPane;

/**
 *
 * @author CAMARGO
 */
public class Operador {

    void soma() {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor A: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor B: "));
        int soma = a + b;
        JOptionPane.showMessageDialog(null, "O valor da soma" + soma);
    }

    void sub() {
        double c = Integer.parseInt(JOptionPane.showInputDialog("Digite o valr: "));
        double d = Integer.parseInt(JOptionPane.showInputDialog("Digite o valr: "));
        double sub = c - d;
        JOptionPane.showMessageDialog(null, "o valor da sub é" + sub);
    }

    void dic() {
        double c = Integer.parseInt(JOptionPane.showInputDialog("Digite o valr: "));
        double d = Integer.parseInt(JOptionPane.showInputDialog("Digite o valr: "));
        double dic1 = c / d;
        String formattedResult = String.format("%.2f", dic1 );
        JOptionPane.showMessageDialog(null, "o valor da sub é" + formattedResult);
    }


    
}
