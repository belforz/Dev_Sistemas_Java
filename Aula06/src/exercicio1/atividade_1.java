
package exercicio1;



public class atividade_1 {

    void par_impar() {
        try {
            int somaPar = 0;
            int somaImpar = 0;

            for (int i = 1; i <= 100; i++) {
                if (i % 2 == 0) {

                    somaPar += i;

                    System.out.println(i + " <Seu indice " + "," + " Este é valor para par: > " + somaPar);

                } else {

                    somaImpar += i;
                    System.out.println(i + " <Seu indice " + "," + " Este é o valor para impar: > " + somaImpar);

                }
                int soma_global = somaPar + somaImpar;
                System.out.println("Soma dos valores pares e impares anteriores:  " + soma_global);

                if (somaPar < somaImpar) {
                    System.out.println("Quem é o maior: " + somaImpar);
                } else {
                    System.out.println("Quem é o maior: " + somaPar);
                }

            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
   
        
    
    
