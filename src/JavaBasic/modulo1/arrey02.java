package JavaBasic.modulo1;
/* Scrivi un programma che contenga un metodo che crea un arrey e lo riempie con dei caratteri.
 * Questo metodo dovrà poi stampare tutte le occorrenze del carattere 'a' o 0 in caso non ce ne siano
*/

public class arrey02 {
    public static void main(String[] args) {
        char[] caratteri = {'a','c','d','f','e','a','r','f','a','a','e','t'};
        int conteggio = contaCaratteriA(caratteri);
        System.out.println(conteggio);
     
    }
    public static int contaCaratteriA(char[] Arrays){
        int conteggio = 0;
        for (char caratteri : Arrays){
            if (caratteri == 'a'){
                conteggio++;
            }
        }
        return conteggio;    
    }
}

        
     