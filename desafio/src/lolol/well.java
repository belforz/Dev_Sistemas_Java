package lolol;

import javax.swing.JOptionPane;

/**
 *
 * @author CAMARGO
 */
public class well {
        // USANDO ESTA CLASSE COMO UM MÉTODO FUNCIONAL, SEM USO DA MAIN DENTRO DELA , USA-SE DESSE JEITO//
        // TODAS COM TRY/CATCH PARA IMPEDIR CARATERES INVÁLIDOS
        // TODAS COM IF/ELSE ||(OU) 
        // SÃO CHAMADAS NA MAIN DE FORMA SEPARADA//
    void triangulo() {
        try{
        int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de área"));

        if (a == 0 && a >= 1000) {
            System.out.println("Valor acima do normal,tente outra vez");
        } else {
            
        }

        int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da base"));

        if (b == 0 || b >= 1000) {
            System.out.println("Valor acima do normal,tente outra vez");
        } else {
            
        }

        int res_t = (a + b) / 2;
        JOptionPane.showMessageDialog(null, "O valor do triangulo é: " + res_t);
        } catch(Exception e){
        JOptionPane.showMessageDialog(null, "Characther inválido");

            }
    }
    
      void quadrado() {
        try {

        int ab = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de área"));

        if (ab == 0 && ab >= 1000) {
            System.out.println("Valor acima do normal,tente outra vez");
        } else {
          

        }

        int res_t = ab * ab;
        JOptionPane.showMessageDialog(null, "O valor do quadrado é: " + res_t);
        } catch(Exception e){
        JOptionPane.showMessageDialog(null, "Characther inválido");

            }
    }

    void retangulo() {
        try{
        int abc = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de área"));

        if (abc == 0 || abc >= 1000) {
            System.out.println("Valor acima do normal,tente outra vez");
        } else {
            System.out.println("Erro");
        }

        int bca = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da base"));

        if (bca == 0 || bca >= 1000) {
            System.out.println("Valor acima do normal,tente outra vez");
        } else {
           
        }

        int res_t = abc * bca ;
        JOptionPane.showMessageDialog(null, "O valor do retangulo é: " + res_t);
        
        } catch(Exception e){
        JOptionPane.showMessageDialog(null, "Characther inválido");

            }
    }
    
    void circulo  () {
        try {

        double radius = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da raio"));

        if (radius == 0 || radius >= 1000) {
            System.out.println("Valor acima do normal,tente outra vez");
        } else {
           
        }

        double res_t = 2 * Math.PI * radius ;
        String formattedResult = String.format("%.2f", res_t );
        JOptionPane.showMessageDialog(null, "o valor da circulo é" + formattedResult);
        
        
        } catch(Exception e){
        JOptionPane.showMessageDialog(null, "Characther inválido");

            }
    }


}
