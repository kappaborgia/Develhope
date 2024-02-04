package JavaAdvanced.modulo2_ListMapRecord.ex2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*
Creare una classe Student che accenti nel costruttore il parametro name (String e age Int)
In questa classe avere i metodi pubblici per ottenere le informazioni.
Creare un ArrayList con 12 elementi e stamparlo in console.
mettere in ordine la collezione e stampare il risultato*/
public class Main {
    public static void main(String[] args) {
        Studente elemento1 = new Studente("Mario", 20);
        Studente elemento2 = new Studente("Giuseppe", 204);
        Studente elemento3 = new Studente("Alfonso", 535);
        Studente elemento4 = new Studente("Bernardo", 18);
        Studente elemento5 = new Studente("Camillo", 21);
        Studente elemento6 = new Studente("Davide", 45);
        Studente elemento7 = new Studente("Ernesto", 43);
        Studente elemento8 = new Studente("Filippo", 76);
        Studente elemento9 = new Studente("Gianmarco", 66);
        Studente elemento10 = new Studente("Icaro", 23);
        Studente elemento11= new Studente("Livorno", 11);
        Studente elemento12= new Studente("Nico", 31);

        List<Studente> lista = Arrays.asList(elemento1,elemento2,elemento3,elemento4,elemento5,elemento6,elemento7,elemento8,elemento9,elemento10,elemento11,elemento12);

        lista.sort(Comparator.comparing(Studente::getName));
        System.out.println(lista);


        /* come faccio a non stampare le due parentesi quadre all inizio e alla fine???
        * Ho pensato ad usare StringBuilder, but se esiste un'altro metodo piu semplice....
        *  */
    }
}
