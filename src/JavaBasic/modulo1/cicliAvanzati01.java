// Scrivi un programma che contenga un metodo che prende in ingresso un valore numerico e stampa tutti 
// i numeri fino al valore immesso, la stampa dovrà interrompersi se il valore è uguale a 5.

public class cicliAvanzati01 {
    public static void main(String[] args) {
        int number = 5;
        stampa(number);

    }
    public static void stampa(int number){
        for (int i = 0; i <= number; i++){
            if (number == 5){
                System.out.println("The value is the same of 5");
                break;
            }
            System.out.print(i + " ");
        }
    }
    
}
