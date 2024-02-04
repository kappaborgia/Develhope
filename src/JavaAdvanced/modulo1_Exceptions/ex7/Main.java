package JavaAdvanced.modulo1_Exceptions.ex7;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* Scrivere una funzione che restituisca un hashset riempito
Leggere l'hashSet e stampre grandezza ed elementi
Il tuo esercizio */
public class Main {
    public static void main(String[] args) {
        functionHashSet();
    }
    public static void functionHashSet(){
        Set<Integer> numbers = new HashSet<Integer>(Arrays.asList(1,2,3,4));
        System.out.println("Elementi dell'HashSet: " + numbers);
        System.out.println("Grandezza dell'HashSet: " + numbers.size());
    }
}
