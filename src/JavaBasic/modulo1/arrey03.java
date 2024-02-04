package JavaBasic.modulo1;/* scrivere un programma che contenga un metodo che permetta di rimuovere gli elementi duplicati
 * in un arrey di interi. L'arrey ottenuto dovrà essere stampato
 */

import java.util.Arrays;

public class arrey03 {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 4, 4, 5, 6, 6, 6}; // Sostituisci con il tuo array di interi
        int[] arraySenzaDuplicati = rimuoviDuplicati(array);

        System.out.println("Array senza duplicati: " + Arrays.toString(arraySenzaDuplicati));
    }

    public static int[] rimuoviDuplicati(int[] array) {
        int lunghezzaOriginale = array.length;
        int nuovaLunghezza = 0;

        for (int i = 0; i < lunghezzaOriginale; i++) {
            boolean duplicato = false;
            for (int j = 0; j < nuovaLunghezza; j++) {
                if (array[i] == array[j]) {
                    duplicato = true;
                    break;
                }
            }
            if (!duplicato) {
                array[nuovaLunghezza] = array[i];
                nuovaLunghezza++;
            }
        }

        // Creiamo un nuovo array con la nuova lunghezza e copiamo i valori senza duplicati

        return Arrays.copyOf(array, nuovaLunghezza);
    }
}
