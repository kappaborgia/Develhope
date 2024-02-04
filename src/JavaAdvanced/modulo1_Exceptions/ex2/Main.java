package JavaAdvanced.modulo1_Exceptions.ex2;

/* Scriivere una funzione che controlli se un carattere è un numero altrimenti lanciare una eccezione
* */
public class Main {
    public static void main(String[] args) {
        char carattere = '5'; // Cambia il carattere da controllare

        try {
            verificaNumero(carattere);
        } catch (NonNumeroException e) {
            System.out.println("Eccezione: " + e.getMessage());
        }
    }

    public static void verificaNumero(char carattere) throws NonNumeroException {
        if (Character.isDigit(carattere)) {
            System.out.println("Il carattere è un numero.");
        } else {
            throw new NonNumeroException("Il carattere non è un numero.");
        }
    }
}



