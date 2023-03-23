
package exercicio1;


public class exercicio_2 {
    public static void main(String[] args) {
       int result = 0;
       int n1 = 0;
       int n2 = 1;
       
       for(int i = 0 ; i <=10 ; i++){
           if( n1 == 0 ){
               System.out.println(n1);
               System.out.println(n2);
           }
           result = n1 + n2;
           n1 = n2;
           n2 = result ;
           
           System.out.println(result);
        
         
        }
          
  
    
    }}