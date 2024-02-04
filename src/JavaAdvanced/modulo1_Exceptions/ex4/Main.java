package JavaAdvanced.modulo1_Exceptions.ex4;
/* Scrivere una funzione che accetti un array in input e provi a dividere un numero dell'array
per 0 e gestista sia l'eccezione della divisione che quella di indice non presente nell'array,
leggendone il messaggio. Eseguire sempre un blocco di codice scrivendo un messaggio in console.*/
public class Main {
    public static void main(String[] args) {
        int[] array = { 5, 8, 10, 0, 3 }; // Cambia l'array secondo le tue esigenze

        try {
            eseguiOperazioni(array);
        } catch (Exception e) {
            System.out.println("Eccezione: " + e.getMessage());
        }
    }

    public static void eseguiOperazioni(int[] array) {
        try {
            // Prova a dividere un numero dell'array per 0
            int risultato = array[2] / array[3];
            System.out.println("Risultato della divisione: " + risultato);

            // Prova ad accedere a un indice non presente nell'array
            int valore = array[10];
        } catch (ArithmeticException e) {
            // Gestisci l'eccezione della divisione per zero
            throw new RuntimeException("Errore di divisione per zero: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            // Gestisci l'eccezione di indice non presente nell'array
            throw new RuntimeException("Errore di accesso a un indice non presente nell'array: " + e.getMessage());
        }
    }
}

