// Scrivi un programma che contiene un metodo che dati 2 interi in ingresso ed un valore di confronto
// verifichi se il numero di confronto è compreso tra due valori specifici e 
// stampi il risultato dell'operazione comprensivo dei due limiti (inferiore e superiore)

public class operatoriLogici01 {
    public static void main(String[] args) {
        int x = 4;
        int y = 9;
        int valueOfcomparison = 7;
        
        System.out.println("The value of comparation  is: " + comparation(x, y, valueOfcomparison) + " because the lower value is: " + x + " and the higher value is: " + y);
    }

    public static boolean comparation(int x, int y, int valueOfcomparison){
        return valueOfcomparison < y && valueOfcomparison > x;
    }

}
