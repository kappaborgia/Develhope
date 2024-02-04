// Definisci un metodo per la divisione di 2 numeri interi che restituisca 
// il quoziente che dovrà essere stampato.

public class operatoriAritmetici01 {
    public static void main(String[] args){
        int x = 10;
        int y = 5;

        System.out.println("il quoziente è: " + division(x, y));
    }
    public static int division (int x, int y){
        int divisionOfNumber = x / y;
        return divisionOfNumber;
    }
}
