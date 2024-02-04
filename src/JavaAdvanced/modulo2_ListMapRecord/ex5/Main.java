package JavaAdvanced.modulo2_ListMapRecord.ex5;

import java.util.*;

/*Creare un hashmap prendere tutti i valori, ordinarli e stamparli*/
public class Main {
    public static void main(String[] args) {
        CreateAndPrint();
    }
    public static void CreateAndPrint(){
        Map<Integer, String> Q1 = new LinkedHashMap<>(Map.ofEntries(
                new AbstractMap.SimpleEntry<>(1,"Max Verstappen"),
                new AbstractMap.SimpleEntry<>(2,"Lewis Hamilton"),
                new AbstractMap.SimpleEntry<>(3,"Charles Leclerc")

        ));
        System.out.println("Qualifica: " + Q1);

    }
}

