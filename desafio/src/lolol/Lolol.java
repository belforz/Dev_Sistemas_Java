
package lolol;

import javax.swing.JOptionPane;

public class Lolol {

    public static void main(String[] args) {

        well x = new well();
        //AQUI SE CHAMA A CLASS A INSTANCIADO E COMO NOVA(NEW)//
       
        // AQUI SE CHAMA O MÉTODO DA CLASS WELL EM QUE FAZ A CONTA DO TRIANGULO//
        well y = new well();
        well a = new well();

        try { //usa-se try e catch novamente para impedir caracteres inválidos//
            int escolha = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção:\n1 - Triângulo\n2 - Retângulo\n3 - Quadrado"));
            // usa-se uma nova variavel para dar o usuário a opção de escolher a opção no encadeamento//

            if (escolha == 1) { //AQUI ELE TENTA ME CORRIGIR PEDINDO O SWITCH STATEMENT. MAS FOI PEDIDO POR IF// SEGUE A LÓGICA//
                x.triangulo();
                // AQUI SE CHAMA O MÉTODO DA CLASS WELL EM QUE FAZ A CONTA DO TRIANGULO//
                //retorno o método da classe well para esta lógica//
            } else if (escolha == 2) {
                y.retangulo();
            } else if (escolha == 3) {
                a.quadrado();
            } else {
                JOptionPane.showMessageDialog(null, "Opção inválida!");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Caractere inválido!");
        }

    }
}

