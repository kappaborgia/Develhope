package JavaBasic.modulo1;
/* scrivi unn programma che contenga un metodo che crea un arrey e lo riempie con i numeri da 1 a 10
 * e che calcoli la somma dei numeri contenuti nell'arrey inizializzato e la stampi a video.
 */

public class arrey01 {
    public static void main(String[] args) {
       int[] arrey = new int[10];
       functionArrey(arrey);
       //System.out.println(java.util.Arrays.toString(arrey));
       
    }
    public static void functionArrey(int[] Arrays){
        int somma = 0;
        for (int i = 0; i < Arrays.length; i++){
            Arrays[i] = i + 1;
            somma = somma + Arrays[i];
        }
        System.out.println(somma);
    }

    
}
