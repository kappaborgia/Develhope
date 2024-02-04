package JavaAdvanced.modulo1_Exceptions.ex6;
/* Scrivere una funzione che accetti in input 2 int e ne stampi la somma
Scrivere una funzione che accetti in input 1 char lo stampi
Scrivere una funzione che accetti in input 2 Integer e ne stampi la somma
Scrivere una funzione che accetti in input 1 Character lo stampi
Scrivere un un valore primitivo per int, double e char e fare autoboxing
Scrivere un oggetto per Integer, Double e Character e fare Unboxing
Usare le funzioni scritte con i valori creati*/
public class Main {
    public static void main(String[] args) {
        sumOfint(6,4);
        pritnChar('a');
        sumOfinteger(3,7);
        printCharacter('k');

    }
    public static int sumOfint(int number1, int number2){
        int result = number1 + number2;
        System.out.println(result);
        return result;
    }
    public static char pritnChar(char character){
        System.out.println(character);
        return character;
    }
    public static Integer sumOfinteger(Integer number1, Integer number2){
        Integer result = number1 + number2;
        System.out.println(result);
        return result;
    }
    public static Character printCharacter(Character letter){
        System.out.println(letter);
        return letter;
    }
}
