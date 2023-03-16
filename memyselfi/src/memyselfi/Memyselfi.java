


package memyselfi;

import javax.swing.JOptionPane;

public class Memyselfi {

    void soma() {
        try {
            int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor A: "));
            int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor B: "));
            int soma = a + b;
            JOptionPane.showMessageDialog(null, "O valor da soma" + soma);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Characther inválido");
        }
    }

    void sub() {
        try {

            double c = Integer.parseInt(JOptionPane.showInputDialog("Digite o valr: "));
            double d = Integer.parseInt(JOptionPane.showInputDialog("Digite o valr: "));
            double sub = c - d;
            JOptionPane.showMessageDialog(null, "o valor da sub é" + sub);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Characther inválido");
        }
    }

    void dic() {
        try {
            double c = Integer.parseInt(JOptionPane.showInputDialog("Digite o valr: "));
            double d = Integer.parseInt(JOptionPane.showInputDialog("Digite o valr: "));
            double dic1 = c / d;
            String formattedResult = String.format("%.2f", dic1);
            JOptionPane.showMessageDialog(null, "o valor da div é" + formattedResult);
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Characther inválido");
        }
    }

    void multi() {
        try {
            double c = Integer.parseInt(JOptionPane.showInputDialog("Digite o valr: "));
            double d = Integer.parseInt(JOptionPane.showInputDialog("Digite o valr: "));
            double multi = c * d;
            String formattedResult = String.format("%.2f", multi);
            JOptionPane.showMessageDialog(null, "o valor da multi é" + formattedResult);
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Characther inválido");
        }
    }
}
