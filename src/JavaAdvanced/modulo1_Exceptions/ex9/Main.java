package JavaAdvanced.modulo1_Exceptions.ex9;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* Scrivere una funzione che restituisca un hashset riempito
Creare un oggeto dello stesso tipo inserito nell'HashSet e popolarlo
Scorrere il set, per ogni elemento verificare se è uguale all'oggetto creato ed eliminarlo
Svuotare l'hashset, verificarlo e stampare il risultato*/
public class Main {
    public static void main(String[] args) {

        HashSet();
    }
    public static void HashSet(){
        HashSet<String> lista = new HashSet<String>(Arrays.asList("Pane","Latte","Cereali"));
        String pane = "Pane"; // Questo è un'oggetto !!

        Iterator<String> iterator = lista.iterator();
        while(iterator.hasNext()){
            if(pane == iterator.next()){
                lista.remove(pane);
            }

        }
        System.out.println(lista);
    }

}
