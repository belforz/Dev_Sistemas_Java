
package aula_07;

/**
 *
 * @author Leandro
 */
public class Aula_07 {
    public static void main(String[] args) {
        
        
        int i = 0;
        int soma_par = 0;
        int soma_impar = 0;

        while (i <= 100) {
            
            if (i % 2 == 0) {  
            soma_par += i;

                System.out.println("Isto é par: " + soma_par + " Isto é indice par > " + i);
            } else {
                
            soma_impar += i;
                System.out.println("Isto é impar: " + soma_impar + " Isto é indice impar > " + i);
            }
            
            
            i++;
        }
        int soma = soma_par + soma_impar;
            System.out.println("Soma total dos núemeros: " + soma);

    }
}
