package JavaBasic.modulo1;
//Definire una funzione che accetti in ingresso 2 interi e ne restituisca la somma.

public class functionSum {
    public static void main(String[] arges){
        int number1 = 8;
        int number2 = 2;

        System.out.println("The sum is: " + somma(number1, number2));
    }

    public static int somma (int number1, int number2){
        return number1 + number2;
    }
}

