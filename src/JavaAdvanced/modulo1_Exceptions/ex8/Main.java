package JavaAdvanced.modulo1_Exceptions.ex8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* Scrivere una funzione che restituisca un HashSet riempito
Creare un oggetto dello stesso tipo inserito nell'HashSet e popolarlo
Verificare che l' elemento sia parte del Set e stampare il risultato*/
public class Main {
    public static void main(String[] args) {
        Set<String> hashset = hashset();
        String notebook = "Pavilion";
        String notebook2 = "xps";
        if(hashset().contains(notebook2)){
            System.out.println("Elemento contenuto");
        } else {
            System.out.println("Elemento non contenuto");
        }
    }
    public static Set<String> hashset (){
        HashSet<String> notebookSet = new HashSet<String>(Arrays.asList("Zenbook14","Macbook air","xps"));
        return notebookSet;

    }

}
