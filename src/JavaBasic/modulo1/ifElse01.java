// Scrivere un programma che stampi i numeri da 1 a 100. Per i multipli di 3 stampi "Fizz" 
// al posto del numero e per i multipli di 5 stampi "Buzz".
// Nel caso in cui un numero sia multiplo di entrambi stampi "FizzBuzz".

public class ifElse01 {
   public static void main(String[] args) {
        stampaSequenza(1);
    }

    public static void stampaSequenza(int number) {
        if (number > 100) {
            return;
        }

        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (number % 3 == 0) {
            System.out.println("Fizz");
        } else if (number % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(number);
        }

        stampaSequenza(number + 1);
    }
}
 

