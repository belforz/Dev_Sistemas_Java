
package exercicio1;



public class atividade_1 {
    void a_v() {
        try {
            int par = 0;
            
            for (int i = 0; i <= 100; i++) {
                if (i % 2 == 0) {
                    int par_1 = par + i;
                    int soma = (i % 2) + par_1;
                    
                    
                    System.out.println(i + " <Seu indice " + "," + " Este numero é par: >" + soma);
                    
                } else{
                   
                    System.out.println(i + " <Seu indice " + "," + " Este numero é impar: > " + i);
                    
                    
                } 
                 
            }} catch (Exception e) {
            System.out.println(e);
        }

        }}

   
        
    
    
