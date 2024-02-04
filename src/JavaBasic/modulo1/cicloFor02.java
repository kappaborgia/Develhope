// Scrivi un programma che contenga un metodo che prende in ingresso un numero e il massimo numero di risultati 
// che vuoi avere e stampi tutti i numeri naturali in ordine inverso 
// (Quindi se passo il punto di partenza a 6 e gli dico di restituirmi 3 risultati mi aspetto in uscita [6 5 4] stampati).

public class cicloFor02 {
    public static void main(String[] args) {
        
        int numeroDiPartenza = 6;
        int maxNumber = 3;
        
        function(numeroDiPartenza, maxNumber);
    }
    public static void function(int numeroDiPartenza, int maxNumber){
        System.out.print("[");
        
        for (int i = numeroDiPartenza; i > maxNumber; i--){
            System.out.print(" " + i + " ");
        }
        
        System.out.print("]");
    }
}

