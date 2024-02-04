// Scrivi un programma che contiene un metodo che date due variabili 
// le incrementi di un valore scelto da te e le moltiplichi fra di loro.

public class operatoriAritmetici03 {
    public static void main(String[] args){
        int x = 5;
        int y = 6;
        x++;
        y++;

        System.out.println("the result is: " + prodotto(x, y));
    }
    public static int prodotto(int x, int y){
        int prodottoOf = x * y;
        return prodottoOf;
    }

    
}
