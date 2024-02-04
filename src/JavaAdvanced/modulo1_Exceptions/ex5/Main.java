package JavaAdvanced.modulo1_Exceptions.ex5;
/* Scrivere una funzione che accetti in input un numeratore e un denominatore
Controlli che il numeratore e il denominatore non siano null
Usare la funzione appena scritta in due blocchi di codice dove si cattura l'eventuale eccezione.*/
public class Main {
    public static void main(String[] args) {
        try{
            int numeratore1 = 10;
            Integer denoinatore1 = null;
            Divisione(numeratore1, null);
        }catch(IllegalArgumentException e){
            System.out.println("Eccezione nel blocco 1 : " + e.getMessage());
        }
    }
    public static void Divisione(Integer numeratore1, Integer denominatore1){
        if (numeratore1 == null || denominatore1 == null){
            throw new IllegalArgumentException("Il numeratore o il denominatore non devono essere nulli");
        }
        try{
            int risultato = numeratore1 / denominatore1;
            System.out.println("Risultato della divisione: " + risultato);
        }catch(ArithmeticException e){
            throw new RuntimeException("Errore di divisione per zero: " + e.getMessage());
        }

    }
}


