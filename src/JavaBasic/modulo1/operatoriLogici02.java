// Scrivi un programma che contiene un metodo che prenda un numero in ingresso e capisca se 
// un numero è pari o dispari utilizzando solo gli operatori logici.

public class operatoriLogici02 {
    public static void main(String[] args) {
        int x = 3;
        System.out.println(paroDisparo(x));
    
    }
    public static boolean paroDisparo( int x ){
        boolean verifica = x % 2 == 0;
        return verifica;  
    
    }
        
        
}
