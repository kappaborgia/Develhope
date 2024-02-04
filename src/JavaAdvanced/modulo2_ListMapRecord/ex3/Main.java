package JavaAdvanced.modulo2_ListMapRecord.ex3;

import java.util.ArrayList;
import java.util.List;

/*Creare una classe Fruit che accenti nel costruttore il parametro name (String)
In questa classe avere i metodi pubblici per ottenere le informazioni.
Creare un LinkedList con elementi e stamparlo in console.
Aggiungere un elemento al primo posto della lista e uno all'ultimo
Stampare la collezione aggiornata*/
public class Main {
    public static void main(String[] args) {
        Fruit frutta = new Fruit("Mela"); 
        Fruit frutta2 = new Fruit("Pera");
        Fruit frutta3 = new Fruit("Albicocca");
        List<Fruit> lista = new ArrayList<Fruit>();
        lista.add(frutta);
        lista.add(frutta2);
        lista.add(frutta3);
        System.out.println(lista);
        lista.add(0,new Fruit("Arance"));
        lista.add(4,new Fruit("Banana"));
        System.out.println(lista);
    }
}

/* Da rivedere, provare ad usare l'interfaccia */
