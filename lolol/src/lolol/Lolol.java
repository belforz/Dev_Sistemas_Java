/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lolol;

import javax.swing.JOptionPane;


/**
 *
 * @author CAMARGO
 */
public class Lolol {  
    public static void main(String[] args) {
        
        void triangulo(){ 
              
    int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de área"));
    
    if(a ==0 && a>=1000){
        System.out.println("Valor acima do normal,tente outra vez");
    }
        else {
          System.out.println("Erro");
    }
    
    int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da base"));
    
        if(b ==0 && b>=1000){
        System.out.println("Valor acima do normal,tente outra vez");
        }
        else{
          System.out.println("Erro");
    }
    
    int res_t = (a + b) / 2;
         JOptionPane.showMessageDialog(null,"O valor do triangulo é: " + res_t);
}

void quadrado(){

int ab = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de área"));
    
    if(ab ==0 && ab>=1000){
        System.out.println("Valor acima do normal,tente outra vez");
    }
    else {
          System.out.println("Erro");
    
    }
    
    int res_t = ab * ab;
      JOptionPane.showMessageDialog(null,"O valor do triangulo é: " + res_t);
}

    void retangulo(){
     int abc = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de área"));
    
    if(abc ==0 && abc>=1000){
        System.out.println("Valor acima do normal,tente outra vez");
        }
        else {
          System.out.println("Erro");
    }
    
    int bca = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da base"));
    
        if(bca ==0 && bca>=1000){
        System.out.println("Valor acima do normal,tente outra vez");
        }
        else {
          System.out.println("Erro");
    }
    
    int res_t = (abc + bca) / 2;
      JOptionPane.showMessageDialog(null,"O valor do triangulo é: " + res_t);
    }
    
        
        
    }

    

