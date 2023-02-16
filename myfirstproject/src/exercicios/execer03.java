/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;
import java.util.Scanner;
/**
 *
 * @author CAMARGO
 */

public class execer03 {

    public static void main(String[] args) {
         int conta = 5 + 6;
        System.out.println(conta);

        int conta1 = 5 * 2;
        System.out.println(conta1);

        int conta2 = 6 / 2;
        System.out.println(conta2);

        float conta3 = (7 * 8) * (456 / 6);
        System.out.printf("Valor em:: %.2f ", conta3);
        
        
        

         
        
        
        Scanner x = new Scanner(System.in);
         int y,z;
         System.out.println("Digite o valor de a: ");
         y = x.nextInt();
          System.out.println("Digite o valor de b: ");
         z = x.nextInt();
         
         int soma = y+z;
          System.out.println("Digite o valor de a+b: " + soma);
       
         Scanner p = new Scanner(System.in);
         float b,h;
         System.out.println("Digite o valor de r: ");
         b = p.nextInt();
          System.out.println("Digite o valor de h: ");
         h = p.nextInt();
          System.out.println("Digite o valor de h: ");
        
         float triangulo = (b*h)/2;
          System.out.printf("Digite o valor de triangulo: %.1f " , triangulo);
       
         
    }
    }

