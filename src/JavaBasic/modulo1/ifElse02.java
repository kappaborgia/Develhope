// Scrivi un programma che calcoli la lunghezza di una stringa, 
// sulla base di questa lunghezza stampi 
// "Lunghezza maggiore di 10", "Lunghezza minore di 10" o "Lunghezza pari a 10".

public class ifElse02 {
    public static void main(String[] args) {
        
        String word = "lunghezza della stringa";
        lunghezzaStringa(word);
    }
    
    public static void lunghezzaStringa(String word){
        if (word.length() > 10){
            
            System.out.println("La lunghezza della stringa è maggiore di 10");
        
        } else if (word.length() < 10){
        
            System.out.println("La lunghezza della stringa è minore di 10");
        
        } else {
        
            System.out.println("La lunghezza è pari a 10");
        
        }

        
    }
}
