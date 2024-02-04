// Scrivere un programma che contenga un metodo che sfrutti il while loop e prenda in ingresso 1 valore 
// intero come limite superiore e calcoli la somma di tutti i valori prima del limite e la stampi a video.
// (Esempio passo 5 come limite e otterrò la somma di 1 + 2 + 3 + 4)

public class cicloWhile {
    public static void main(String[] args){
        int valore = 4;
        System.out.println(sommaValori(valore));

    }
    public static int sommaValori(int valore){
        int i = 0;
        int somma = 0;
        while (i <= valore){
            somma = somma + i;
            i = i + 1;          /* Si può anche scrivere i++ oppure i += 1 */
            
        }
        return somma;
    }
    
}
