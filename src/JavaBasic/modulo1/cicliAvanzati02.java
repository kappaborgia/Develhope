// Scrivi un programma che contenga un metodo che prende in ingresso un valore numerico e stampa tutti i 
// numeri fino al valore immesso, la stampa dovrà saltare il valore uguale a 5.

public class cicliAvanzati02 {
    public static void main(String[] args) {
        int number = 20;
        function(number);
    }
    public static void function(int number){
        for(int i = 0; i <= number; i++){
            
            if (i == 5){
                continue;
                
            }
            System.out.print(i + " ");            
        }
    }
}